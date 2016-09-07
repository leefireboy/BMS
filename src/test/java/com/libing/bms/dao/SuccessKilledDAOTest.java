/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libing.bms.entity.SuccessKilled;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日上午11:37:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉 junit spring 配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDAOTest {

    @Resource
    private SuccessKilledDAO successKilledDAO;

    @Test
    public void testInsertSuccessKilled() {
        int insertCount = successKilledDAO.insertSuccessKilled(1L, 15620230370L);
        System.out.println(insertCount);
    }

    @Test
    public void testQueryByIdWithSeckill() {
        SuccessKilled successKilled = successKilledDAO.queryByIdWithSeckill(1L, 15620230370L);
        System.out.println(successKilled);
    }

}

