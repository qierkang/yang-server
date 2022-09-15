package com.ek.yang;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 服务启动
 * @author ErKang
 * @date Created in 2022/9/15 17:50
 * @title YangServerApplication.java
 * Department: Product development
 */
@Slf4j
@SpringBootApplication
public class YangServerApplication {

    public static void main(String[] args) {
        TimeInterval timer = DateUtil.timer();
        ConfigurableApplicationContext run = SpringApplication.run(YangServerApplication.class, args);
        WebServer webServer = ((AnnotationConfigServletWebServerApplicationContext) run).getWebServer();
        log.info("Service Startup success：https://{}:{}", NetUtil.localIpv4s().iterator().next(), webServer.getPort());
        log.info("Spring boot 启动初始化了 {} 个 Bean, ->> 请求耗时：{}秒", run.getBeanDefinitionNames().length, timer.intervalSecond());

    }

    @PostConstruct
    private void init() {
        try {
            log.info("初始化logback打印info：{}", LocalDateTime.now());
            log.debug("初始化logback打印debug：{}", LocalDateTime.now());
            log.trace("初始化logback打印trace：{}", LocalDateTime.now());
            log.warn("初始化logback打印warn：{}", LocalDateTime.now());
            log.error("初始化logback打印error：{}", LocalDateTime.now());
            MDC.put("localIp", NetUtil.getLocalhostStr());
            log.info("#初始化randomUUID [{}]", IdUtil.randomUUID());
        } catch (Exception e) {
            log.error("#初始化配置错误！");
        }
    }

}
