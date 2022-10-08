package com.ek.yang.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author ErKang
 * @date Created in 2022/9/22 17:59
 * @title ParameterRequestWrapper.java
 * Department: Product development
 */
@Data
@SuppressWarnings("all")
public class TopicRank {
    List<?> tomb = new ArrayList<>();
    List<?> taoist = new ArrayList<>();
    Integer tomb_fail_count = 1234;
    Integer tomb_fail_member = 1235;
    Integer taoist_fail_count = 1224;
    Integer taoist_fail_member = 1134;
}
