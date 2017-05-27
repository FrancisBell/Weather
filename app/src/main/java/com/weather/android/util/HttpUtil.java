package com.weather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 钟庆明 on 2017/5/26.
 * 利用 OkHtpp 与服务器交互
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
