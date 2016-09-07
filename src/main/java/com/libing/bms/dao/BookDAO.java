/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dao;

import java.util.List;

import com.libing.bms.entity.Book;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午4:34:14
 */
public interface BookDAO {

    List<Book> queryAll();

}
