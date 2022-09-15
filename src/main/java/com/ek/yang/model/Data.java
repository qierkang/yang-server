package com.ek.yang.model;

import lombok.AllArgsConstructor;

/**
 * @author ErKang
 * @date Created in 2022/9/15 17:33
 * @title MapDataController.java
 * Department: Product development
 */
@lombok.Data
@AllArgsConstructor
public class Data {
    String id;
    Integer map_id;
    String updated_at;
    String map_data;
    String created_at;
}
