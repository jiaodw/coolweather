package com.app.coolweather.util;

/**
 * Created by Pradeep on 27/4/2016.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
