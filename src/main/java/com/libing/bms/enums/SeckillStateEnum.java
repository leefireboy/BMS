/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.enums;

/**
 * <P>
 * Description:使用枚举表示常量数据词典
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午8:20:09
 */
public enum SeckillStateEnum {
    SUCCESS(1, "秒杀成功"),
    END(0, "秒杀结束"),
    REPEAT_KILL(-1, "重复秒杀"),
    INNER_ERROR(-2, "系统异常"),
    DATA_REWRITE(-3, "数据篡改");

    private int state;

    private String stateInfo;

    private SeckillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static SeckillStateEnum stateOf(int index) {
        for (SeckillStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

}
