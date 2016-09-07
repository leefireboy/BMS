/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.entity;

import java.util.Date;

/**
 * <P>
 * Description:秒杀成功信息表
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月13日下午3:31:20
 */
public class SuccessKilled {

    private long seckillId;

    private long userPhone;

    private short state;

    private Date creatTime;

    private Seckill seckill;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
                + ", creatTime=" + creatTime + ", seckill=" + seckill + "]";
    }

}
