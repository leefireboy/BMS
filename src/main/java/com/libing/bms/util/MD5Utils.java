package com.libing.bms.util;

import org.springframework.util.DigestUtils;

/**
 * MD5 工具类
 * Created by libing on 2016/11/4.
 */
public class MD5Utils {

    private static final String SALT = "23(*(HFnlfwoei):L|++(~*FLKA,.<>NNfa.,po";

    /**
     * 对传入参数拼接盐值进行 MD5 加密
     * @param resource 加密源数据
     * @return
     */
    public static String getMD5(String resource) {
        resource = SALT + resource;
        return DigestUtils.md5DigestAsHex(resource.getBytes());
    }

}
