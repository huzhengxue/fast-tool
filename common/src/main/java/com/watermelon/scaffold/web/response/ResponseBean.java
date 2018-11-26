package com.watermelon.scaffold.web.response;

import java.io.Serializable;

public class ResponseBean<T> implements Serializable{

    private static final long serialVersionUID = 4138151254332082822L;

    private String msg;

    private String code;

    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
