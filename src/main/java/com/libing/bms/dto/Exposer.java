/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.bms.dto;

/**
 * <P>
 * Description:暴露秒杀地址 DTO
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月14日下午7:02:57
 */
public class Exposer {

    // 秒杀是否开始
    private boolean exposed;

    // 加密措施
    private String md5;

    // 秒杀商品 ID
    private long seckillId;

    // 系统当前时间（毫秒）
    private long now;

    // 开始时间
    private long start;

    // 结束时间
    private long end;

    public Exposer(boolean exposed, String md5, long seckillId) {
        super();
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed, long seckillId, long now, long start, long end) {
        super();
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    public Exposer(boolean exposed, long seckillId) {
        super();
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Exposer [exposed=" + exposed + ", md5=" + md5 + ", seckillId=" + seckillId + ", now=" + now
                + ", start=" + start + ", end=" + end + "]";
    }

}
