/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libing.bms.entity.Seckill;

/**
 * <P>
 * Description:配置 spring 和 junit 整合，junit 启动时加载 springIOC 容器
 * spring-test, junit
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日上午10:31:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉 junit spring 配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDAOTest {

    @Resource
    private SeckillDAO seckillDAO;

    @Test
    public void testReduceNumber() {
        int updateCount = seckillDAO.reduceNumber(1, new Date());
        System.out.println(updateCount);
    }

    @Test
    public void testQueryById() {
        Seckill seckill = seckillDAO.queryById(1L);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void testQueryAll() {
        List<Seckill> list = seckillDAO.queryAll(0, 10);
        System.out.println(list);
    }

}

