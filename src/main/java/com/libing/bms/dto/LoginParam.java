package com.libing.bms.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by libing on 2016/11/4.
 */
public class LoginParam {

    /**
     * 登录用户名
     */
    @NotEmpty
    private String loginName;

    /**
     * 登录密码
     */
    @NotEmpty
    private String loginPassword;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "LoginParam{" +
                "loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }

}
