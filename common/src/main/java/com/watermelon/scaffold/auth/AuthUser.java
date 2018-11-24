package com.watermelon.scaffold.auth;

import com.watermelon.scaffold.exception.StringEmptyException;
import org.springframework.util.StringUtils;

public class AuthUser {

    private static ThreadLocal<String> userDetail = new ThreadLocal<String>();

    public static void setUserDetail(String userId) {
        if (StringUtils.isEmpty(userId)) {
            throw new StringEmptyException();
        }
        userDetail.set(userId);
    }

    public static String getUserDetail() {
        return userDetail.get();
    }

    public static void clear() {
        userDetail.remove();
    }
}
