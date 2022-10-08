package com.ek.yang.model;

import lombok.Data;

/**
 * @author ErKang
 * @date Created in 2022/9/22 17:59
 * @title ParameterRequestWrapper.java
 * Department: Product development
 */
@Data
public class TopicInfo {
    String nick_name = "";
    String avatar = "";
    Integer uid = 0;
    Integer state = 0;
    Integer time = 0;
    Integer ts = 0;
    Integer fail = 0;
    Integer type = 0;
    String city = "";
}
