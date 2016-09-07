/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.entity;

import java.util.Date;

/**
 * <P>
 * Description:借阅信息
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午4:24:41
 */
public class BorrowInfo {

    private Long id;

    private Long userId;

    private String userName;

    private Long bookId;

    private String bookName;

    private Date borrowDate;

    private Date returnDate;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BorrowInfo [id=" + id + ", userId=" + userId + ", userName=" + userName + ", bookId=" + bookId
                + ", bookName=" + bookName + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate
                + ", createTime=" + createTime + "]";
    }

}
