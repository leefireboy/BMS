/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.entity;

import java.util.Date;

/**
 * <P>
 * Description:书籍
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午4:19:49
 */
public class Book {

    private Long id;

    private Integer storeId;

    private String name;

    private String author;

    private String press;

    private Date publicTime;

    private Double price;

    private String remark;

    private Integer state;

    private Date storeTime;

    private Long stateModifyId;

    private String stateModifyName;

    private Integer deleteFlag;

    private Date deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(Date storeTime) {
        this.storeTime = storeTime;
    }

    public Long getStateModifyId() {
        return stateModifyId;
    }

    public void setStateModifyId(Long stateModifyId) {
        this.stateModifyId = stateModifyId;
    }

    public String getStateModifyName() {
        return stateModifyName;
    }

    public void setStateModifyName(String stateModifyName) {
        this.stateModifyName = stateModifyName;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", storeId=" + storeId + ", name=" + name + ", author=" + author + ", press=" + press
                + ", publicTime=" + publicTime + ", price=" + price + ", remark=" + remark + ", state=" + state
                + ", storeTime=" + storeTime + ", stateModifyId=" + stateModifyId + ", stateModifyName="
                + stateModifyName + ", deleteFlag=" + deleteFlag + ", deleteTime=" + deleteTime + "]";
    }

}
