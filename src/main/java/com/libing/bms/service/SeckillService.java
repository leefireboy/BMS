/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.service;

import java.util.List;

import com.libing.bms.dto.Exposer;
import com.libing.bms.dto.SeckillExecution;
import com.libing.bms.entity.Seckill;
import com.libing.bms.exception.RepeatKillException;
import com.libing.bms.exception.SeckillCloseException;
import com.libing.bms.exception.SeckillException;

/**
 * <P>
 * Description:秒杀业务接口
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午6:57:35
 */
public interface SeckillService {

    /**
     * <P>
     * Description:查询所有秒杀记录
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月14日下午7:00:36
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * <P>
     * Description:查询单个秒杀记录
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月14日下午7:00:30
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * <P>
     * Description:秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月14日下午6:59:34
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * <P>
     * Description:执行秒杀操作
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月14日下午7:11:09
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillCloseException, RepeatKillException, SeckillException;

}
