/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libing.bms.entity.Book;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午4:37:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉 junit spring 配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BookDAOTest {

    @Resource
    private BookDAO bookDAO;

    @Test
    public void testQueryAll() {
        List<Book> books = bookDAO.queryAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

}

