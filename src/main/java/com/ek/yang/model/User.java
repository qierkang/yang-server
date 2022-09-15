package com.ek.yang.model;

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
    String nickname = "田所浩二";
    Integer time = 114514;
    String avatar = "https://baidu.com";
    Integer skin = 1;
    String city = "下北泽";
    String region = "东京都";
    Integer role = 2;
    Integer ts = Math.toIntExact(System.currentTimeMillis()/1000);
    Integer fail = 114514;
    Integer gender = 0;
}
