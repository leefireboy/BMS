/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.exception;

/**
 * <P>
 * Description:秒杀关闭异常
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午7:20:15
 */
public class SeckillCloseException extends SeckillException {

    private static final long serialVersionUID = -622866402069505837L;

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }

}
