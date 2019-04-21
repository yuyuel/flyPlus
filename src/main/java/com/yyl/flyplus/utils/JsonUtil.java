package com.yyl.flyplus.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class JsonUtil {
    public static String toJSONString(Object o) {
        return JSON.toJSONString(o);
    }

    public static byte[] toJSONBytes(Object o) {
        return JSON.toJSONBytes(o);
    }

    public static <T> T parseObject(String jsonStr, Class<T> clazz) {
        return JSON.parseObject(jsonStr, clazz);
    }

    public static <T> T parseObject(String text,
                                    TypeReference<T> type) {
        return JSON.parseObject(text, type);
    }

    public static JSONObject parseObject(String text) {
        return JSON.parseObject(text);
    }
}
