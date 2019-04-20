package com.teenyda.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 网络请求工具类
 * @Auther: teenyda
 * @Date: 2019/4/20 09:16
 * @Description:
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();

        client.newCall(request).enqueue(callback);
    }
}
