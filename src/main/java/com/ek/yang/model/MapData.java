package com.ek.yang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ErKang
 * @date Created in 2022/9/22 17:59
 * @title ParameterRequestWrapper.java
 * Department: Product development
 */
@Data
@AllArgsConstructor
public class MapData {
    String id;
    Integer map_id;
    String updated_at;
    String map_data;
    String created_at;
}
