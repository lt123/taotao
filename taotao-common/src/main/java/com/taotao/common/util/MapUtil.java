package com.taotao.common.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {

    private MapUtil(){}

    public static boolean validataMap(Map<String,Object> map, String fileds){
        String[] split = fileds.split(",");
        for (String s : split) {
            if(null == map.get(s)) {
                return false;
            }
        }
        return true;
    }

    public static Map<String,Object> createMap(Object ... args){
        Map<String,Object> map = new HashMap<>();
        if(args != null && args.length % 2 == 0){
            for (int i = 0; i < args.length; i++) {
            	String key = args[i++].toString();
            	Object value = args[i];
            	// 去掉没有value的值
            	if(value != null && StringUtil.isNotBlank(value.toString())) {
            		map.put(key, value);
            	}
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Object> map = createMap("user", "a", "pswd", "");
        System.out.println(map);
    }
}