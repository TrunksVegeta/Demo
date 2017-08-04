package com.tools.utils;

/**
 * Created by 浅子影 on 2017/3/8.
 */

public class CutOutUtils {
    public static String Substring(String response) {
        int lastIndex = response.lastIndexOf('}');
        int begin = response.indexOf("{");
        response = response.substring(begin, lastIndex + 1);
        if (response != null) {
            return response;
        }
        return -1 + "";
    }
}
