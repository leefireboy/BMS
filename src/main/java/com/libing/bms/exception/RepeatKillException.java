/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.exception;

/**
 * <P>
 * Description:重复秒杀异常（运行期异常）
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午7:16:18
 */
public class RepeatKillException extends SeckillException {
    
    private static final long serialVersionUID = 6051700348998688213L;

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }

}
