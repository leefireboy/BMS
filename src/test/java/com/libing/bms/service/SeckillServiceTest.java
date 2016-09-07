/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libing.bms.dto.Exposer;
import com.libing.bms.dto.SeckillExecution;
import com.libing.bms.entity.Seckill;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午9:18:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void testGetSeckillList() {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list={}", list);
    }

    @Test
    public void testGetById() {
        Long seckillId = 1L;
        Seckill seckill = seckillService.getById(seckillId);
        logger.info("seckill={}", seckill);
    }

    @Test
    public void testExportSeckillUrl() {
        long seckillId = 1L;
        Exposer exposer = seckillService.exportSeckillUrl(seckillId);
        logger.info("exposer={}", exposer);
        // md5=16a0094bf269cb343c234c22c4625435
    }

    @Test
    public void testExecuteSeckill() {
        long seckillId = 1L;
        long userPhone = 12345678900L;
        String md5 = "16a0094bf269cb343c234c22c4625435";
        SeckillExecution execution = seckillService.executeSeckill(seckillId, userPhone, md5);
        logger.info("result={}", execution);
    }

}
