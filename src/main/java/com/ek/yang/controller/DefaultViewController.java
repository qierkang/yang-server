package com.ek.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 默认欢迎页面
 * @author ErKang
 * @date Created in 2021/12/9 03:48
 * @title DefaultViewController.java
 * Department: Product development
 */
@Controller
public class DefaultViewController {

    /**
     * Description: [ 项目启动默认页面 ]
     *
     * @param
     * @return java.lang.String
     * @Author <a href="mailto:xyqierkang@gmail.com">ErKang Qi</a>
     * @Date Created in 2020/5/27 19:28
     * <p>File:  </p>
     */
    @RequestMapping("/default")
    public String index() {
        return "default";
    }

    /**
     * 项目手动抛异常500
     * @author ErKang
     * @return java.lang.String
     * 2022/9/15 18:01
     */
    @RequestMapping("/exception")
    public String exceptionTest() {
        int i = 1 / 0;
        return "default";
    }
}