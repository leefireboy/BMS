package com.libing.bms.dao;

import com.libing.bms.entity.User;

import java.util.List;

/**
 * Created by libing on 2016/11/13.
 */
public interface UserDAO {

    List<User> list();

    User queryById(Long id);

    long insert(User user);

    long deleteById(Long id);

    long update(User user);

}
