package com.ek.yang.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 统一出参
 * @author ErKang
 * @date Created in 2021/12/5 04:44
 * @title BaseResponse.java
 * Department: Product development
 */
@Setter
@Getter
@ToString
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String OK = "0";
    public static final String ERROR = "99999";
    public static final String ERROR_MSG = "系统异常";
    public static final String OK_MSG = "OK";

    public static final String ERROR_TOKEN_NO = "没有权限";//no token mes
    public static final String TOKEN_ERROR = "10003";//no token mes
    private String err_code; // 默认无异常

    private String err_msg;

    private T data;

    public BaseResponse() {
        this.err_code = OK;
        this.err_msg = OK_MSG;
    }

    public BaseResponse(T data) {
        this.err_code = OK;
        this.err_msg = OK_MSG;
        this.data = data;
    }

    public BaseResponse(String status, String msg) {
        this.err_code = status;
        this.err_msg = msg;
    }

    public static BaseResponse error(String msg) {
        BaseResponse BaseResponse = new BaseResponse();
        BaseResponse.err_code = ERROR;
        BaseResponse.err_msg = msg;
        return BaseResponse;
    }

    public static BaseResponse error(String code, String msg) {
        BaseResponse BaseResponse = new BaseResponse();
        BaseResponse.err_code = code;
        BaseResponse.err_msg = msg;
        return BaseResponse;
    }

    public static BaseResponse error() {
        BaseResponse BaseResponse = new BaseResponse();
        BaseResponse.err_code = ERROR;
        BaseResponse.err_msg = ERROR_MSG;
        return BaseResponse;
    }

    public static BaseResponse success() {
        BaseResponse BaseResponse = new BaseResponse();
        BaseResponse.err_code = OK;
        return BaseResponse;
    }

    public static BaseResponse success(Object data) {
        BaseResponse BaseResponse = new BaseResponse();
        BaseResponse.err_code = OK;
        BaseResponse.data = data;
        return BaseResponse;
    }

    public static BaseResponse errorNoToken() {
        BaseResponse BaseResponse = new BaseResponse();
        BaseResponse.err_code = TOKEN_ERROR;
        BaseResponse.err_msg = ERROR_TOKEN_NO;
        return BaseResponse;
    }
}
