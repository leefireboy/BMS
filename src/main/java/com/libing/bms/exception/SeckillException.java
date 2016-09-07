/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.exception;

/**
 * <P>
 * Description:秒杀相关业务异常
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午7:21:37
 */
public class SeckillException extends RuntimeException {

    private static final long serialVersionUID = -4691293309435912443L;

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

}
