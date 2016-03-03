package com.android.cbe.webservice;

import android.content.Context;

/**
 * Created by Intern.harshrajT on 2/23/2016.
 */
public class HTTPConstant {
    public static Context mContext;
    public static String BASE_URL="https://api.github.com";
    public static final String LOGIN_URL = "/search/users";

    HTTPConstant(Context context) {
        this.mContext = context;
    }
    HTTPConstant() {
    }
    public static HTTPConstant getInstace(Context context) {
        HTTPConstant httpConstant = new HTTPConstant(context);
        return httpConstant;
    }

    public String getLoginUrl() {
        String loginUrl = BASE_URL + LOGIN_URL;
        return loginUrl;
    }
    public  String getBaseUrl() {
        String baseUrl = BASE_URL;
        return baseUrl;
    }
}
