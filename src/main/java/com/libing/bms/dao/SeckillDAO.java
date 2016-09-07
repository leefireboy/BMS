/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.libing.bms.entity.Seckill;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月13日下午3:33:53
 */
public interface SeckillDAO {

    /**
     * <P>
     * Description:减库存
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月13日下午3:35:17
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * <P>
     * Description:根据 id 查询秒杀对象
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月13日下午3:36:43
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * <P>
     * Description:根据偏移量查询秒杀商品列表
     * </p>
     * @author libing
     * @version 1.0
     * @Date 2016年7月13日下午3:37:12
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
