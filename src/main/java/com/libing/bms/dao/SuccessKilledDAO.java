/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dao;

import org.apache.ibatis.annotations.Param;

import com.libing.bms.entity.SuccessKilled;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月13日下午3:34:21
 */
public interface SuccessKilledDAO {

    /**
     * <P>
     * Description:插入购买明细，可过滤重复
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月13日下午3:39:43
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * <P>
     * Description:根据 id 查询秒杀信息并且携带秒杀产品对象
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月13日下午3:40:23
     * @param seckillId
     * @param userPhone
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
