/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dto;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月16日下午10:29:16
 */
// 所有 ajax请求返回类型，封装 json 结果
public class SeckillResult<T> {

    private boolean success;

    private T data;

    private String error;

    public SeckillResult(boolean success, T data) {
        super();
        this.success = success;
        this.data = data;
    }

    public SeckillResult(boolean success, String error) {
        super();
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
