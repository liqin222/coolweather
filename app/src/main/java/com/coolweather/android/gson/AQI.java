package com.coolweather.android.gson;

/**
 * Created by 李沁 on 2017/12/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
