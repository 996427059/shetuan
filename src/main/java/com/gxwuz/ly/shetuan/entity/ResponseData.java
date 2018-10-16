package com.gxwuz.ly.shetuan.entity;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {
    private Integer code;
    private Iterable<T> datas;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Iterable<T> getDatas() {
        return datas;
    }

    public void setDatas(Iterable<T> datas) {
        this.datas = datas;
    }
}
