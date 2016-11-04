package com.libing.bms.dao;

import com.libing.bms.entity.BorrowInfo;

import java.util.List;

/**
 * Created by libing on 2016/11/4.
 */
public interface BorrowInfoDAO {

    List<BorrowInfo> list();

    BorrowInfo queryById(Long id);

    long insert(BorrowInfo borrowInfo);

    long deleteById(Long id);

    long update(BorrowInfo borrowInfo);

}
