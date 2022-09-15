package com.ek.yang.config;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 默认首页设置
 * @author ErKang
 * @date Created in 2022/9/15 17:59
 * @title SpringBootWebConfig.java
 * Department: Product development
 */
@Configuration
public class SpringBootWebConfig extends WebMvcConfigurationSupport {

    @Value("${spring.jackson.date-format:yyyy-MM-dd HH:mm:ss}")
    private String patternDate;

    @Bean
    public RequestInterceptor getRequestInterceptor() {
        return new RequestInterceptor();
    }

    /* (非 Javadoc)
     * <p>Title: addInterceptors</p>
     * <p>Description: </p>
     * @param registry
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config
     * .annotation.InterceptorRegistry)
     *初始化拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getRequestInterceptor()).addPathPatterns("/sheep/**");
        super.addInterceptors(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/default");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    // 方案一
    @Bean
    public LocalDateTimeSerializer localDateTimeDeserializer() {
        return new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(patternDate));
    }

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        return builder -> builder.serializerByType(LocalDateTime.class, localDateTimeDeserializer());
    }
}