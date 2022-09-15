package com.ek.yang.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * 拦截器 验证所有请求权限
 * @author ErKang
 * @date Created in 2021/12/9 02:55
 * @title RequestInterceptor.java
 * Department: Product development
 */
@Slf4j
@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        return true;
    }
}
