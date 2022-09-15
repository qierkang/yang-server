package com.ek.yang.requeset;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ErKang
 * @date Created in 2022/9/15 17:33
 * @title MapDataController.java
 * Department: Product development
 */
@Data
@AllArgsConstructor
public class Response<T> {
    Integer err_code;
    String err_msg;
    T data;
}
