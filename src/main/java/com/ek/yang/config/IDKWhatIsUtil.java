package com.ek.yang.config;

import com.ek.yang.model.MapData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

/**
 * IDKWhatIsUtil
 * @author ErKang
 * @date Created in 2022/9/22 17:59
 * @title ParameterRequestWrapper.java
 * Department: Product development
 */
public class IDKWhatIsUtil {

    @javax.annotation.Resource
    GlobalConfig config = new GlobalConfig();

    public String getMapData() throws IOException, URISyntaxException {
        //return restTemplate.getForObject("https://cat-match.easygame2021.com/admin/game_map/page", String.class);
        Resource resource = new ClassPathResource("game_map.json");
        Reader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8);
        return FileCopyUtils.copyToString(reader);
    }

    //已备份数据，但是此接口可能会和谐
    public void updateData() throws IOException, URISyntaxException {
        Calendar cal = Calendar.getInstance();
        //一天一变，只记录日即可
        int day = cal.get(Calendar.DATE);
        if (config.requested == day) return;
        config.requested = day;
        if (!config.hardCode) {
            String mapData = getMapData();
            JsonObject json = new Gson().fromJson(mapData, JsonObject.class);
            JsonArray dataArray = json.getAsJsonArray("data");
            for (JsonElement e : dataArray) {
                GlobalConfig.gameMap.put(e.getAsJsonObject().get("map_id").getAsInt(), new Gson().fromJson(e, MapData.class));
            }
        }
    }
}
