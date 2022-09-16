package com.ek.yang.response;

import lombok.Data;

/**
 * @author ErKang
 * @date Created in 2022/9/15 17:33
 * @title MapDataController.java
 * Department: Product development
 */
@Data
public class User {
    Integer state = 2;
    Integer first = 0;
    Integer uid = 114514;
    String nickname = "薯条";
    Integer time = 114514;
    String avatar = "https://baidu.com";
    Integer skin = 1;
    String city = "江苏省";
    String region = "南京市";
    Integer role = 2;
    Integer ts = Math.toIntExact(System.currentTimeMillis()/1000);
    Integer fail = 114514;
    Integer gender = 0;
}
