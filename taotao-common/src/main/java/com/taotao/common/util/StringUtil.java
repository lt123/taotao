package com.taotao.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2016/5/5.
 */
public class StringUtil {

    private StringUtil(){}

    public static boolean isNotBlank(String str) {
        if(str == null || "".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean isNotBlank(String ... str) {
        for (String s : str) {
            if(s == null || "".equals(s)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(String str){
        return !isNotBlank(str);
    }

    public static boolean isNumber(String str){
        if(!isNotBlank(str)){
            return false;
        }else {
            Pattern pattern = Pattern.compile("-?[0-9]+");
            Matcher isNum = pattern.matcher(str);
            if( !isNum.matches() ){
                return false;
            }
        }
        return true;
    }
}