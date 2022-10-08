package com.ek.yang.model;

import lombok.Data;

/**
 * @author ErKang
 * @date Created in 2022/9/22 17:59
 * @title ParameterRequestWrapper.java
 * Department: Product development
 */
@Data
public class TopicData {
    String name = "僵尸#道士";
    Integer id = 0;
    String ts = "20220917";
    Integer tomb = 0;
    Integer taoist = 0;
    TopicInfo info;
}
