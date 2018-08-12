package com.qinjun.autotest.tstest.base;

import java.util.HashMap;
import java.util.Map;

public class UrlFactory {
    public static final String name="JSON_PLACE_HOLDER_URL";
    public static final String subUrl = "/posts/1";


    public static Map<String,String> getUrl(String ip) {
        Map<String,String> urlMap = new HashMap<String,String>();
        String fullUrl = "http://"+ip+subUrl;
        urlMap.put(name,fullUrl);
        return urlMap;
     }
}
