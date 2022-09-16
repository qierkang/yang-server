package com.ek.yang.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ErKang
 * @date Created in 2022/9/15 17:33
 * @title MapDataController.java
 * Department: Product development
 */
@lombok.Data
@Accessors(chain = true)
@AllArgsConstructor
public class Data implements Serializable {
    String id;
    Integer map_id;
    String updated_at;
    String map_data;
    String created_at;
}
