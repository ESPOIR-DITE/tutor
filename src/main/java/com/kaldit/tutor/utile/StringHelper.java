package com.kaldit.tutor.utile;

import org.apache.commons.lang3.StringUtils;

/**
 * @author caniksea
 */
public class StringHelper {

    public static boolean isEmptyOrNull(String str) {
        return StringUtils.isEmpty(str);
    }

    public static String setEmptyIfNull(String str) {
        if (isEmptyOrNull(str)) return "";
        else return str;
    }
}
