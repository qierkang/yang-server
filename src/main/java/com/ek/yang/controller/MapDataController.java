package com.ek.yang.controller;

import com.ek.yang.config.GlobalConfig;
import com.ek.yang.config.IDKWhatIsUtil;
import com.ek.yang.model.MapData;
import com.ek.yang.model.TopicData;
import com.ek.yang.model.TopicInfo;
import com.ek.yang.model.TopicRank;
import com.ek.yang.response.BaseResponse;
import com.ek.yang.response.RankStageInfoResponse;
import com.ek.yang.response.RespInfoResponse;
import com.ek.yang.response.Response;
import com.ek.yang.response.User;
import com.ek.yang.response.UserRankInfo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.annotation.Resource;

import lombok.NoArgsConstructor;

/**
 * @author ErKang
 * @date Created in 2022/9/15 17:33
 * @title MapDataController.java
 * Department: Product development
 */
@NoArgsConstructor
@lombok.Data
@RestController
@CrossOrigin
@RequestMapping("/sheep/v1/game")
public class MapDataController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private GlobalConfig config;

    @RequestMapping("/map_info")
    public BaseResponse<MapData> getMapData(@RequestParam("map_id") Integer id) throws IOException, URISyntaxException {
        BaseResponse<MapData> m_80001 = new BaseResponse<>(new MapData("62ccde7d3dd1931da84a84e2", 80001, "2022-09-14T15:53:23.508Z", "{\"widthNum" +
                "\":8,\"heightNum\":10,\"levelKey\":80001,\"blockTypeData\":{\"1\":2,\"4\":1,\"13\":2},\"levelData\":{\"1\":[{\"id\":\"1-16-16\"," +
                "\"type\":0,\"rolNum\":16,\"rowNum\":16,\"layerNum\":1,\"moldType\":1,\"blockNode\":null},{\"id\":\"1-28-16\",\"type\":0," +
                "\"rolNum\":28,\"rowNum\":16,\"layerNum\":1,\"moldType\":1,\"blockNode\":null},{\"id\":\"1-40-16\",\"type\":0,\"rolNum\":40," +
                "\"rowNum\":16,\"layerNum\":1,\"moldType\":1,\"blockNode\":null},{\"id\":\"1-16-32\",\"type\":0,\"rolNum\":16,\"rowNum\":32," +
                "\"layerNum\":1,\"moldType\":1,\"blockNode\":null},{\"id\":\"1-28-32\",\"type\":0,\"rolNum\":28,\"rowNum\":32,\"layerNum\":1," +
                "\"moldType\":1,\"blockNode\":null},{\"id\":\"1-40-32\",\"type\":0,\"rolNum\":40,\"rowNum\":32,\"layerNum\":1,\"moldType\":1," +
                "\"blockNode\":null},{\"id\":\"1-16-48\",\"type\":0,\"rolNum\":16,\"rowNum\":48,\"layerNum\":1,\"moldType\":2,\"blockNode\":null}," +
                "{\"id\":\"1-28-48\",\"type\":0,\"rolNum\":28,\"rowNum\":48,\"layerNum\":1,\"moldType\":2,\"blockNode\":null},{\"id\":\"1-40-48\"," +
                "\"type\":0,\"rolNum\":40,\"rowNum\":48,\"layerNum\":1,\"moldType\":2,\"blockNode\":null}],\"2\":[{\"id\":\"2-16-49\",\"type\":0," +
                "\"rolNum\":16,\"rowNum\":49,\"layerNum\":2,\"moldType\":2,\"blockNode\":null},{\"id\":\"2-28-49\",\"type\":0,\"rolNum\":28," +
                "\"rowNum\":49,\"layerNum\":2,\"moldType\":2,\"blockNode\":null},{\"id\":\"2-40-49\",\"type\":0,\"rolNum\":40,\"rowNum\":49," +
                "\"layerNum\":2,\"moldType\":2,\"blockNode\":null},{\"id\":\"2-16-20\",\"type\":1,\"rolNum\":16,\"rowNum\":20,\"layerNum\":2," +
                "\"moldType\":1,\"blockNode\":null},{\"id\":\"2-28-20\",\"type\":1,\"rolNum\":28,\"rowNum\":20,\"layerNum\":2,\"moldType\":1," +
                "\"blockNode\":null},{\"id\":\"2-40-20\",\"type\":1,\"rolNum\":40,\"rowNum\":20,\"layerNum\":2,\"moldType\":1,\"blockNode\":null}," +
                "{\"id\":\"2-16-36\",\"type\":0,\"rolNum\":16,\"rowNum\":36,\"layerNum\":2,\"moldType\":1,\"blockNode\":null},{\"id\":\"2-28-36\"," +
                "\"type\":0,\"rolNum\":28,\"rowNum\":36,\"layerNum\":2,\"moldType\":1,\"blockNode\":null},{\"id\":\"2-40-36\",\"type\":0," +
                "\"rolNum\":40,\"rowNum\":36,\"layerNum\":2,\"moldType\":1,\"blockNode\":null}]}}", "2022-07-12T02:37:49.515Z"));
        if (id == 80001) {
            return m_80001;
        }
        if (config.hardCode) {
            return new BaseResponse<>(new MapData("62ce3c318a2da751dba21fd8", id, "2022-09-14T11:28:28.327Z", "{\"widthNum\":8,\"heightNum\":10," +
                    "\"levelKey\": " + id + ",\"blockTypeData\":{\"1\":6,\"2\":6,\"3\":6,\"4\":6,\"5\":6,\"6\":6,\"7\":6,\"8\":7,\"9\":7,\"10\":7," +
                    "\"11\":6,\"12\":7,\"13\":6,\"14\":6,\"15\":7},\"levelData\":{\"1\":[{\"id\":\"1-28-20\",\"type\":0,\"rolNum\":28," +
                    "\"rowNum\":20,\"layerNum\":1,\"moldType\":1,\"blockNode\":null},{\"id\":\"1-8-52\",\"type\":0,\"rolNum\":8,\"rowNum\":52," +
                    "\"layerNum\":1,\"moldType\":2,\"blockNode\":null},{\"id\":\"1-48-52\",\"type\":0,\"rolNum\":48,\"rowNum\":52,\"layerNum\":1," +
                    "\"moldType\":2,\"blockNode\":null}],\"2\":[{\"id\":\"2-24-16\",\"type\":0,\"rolNum\":24,\"rowNum\":16,\"layerNum\":2," +
                    "\"moldType\":1,\"blockNode\":null},{\"id\":\"2-32-16\",\"type\":0,\"rolNum\":32,\"rowNum\":16,\"layerNum\":2,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"2-24-24\",\"type\":0,\"rolNum\":24,\"rowNum\":24,\"layerNum\":2,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"2-32-24\",\"type\":0,\"rolNum\":32,\"rowNum\":24,\"layerNum\":2,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"2-9-52\",\"type\":0,\"rolNum\":9,\"rowNum\":52,\"layerNum\":2,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"2-47-52\",\"type\":0,\"rolNum\":47,\"rowNum\":52,\"layerNum\":2,\"moldType\":2," +
                    "\"blockNode\":null}],\"3\":[{\"id\":\"3-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":3,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"3-28-28\",\"type\":0,\"rolNum\":28,\"rowNum\":28,\"layerNum\":3,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"3-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":3,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"3-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":3,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"3-10-52\",\"type\":0,\"rolNum\":10,\"rowNum\":52,\"layerNum\":3,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"3-46-52\",\"type\":0,\"rolNum\":46,\"rowNum\":52,\"layerNum\":3,\"moldType\":2," +
                    "\"blockNode\":null}],\"4\":[{\"id\":\"4-24-16\",\"type\":0,\"rolNum\":24,\"rowNum\":16,\"layerNum\":4,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"4-32-16\",\"type\":0,\"rolNum\":32,\"rowNum\":16,\"layerNum\":4,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"4-24-24\",\"type\":0,\"rolNum\":24,\"rowNum\":24,\"layerNum\":4,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"4-32-24\",\"type\":0,\"rolNum\":32,\"rowNum\":24,\"layerNum\":4,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"4-11-52\",\"type\":0,\"rolNum\":11,\"rowNum\":52,\"layerNum\":4,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"4-45-52\",\"type\":0,\"rolNum\":45,\"rowNum\":52,\"layerNum\":4,\"moldType\":2," +
                    "\"blockNode\":null}],\"5\":[{\"id\":\"5-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":5,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"5-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":5,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"5-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":5,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"5-28-28\",\"type\":0,\"rolNum\":28,\"rowNum\":28,\"layerNum\":5,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"5-12-52\",\"type\":0,\"rolNum\":12,\"rowNum\":52,\"layerNum\":5,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"5-44-52\",\"type\":0,\"rolNum\":44,\"rowNum\":52,\"layerNum\":5,\"moldType\":2," +
                    "\"blockNode\":null}],\"6\":[{\"id\":\"6-24-16\",\"type\":0,\"rolNum\":24,\"rowNum\":16,\"layerNum\":6,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"6-32-16\",\"type\":0,\"rolNum\":32,\"rowNum\":16,\"layerNum\":6,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"6-24-24\",\"type\":0,\"rolNum\":24,\"rowNum\":24,\"layerNum\":6,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"6-32-24\",\"type\":0,\"rolNum\":32,\"rowNum\":24,\"layerNum\":6,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"6-13-52\",\"type\":0,\"rolNum\":13,\"rowNum\":52,\"layerNum\":6,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"6-43-52\",\"type\":0,\"rolNum\":43,\"rowNum\":52,\"layerNum\":6,\"moldType\":2," +
                    "\"blockNode\":null}],\"7\":[{\"id\":\"7-28-20\",\"type\":0,\"rolNum\":28,\"rowNum\":20,\"layerNum\":7,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"7-14-52\",\"type\":0,\"rolNum\":14,\"rowNum\":52,\"layerNum\":7,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"7-42-52\",\"type\":0,\"rolNum\":42,\"rowNum\":52,\"layerNum\":7,\"moldType\":2," +
                    "\"blockNode\":null}],\"8\":[{\"id\":\"8-24-16\",\"type\":0,\"rolNum\":24,\"rowNum\":16,\"layerNum\":8,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"8-32-16\",\"type\":0,\"rolNum\":32,\"rowNum\":16,\"layerNum\":8,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"8-24-24\",\"type\":0,\"rolNum\":24,\"rowNum\":24,\"layerNum\":8,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"8-32-24\",\"type\":0,\"rolNum\":32,\"rowNum\":24,\"layerNum\":8,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"8-15-52\",\"type\":0,\"rolNum\":15,\"rowNum\":52,\"layerNum\":8,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"8-41-52\",\"type\":0,\"rolNum\":41,\"rowNum\":52,\"layerNum\":8,\"moldType\":2," +
                    "\"blockNode\":null}],\"9\":[{\"id\":\"9-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":9,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"9-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":9,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"9-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":9,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"9-28-28\",\"type\":0,\"rolNum\":28,\"rowNum\":28,\"layerNum\":9,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"9-16-52\",\"type\":0,\"rolNum\":16,\"rowNum\":52,\"layerNum\":9,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"9-40-52\",\"type\":0,\"rolNum\":40,\"rowNum\":52,\"layerNum\":9,\"moldType\":2," +
                    "\"blockNode\":null}],\"10\":[{\"id\":\"10-24-16\",\"type\":0,\"rolNum\":24,\"rowNum\":16,\"layerNum\":10,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"10-32-16\",\"type\":0,\"rolNum\":32,\"rowNum\":16,\"layerNum\":10,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"10-24-24\",\"type\":0,\"rolNum\":24,\"rowNum\":24,\"layerNum\":10,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"10-32-24\",\"type\":0,\"rolNum\":32,\"rowNum\":24,\"layerNum\":10,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"10-17-52\",\"type\":0,\"rolNum\":17,\"rowNum\":52,\"layerNum\":10,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"10-39-52\",\"type\":0,\"rolNum\":39,\"rowNum\":52,\"layerNum\":10,\"moldType\":2," +
                    "\"blockNode\":null}],\"11\":[{\"id\":\"11-20-12\",\"type\":0,\"rolNum\":20,\"rowNum\":12,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-36-12\",\"type\":0,\"rolNum\":36,\"rowNum\":12,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-20-28\",\"type\":0,\"rolNum\":20,\"rowNum\":28,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-28-28\",\"type\":0,\"rolNum\":28,\"rowNum\":28,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-36-28\",\"type\":0,\"rolNum\":36,\"rowNum\":28,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":11,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"11-18-52\",\"type\":0,\"rolNum\":18,\"rowNum\":52,\"layerNum\":11,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"11-38-52\",\"type\":0,\"rolNum\":38,\"rowNum\":52,\"layerNum\":11,\"moldType\":2," +
                    "\"blockNode\":null}],\"12\":[{\"id\":\"12-24-16\",\"type\":0,\"rolNum\":24,\"rowNum\":16,\"layerNum\":12,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"12-32-16\",\"type\":0,\"rolNum\":32,\"rowNum\":16,\"layerNum\":12,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"12-24-24\",\"type\":0,\"rolNum\":24,\"rowNum\":24,\"layerNum\":12,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"12-32-24\",\"type\":0,\"rolNum\":32,\"rowNum\":24,\"layerNum\":12,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"12-19-52\",\"type\":0,\"rolNum\":19,\"rowNum\":52,\"layerNum\":12,\"moldType\":2," +
                    "\"blockNode\":null},{\"id\":\"12-37-52\",\"type\":0,\"rolNum\":37,\"rowNum\":52,\"layerNum\":12,\"moldType\":2," +
                    "\"blockNode\":null}],\"13\":[{\"id\":\"13-20-12\",\"type\":0,\"rolNum\":20,\"rowNum\":12,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-36-12\",\"type\":0,\"rolNum\":36,\"rowNum\":12,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-20-28\",\"type\":0,\"rolNum\":20,\"rowNum\":28,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-28-28\",\"type\":0,\"rolNum\":28,\"rowNum\":28,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-36-28\",\"type\":0,\"rolNum\":36,\"rowNum\":28,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-28-20\",\"type\":0,\"rolNum\":28,\"rowNum\":20,\"layerNum\":13,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"13-20-52\",\"type\":0,\"rolNum\":20,\"rowNum\":52,\"layerNum\":13,\"moldType\":2," +
                    "\"blockNode\":null}],\"14\":[{\"id\":\"14-16-8\",\"type\":0,\"rolNum\":16,\"rowNum\":8,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-24-8\",\"type\":0,\"rolNum\":24,\"rowNum\":8,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-32-8\",\"type\":0,\"rolNum\":32,\"rowNum\":8,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-40-8\",\"type\":0,\"rolNum\":40,\"rowNum\":8,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-16-16\",\"type\":0,\"rolNum\":16,\"rowNum\":16,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-16-24\",\"type\":0,\"rolNum\":16,\"rowNum\":24,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-16-32\",\"type\":0,\"rolNum\":16,\"rowNum\":32,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-24-32\",\"type\":0,\"rolNum\":24,\"rowNum\":32,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-32-32\",\"type\":0,\"rolNum\":32,\"rowNum\":32,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-40-32\",\"type\":0,\"rolNum\":40,\"rowNum\":32,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-40-16\",\"type\":0,\"rolNum\":40,\"rowNum\":16,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"14-40-24\",\"type\":0,\"rolNum\":40,\"rowNum\":24,\"layerNum\":14,\"moldType\":1," +
                    "\"blockNode\":null}],\"15\":[{\"id\":\"15-12-4\",\"type\":0,\"rolNum\":12,\"rowNum\":4,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-20-4\",\"type\":0,\"rolNum\":20,\"rowNum\":4,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-28-4\",\"type\":0,\"rolNum\":28,\"rowNum\":4,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-36-4\",\"type\":0,\"rolNum\":36,\"rowNum\":4,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-44-4\",\"type\":0,\"rolNum\":44,\"rowNum\":4,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-12-12\",\"type\":0,\"rolNum\":12,\"rowNum\":12,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-12-20\",\"type\":0,\"rolNum\":12,\"rowNum\":20,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-44-12\",\"type\":0,\"rolNum\":44,\"rowNum\":12,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-44-20\",\"type\":0,\"rolNum\":44,\"rowNum\":20,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-20-12\",\"type\":0,\"rolNum\":20,\"rowNum\":12,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-36-12\",\"type\":0,\"rolNum\":36,\"rowNum\":12,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-12-36\",\"type\":0,\"rolNum\":12,\"rowNum\":36,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-20-36\",\"type\":0,\"rolNum\":20,\"rowNum\":36,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-28-36\",\"type\":0,\"rolNum\":28,\"rowNum\":36,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-36-36\",\"type\":0,\"rolNum\":36,\"rowNum\":36,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"15-44-36\",\"type\":0,\"rolNum\":44,\"rowNum\":36,\"layerNum\":15,\"moldType\":1," +
                    "\"blockNode\":null}],\"16\":[{\"id\":\"16-8-4\",\"type\":0,\"rolNum\":8,\"rowNum\":4,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-16-4\",\"type\":0,\"rolNum\":16,\"rowNum\":4,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-24-4\",\"type\":0,\"rolNum\":24,\"rowNum\":4,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-32-4\",\"type\":0,\"rolNum\":32,\"rowNum\":4,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-40-4\",\"type\":0,\"rolNum\":40,\"rowNum\":4,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-48-4\",\"type\":0,\"rolNum\":48,\"rowNum\":4,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-8-12\",\"type\":0,\"rolNum\":8,\"rowNum\":12,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-16-12\",\"type\":0,\"rolNum\":16,\"rowNum\":12,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-24-12\",\"type\":0,\"rolNum\":24,\"rowNum\":12,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-32-12\",\"type\":0,\"rolNum\":32,\"rowNum\":12,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-40-12\",\"type\":0,\"rolNum\":40,\"rowNum\":12,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-48-12\",\"type\":0,\"rolNum\":48,\"rowNum\":12,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-8-20\",\"type\":0,\"rolNum\":8,\"rowNum\":20,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-16-20\",\"type\":0,\"rolNum\":16,\"rowNum\":20,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-24-20\",\"type\":0,\"rolNum\":24,\"rowNum\":20,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-32-20\",\"type\":0,\"rolNum\":32,\"rowNum\":20,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-40-20\",\"type\":0,\"rolNum\":40,\"rowNum\":20,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-48-20\",\"type\":0,\"rolNum\":48,\"rowNum\":20,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-8-40\",\"type\":0,\"rolNum\":8,\"rowNum\":40,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-16-40\",\"type\":0,\"rolNum\":16,\"rowNum\":40,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-24-40\",\"type\":0,\"rolNum\":24,\"rowNum\":40,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-32-40\",\"type\":0,\"rolNum\":32,\"rowNum\":40,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-40-40\",\"type\":0,\"rolNum\":40,\"rowNum\":40,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"16-48-40\",\"type\":0,\"rolNum\":48,\"rowNum\":40,\"layerNum\":16,\"moldType\":1," +
                    "\"blockNode\":null}],\"17\":[{\"id\":\"17-12-4\",\"type\":0,\"rolNum\":12,\"rowNum\":4,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-20-4\",\"type\":0,\"rolNum\":20,\"rowNum\":4,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-28-4\",\"type\":0,\"rolNum\":28,\"rowNum\":4,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-36-4\",\"type\":0,\"rolNum\":36,\"rowNum\":4,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-44-4\",\"type\":0,\"rolNum\":44,\"rowNum\":4,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-12-12\",\"type\":0,\"rolNum\":12,\"rowNum\":12,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-20-12\",\"type\":0,\"rolNum\":20,\"rowNum\":12,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-36-12\",\"type\":0,\"rolNum\":36,\"rowNum\":12,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-44-12\",\"type\":0,\"rolNum\":44,\"rowNum\":12,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-12-20\",\"type\":0,\"rolNum\":12,\"rowNum\":20,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-28-20\",\"type\":0,\"rolNum\":28,\"rowNum\":20,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"17-44-20\",\"type\":0,\"rolNum\":44,\"rowNum\":20,\"layerNum\":17,\"moldType\":1," +
                    "\"blockNode\":null}],\"18\":[{\"id\":\"18-8-4\",\"type\":0,\"rolNum\":8,\"rowNum\":4,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-16-4\",\"type\":0,\"rolNum\":16,\"rowNum\":4,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-24-4\",\"type\":0,\"rolNum\":24,\"rowNum\":4,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-32-4\",\"type\":0,\"rolNum\":32,\"rowNum\":4,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-40-4\",\"type\":0,\"rolNum\":40,\"rowNum\":4,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-48-4\",\"type\":0,\"rolNum\":48,\"rowNum\":4,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-8-12\",\"type\":0,\"rolNum\":8,\"rowNum\":12,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-16-12\",\"type\":0,\"rolNum\":16,\"rowNum\":12,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-24-12\",\"type\":0,\"rolNum\":24,\"rowNum\":12,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-32-12\",\"type\":0,\"rolNum\":32,\"rowNum\":12,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-40-12\",\"type\":0,\"rolNum\":40,\"rowNum\":12,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-48-12\",\"type\":0,\"rolNum\":48,\"rowNum\":12,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-8-20\",\"type\":0,\"rolNum\":8,\"rowNum\":20,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-16-20\",\"type\":0,\"rolNum\":16,\"rowNum\":20,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-24-20\",\"type\":0,\"rolNum\":24,\"rowNum\":20,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-32-20\",\"type\":0,\"rolNum\":32,\"rowNum\":20,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-40-20\",\"type\":0,\"rolNum\":40,\"rowNum\":20,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"18-48-20\",\"type\":0,\"rolNum\":48,\"rowNum\":20,\"layerNum\":18,\"moldType\":1," +
                    "\"blockNode\":null}],\"19\":[{\"id\":\"19-12-4\",\"type\":0,\"rolNum\":12,\"rowNum\":4,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-20-4\",\"type\":0,\"rolNum\":20,\"rowNum\":4,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-28-4\",\"type\":0,\"rolNum\":28,\"rowNum\":4,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-36-4\",\"type\":0,\"rolNum\":36,\"rowNum\":4,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-44-4\",\"type\":0,\"rolNum\":44,\"rowNum\":4,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-12-12\",\"type\":0,\"rolNum\":12,\"rowNum\":12,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-20-12\",\"type\":0,\"rolNum\":20,\"rowNum\":12,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-28-12\",\"type\":0,\"rolNum\":28,\"rowNum\":12,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-36-12\",\"type\":0,\"rolNum\":36,\"rowNum\":12,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-44-12\",\"type\":0,\"rolNum\":44,\"rowNum\":12,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-12-20\",\"type\":0,\"rolNum\":12,\"rowNum\":20,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-20-20\",\"type\":0,\"rolNum\":20,\"rowNum\":20,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-28-20\",\"type\":0,\"rolNum\":28,\"rowNum\":20,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-36-20\",\"type\":0,\"rolNum\":36,\"rowNum\":20,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"19-44-20\",\"type\":0,\"rolNum\":44,\"rowNum\":20,\"layerNum\":19,\"moldType\":1," +
                    "\"blockNode\":null}],\"20\":[{\"id\":\"20-8-4\",\"type\":0,\"rolNum\":8,\"rowNum\":4,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-16-4\",\"type\":0,\"rolNum\":16,\"rowNum\":4,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-24-4\",\"type\":0,\"rolNum\":24,\"rowNum\":4,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-32-4\",\"type\":0,\"rolNum\":32,\"rowNum\":4,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-40-4\",\"type\":0,\"rolNum\":40,\"rowNum\":4,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-48-4\",\"type\":0,\"rolNum\":48,\"rowNum\":4,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-8-12\",\"type\":0,\"rolNum\":8,\"rowNum\":12,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-16-12\",\"type\":0,\"rolNum\":16,\"rowNum\":12,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-24-12\",\"type\":0,\"rolNum\":24,\"rowNum\":12,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-32-12\",\"type\":0,\"rolNum\":32,\"rowNum\":12,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-40-12\",\"type\":0,\"rolNum\":40,\"rowNum\":12,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-48-12\",\"type\":0,\"rolNum\":48,\"rowNum\":12,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-8-20\",\"type\":0,\"rolNum\":8,\"rowNum\":20,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-16-20\",\"type\":0,\"rolNum\":16,\"rowNum\":20,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-24-20\",\"type\":0,\"rolNum\":24,\"rowNum\":20,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-32-20\",\"type\":0,\"rolNum\":32,\"rowNum\":20,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-40-20\",\"type\":0,\"rolNum\":40,\"rowNum\":20,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"20-48-20\",\"type\":0,\"rolNum\":48,\"rowNum\":20,\"layerNum\":20,\"moldType\":1," +
                    "\"blockNode\":null}],\"21\":[{\"id\":\"21-12-0\",\"type\":0,\"rolNum\":12,\"rowNum\":0,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-12-8\",\"type\":0,\"rolNum\":12,\"rowNum\":8,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-12-16\",\"type\":0,\"rolNum\":12,\"rowNum\":16,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-20-0\",\"type\":0,\"rolNum\":20,\"rowNum\":0,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-28-0\",\"type\":0,\"rolNum\":28,\"rowNum\":0,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-36-0\",\"type\":0,\"rolNum\":36,\"rowNum\":0,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-44-0\",\"type\":0,\"rolNum\":44,\"rowNum\":0,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-44-8\",\"type\":0,\"rolNum\":44,\"rowNum\":8,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-44-16\",\"type\":0,\"rolNum\":44,\"rowNum\":16,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-12-24\",\"type\":0,\"rolNum\":12,\"rowNum\":24,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-20-24\",\"type\":0,\"rolNum\":20,\"rowNum\":24,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-28-24\",\"type\":0,\"rolNum\":28,\"rowNum\":24,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-36-24\",\"type\":0,\"rolNum\":36,\"rowNum\":24,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-44-24\",\"type\":0,\"rolNum\":44,\"rowNum\":24,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-24-12\",\"type\":0,\"rolNum\":24,\"rowNum\":12,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"21-32-12\",\"type\":0,\"rolNum\":32,\"rowNum\":12,\"layerNum\":21,\"moldType\":1," +
                    "\"blockNode\":null}],\"22\":[{\"id\":\"22-8-4\",\"type\":0,\"rolNum\":8,\"rowNum\":4,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-16-4\",\"type\":0,\"rolNum\":16,\"rowNum\":4,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-24-4\",\"type\":0,\"rolNum\":24,\"rowNum\":4,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-32-4\",\"type\":0,\"rolNum\":32,\"rowNum\":4,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-40-4\",\"type\":0,\"rolNum\":40,\"rowNum\":4,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-8-12\",\"type\":0,\"rolNum\":8,\"rowNum\":12,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-16-12\",\"type\":0,\"rolNum\":16,\"rowNum\":12,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-40-12\",\"type\":0,\"rolNum\":40,\"rowNum\":12,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-48-4\",\"type\":0,\"rolNum\":48,\"rowNum\":4,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-48-12\",\"type\":0,\"rolNum\":48,\"rowNum\":12,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-8-20\",\"type\":0,\"rolNum\":8,\"rowNum\":20,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-16-20\",\"type\":0,\"rolNum\":16,\"rowNum\":20,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-24-20\",\"type\":0,\"rolNum\":24,\"rowNum\":20,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-32-20\",\"type\":0,\"rolNum\":32,\"rowNum\":20,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-40-20\",\"type\":0,\"rolNum\":40,\"rowNum\":20,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"22-48-20\",\"type\":0,\"rolNum\":48,\"rowNum\":20,\"layerNum\":22,\"moldType\":1," +
                    "\"blockNode\":null}],\"23\":[{\"id\":\"23-12-0\",\"type\":0,\"rolNum\":12,\"rowNum\":0,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-12-8\",\"type\":0,\"rolNum\":12,\"rowNum\":8,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-12-16\",\"type\":0,\"rolNum\":12,\"rowNum\":16,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-12-24\",\"type\":0,\"rolNum\":12,\"rowNum\":24,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-20-0\",\"type\":0,\"rolNum\":20,\"rowNum\":0,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-28-0\",\"type\":0,\"rolNum\":28,\"rowNum\":0,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-36-0\",\"type\":0,\"rolNum\":36,\"rowNum\":0,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-44-0\",\"type\":0,\"rolNum\":44,\"rowNum\":0,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-20-8\",\"type\":0,\"rolNum\":20,\"rowNum\":8,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-28-8\",\"type\":0,\"rolNum\":28,\"rowNum\":8,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-36-8\",\"type\":0,\"rolNum\":36,\"rowNum\":8,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-44-8\",\"type\":0,\"rolNum\":44,\"rowNum\":8,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-20-16\",\"type\":0,\"rolNum\":20,\"rowNum\":16,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-28-16\",\"type\":0,\"rolNum\":28,\"rowNum\":16,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-36-16\",\"type\":0,\"rolNum\":36,\"rowNum\":16,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-44-16\",\"type\":0,\"rolNum\":44,\"rowNum\":16,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-20-24\",\"type\":0,\"rolNum\":20,\"rowNum\":24,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-28-24\",\"type\":0,\"rolNum\":28,\"rowNum\":24,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-36-24\",\"type\":0,\"rolNum\":36,\"rowNum\":24,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"23-44-24\",\"type\":0,\"rolNum\":44,\"rowNum\":24,\"layerNum\":23,\"moldType\":1," +
                    "\"blockNode\":null}],\"24\":[{\"id\":\"24-8-4\",\"type\":0,\"rolNum\":8,\"rowNum\":4,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-8-12\",\"type\":0,\"rolNum\":8,\"rowNum\":12,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-8-20\",\"type\":0,\"rolNum\":8,\"rowNum\":20,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-16-0\",\"type\":0,\"rolNum\":16,\"rowNum\":0,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-24-0\",\"type\":0,\"rolNum\":24,\"rowNum\":0,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-32-0\",\"type\":0,\"rolNum\":32,\"rowNum\":0,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-40-0\",\"type\":0,\"rolNum\":40,\"rowNum\":0,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-48-4\",\"type\":0,\"rolNum\":48,\"rowNum\":4,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-48-12\",\"type\":0,\"rolNum\":48,\"rowNum\":12,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-48-20\",\"type\":0,\"rolNum\":48,\"rowNum\":20,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-16-28\",\"type\":0,\"rolNum\":16,\"rowNum\":28,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-24-28\",\"type\":0,\"rolNum\":24,\"rowNum\":28,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-32-28\",\"type\":0,\"rolNum\":32,\"rowNum\":28,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"24-40-28\",\"type\":0,\"rolNum\":40,\"rowNum\":28,\"layerNum\":24,\"moldType\":1," +
                    "\"blockNode\":null}],\"25\":[{\"id\":\"25-12-0\",\"type\":0,\"rolNum\":12,\"rowNum\":0,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-20-0\",\"type\":0,\"rolNum\":20,\"rowNum\":0,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-28-0\",\"type\":0,\"rolNum\":28,\"rowNum\":0,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-36-0\",\"type\":0,\"rolNum\":36,\"rowNum\":0,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-44-0\",\"type\":0,\"rolNum\":44,\"rowNum\":0,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-12-28\",\"type\":0,\"rolNum\":12,\"rowNum\":28,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-20-28\",\"type\":0,\"rolNum\":20,\"rowNum\":28,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-28-28\",\"type\":0,\"rolNum\":28,\"rowNum\":28,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-36-28\",\"type\":0,\"rolNum\":36,\"rowNum\":28,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-44-28\",\"type\":0,\"rolNum\":44,\"rowNum\":28,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-4-16\",\"type\":0,\"rolNum\":4,\"rowNum\":16,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"25-52-16\",\"type\":0,\"rolNum\":52,\"rowNum\":16,\"layerNum\":25,\"moldType\":1," +
                    "\"blockNode\":null}],\"26\":[{\"id\":\"26-8-4\",\"type\":0,\"rolNum\":8,\"rowNum\":4,\"layerNum\":26,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"26-48-4\",\"type\":0,\"rolNum\":48,\"rowNum\":4,\"layerNum\":26,\"moldType\":1," +
                    "\"blockNode\":null}],\"27\":[{\"id\":\"27-4-8\",\"type\":0,\"rolNum\":4,\"rowNum\":8,\"layerNum\":27,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"27-52-8\",\"type\":0,\"rolNum\":52,\"rowNum\":8,\"layerNum\":27,\"moldType\":1," +
                    "\"blockNode\":null}],\"28\":[{\"id\":\"28-52-12\",\"type\":0,\"rolNum\":52,\"rowNum\":12,\"layerNum\":28,\"moldType\":1," +
                    "\"blockNode\":null},{\"id\":\"28-4-12\",\"type\":0,\"rolNum\":4,\"rowNum\":12,\"layerNum\":28,\"moldType\":1," +
                    "\"blockNode\":null}]}}", "2022-07-13T03:29:53.404Z"));
        } else {
            new IDKWhatIsUtil().updateData();
        }
        if (GlobalConfig.gameMap.containsKey(id)) {
            return BaseResponse.success(GlobalConfig.gameMap.get(id));

        } else {
            return BaseResponse.errorNoToken();

        }
    }

    @RequestMapping("/game_over")
    public BaseResponse gameOver() {
        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
    }

    @RequestMapping("/user_rank_info")
    public BaseResponse<UserRankInfo> getUserRankInfo() {
        return BaseResponse.success(new UserRankInfo("南京", new User()));
    }

    @RequestMapping("/rank_info")
    public BaseResponse getRankInfo() {
        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/rank_info", Object.class);
    }

    @RequestMapping("/rank_stage_info")
    public BaseResponse getRankStageInfo() {
        return BaseResponse.success(RankStageInfoResponse.getRankStageInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/rank_stage_info", Object.class);
    }

    @RequestMapping("/get_bullet")
    public Object getBullet() {
        return BaseResponse.success(new ArrayList<>());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/get_bullet", Object.class);
    }

    @RequestMapping("/user_info")
    public Object getUserInfo() {
//        return BaseResponse.errorNoToken();
        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/user_info", Object.class);
    }

    @RequestMapping("/get_topic")
    public Object getTopic() {
        TopicData data = new TopicData();
        //logger.info("获取话题："+config.topicName);
        data.setName(config.topicName);
        data.setId(config.topicId);
        data.setInfo(new TopicInfo());
        return new Response<>(0, "", data);
//        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/get_topic", Object.class);
    }

    @RequestMapping("/personal_info")
    public Object personalInfo() {
        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/personal_info", Object.class);
    }

    @RequestMapping("/bullet_send")
    public Object bulletSend() {
        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/bullet_send", Object.class);
    }

    @RequestMapping("/topic_join")
    public Object topicJoin() {
        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/topic_join", Object.class);
    }

    @RequestMapping("/update_user_skin")
    public Object updateUserSkin() {
        return BaseResponse.success(new ArrayList<>());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/update_user_skin", Object.class);
    }

    @RequestMapping("/topic_match_info")
    public Object topicMatchInfo() {
        return BaseResponse.success(RespInfoResponse.getRespInfoDto());
//        return restTemplate.getForObject("https://cat-match.easygame2021.com/sheep/v1/game/update_user_skin", Object.class);
    }

    @RequestMapping("/topic_rank")
    public BaseResponse<TopicRank> topicRank() {
        return BaseResponse.success(new TopicRank());
    }

}
