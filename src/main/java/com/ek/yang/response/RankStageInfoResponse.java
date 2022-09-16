/*
 * @(#)com.ek.yang.model 2022/9/16 10:43
 * @Author <a href="mailto:xyqierkang@gmail.com">ErKang Qi</a>
 * @Blog：https://www.qekang.com
 * Copyright (c) 2019-2022 Shanghai
 * All rights reserved.

 * This software is the confidential and proprietary information of
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 */
package com.ek.yang.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ErKang
 * @date Created in 2022/9/15 17:33
 * @title MapDataController.java
 * Department: Product development
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("all")
public class RankStageInfoResponse {
    private static final Integer ZERO = 0;
    /**
     * firstWin
     */
    private FirstWinDTO firstWin;
    /**
     * iqWin
     */
    private FirstWinDTO iqWin;
    /**
     * timeWin
     */
    private FirstWinDTO timeWin;

    public static RankStageInfoResponse getRankStageInfoDto() {
        RankStageInfoResponse rankStageInfoDto = new RankStageInfoResponse();
        FirstWinDTO firstWin = new FirstWinDTO();
        FirstWinDTO iqWin = new FirstWinDTO();
        FirstWinDTO timeWin = new FirstWinDTO();
        rankStageInfoDto.setFirstWin(firstWin);
        rankStageInfoDto.setIqWin(iqWin);
        rankStageInfoDto.setTimeWin(timeWin);
        return rankStageInfoDto;
    }

    /**
     * FirstWinDTO
     */
    @NoArgsConstructor
    @Data
    public static class FirstWinDTO {
        /**
         * nickName
         */
        private String nick_name="";
        /**
         * avatar
         */
        private String avatar="";
        /**
         * region
         */
        private String region="";
        /**
         * city
         */
        private String city="";
        /**
         * uid
         */
        private Integer uid = ZERO;
        /**
         * state
         */
        private Integer state = ZERO;
        /**
         * time
         */
        private Integer time = ZERO;
        /**
         * role
         */
        private Integer role = ZERO;
        /**
         * gender
         */
        private Integer gender = ZERO;
        /**
         * first
         */
        private Integer first = ZERO;
        /**
         * ts
         */
        private Integer ts = ZERO;
        /**
         * fail
         */
        private Integer fail = ZERO;
        /**
         * skin
         */
        private Integer skin = ZERO;
    }
}
