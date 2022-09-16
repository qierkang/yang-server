/*
 * @(#)com.ek.yang.model 2022/9/16 10:25
 * @Author <a href="mailto:xyqierkang@gmail.com">ErKang Qi</a>
 * @Blog：https://www.qekang.com
 * Copyright (c) 2019-2022 Shanghai
 * All rights reserved.

 * This software is the confidential and proprietary information of
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 */
package com.ek.yang.response;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ErKang
 * @date Created in 2022/9/15 17:33
 * @title MapDataController.java
 * Department: Product development
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class RespInfoResponse implements Serializable {

    private static final Integer ZERO = 0;
    /**
     * user
     */
    private UserDTO user;
    /**
     * list
     */
    private ArrayList list;

    public static RespInfoResponse getRespInfoDto() {
        RespInfoResponse rankInfoDto = new RespInfoResponse();
        RespInfoResponse.UserDTO userDTO = new RespInfoResponse.UserDTO();
        userDTO.setIndex(ZERO);
        RespInfoResponse.UserDTO.ItemDTO itemDTO = new RespInfoResponse.UserDTO.ItemDTO();
        itemDTO.setWin_score(ZERO);
        itemDTO.setFail_score(ZERO);
        itemDTO.setAll_score(ZERO);
        userDTO.setItem(itemDTO);
        rankInfoDto.setUser(userDTO);
        return rankInfoDto;
    }

    /**
     * UserDTO
     */
    @NoArgsConstructor
    @Data
    public static class UserDTO {
        /**
         * index
         */
        private Integer index = 0;
        /**
         * item
         */
        private ItemDTO item;
        /**
         * ItemDTO
         */
        @NoArgsConstructor
        @Data
        public static class ItemDTO {
            /**
             * name
             */
            private String name;
            /**
             * pinyin
             */
            private String pinyin;
            /**
             * winScore
             */
            private Integer win_score = ZERO;
            /**
             * failScore
             */
            private Integer fail_score = ZERO;
            /**
             * allScore
             */
            private Integer all_score = ZERO;
            /**
             * result
             */
            private String result;
        }
    }
}
