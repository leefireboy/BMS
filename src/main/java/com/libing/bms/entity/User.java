/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.entity;

import java.util.Date;

/**
 * <P>
 * Description:用户
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午4:19:41
 */
public class User {

    private Long id;

    private String name;

    private Integer sex;

    private Long phone;

    private String remark;

    private Date createTime;

    private Date modifyTime;

    private Integer deleteFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", remark=" + remark
                + ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", deleteFlag=" + deleteFlag + "]";
    }

}
