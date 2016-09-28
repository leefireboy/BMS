/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import com.libing.bms.dao.SeckillDAO;
import com.libing.bms.dao.SuccessKilledDAO;
import com.libing.bms.dto.Exposer;
import com.libing.bms.dto.SeckillExecution;
import com.libing.bms.entity.Seckill;
import com.libing.bms.entity.SuccessKilled;
import com.libing.bms.enums.SeckillStateEnum;
import com.libing.bms.exception.RepeatKillException;
import com.libing.bms.exception.SeckillCloseException;
import com.libing.bms.exception.SeckillException;
import com.libing.bms.service.SeckillService;

/**
 * <P>
 * Description:秒杀业务实现类
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午7:27:02
 */
@Service
public class SeckillServiceImpl implements SeckillService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillDAO seckillDAO;

    @Autowired
    private SuccessKilledDAO successKilledDAO;

    // MD5 盐值字符串，用于混淆 MD5
    private final String slat = "lkfdajd;facakldfja;dfkj12ej31'`1&~)(~`-";

    @Override
    public List<Seckill> getSeckillList() {
        return seckillDAO.queryAll(0, 4);
    }

    @Override
    public Seckill getById(long seckillId) {
        return seckillDAO.queryById(seckillId);
    }

    @Override
    public Exposer exportSeckillUrl(long seckillId) {
        Seckill seckill = seckillDAO.queryById(seckillId);
        if (seckill == null) {
            return new Exposer(false, seckillId);
        }

        Date startTime = seckill.getStartTime();
        Date endTime = seckill.getEndTime();
        Date nowTime = new Date();

        if (nowTime.getTime() < startTime.getTime() || nowTime.getTime() > endTime.getTime()) {
            return new Exposer(false, seckillId, nowTime.getTime(), startTime.getTime(), endTime.getTime());
        }

        // 转换特定字符串的过程，不可逆
        String md5 = getMD5(seckillId);
        return new Exposer(true, md5, seckillId);
    }

    private String getMD5(long seckillId) {
        String base = seckillId + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

    @Override
    @Transactional
    public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillCloseException,
            RepeatKillException, SeckillException {
        if (md5 == null || !md5.equals(getMD5(seckillId))) {
            throw new SeckillException("seckill data rewrite");
        }
        // 执行秒杀逻辑
        Date nowTime = new Date();
        try {
            int updateCount = seckillDAO.reduceNumber(seckillId, nowTime);
            if (updateCount <= 0) {
                // 没有更新到记录
                throw new SeckillCloseException("seckill was closed");
            } else {
                // 记录购买行为
                int insertCount = successKilledDAO.insertSuccessKilled(seckillId, userPhone);
                if (insertCount <= 0) {
                    throw new RepeatKillException("seckill repeated");
                } else {
                    // chenggong
                    SuccessKilled successKilled = successKilledDAO.queryByIdWithSeckill(seckillId, userPhone);
                    return new SeckillExecution(seckillId, SeckillStateEnum.SUCCESS, successKilled);
                }
            }
        } catch (SeckillCloseException e1) {
            throw e1;
        } catch (RepeatKillException e2) {
            throw e2;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // 所有编译期异常转化为运行期异常
            throw new SeckillException("seckill inner error:" + e.getMessage());
        }
    }

}
