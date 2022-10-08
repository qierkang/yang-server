package com.ek.yang.config;

import com.ek.yang.model.MapData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @author ErKang
 * @date Created in 2022/9/22 17:59
 * @title ParameterRequestWrapper.java
 * Department: Product development
 */
@Configuration
public class GlobalConfig {
    @Value("${sheep.hard-code}")
    public boolean hardCode;

    @Value("${topic.id}")
    public int topicId;
    @Value("${topic.name}")
    public String topicName;

    public static HashMap<Integer, MapData> gameMap = new HashMap<>();

    public int requested = 0;


}
