package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 李沁 on 2017/12/24.
 */

public class Weather {
    public String status;//请求的状态
    public Basic basic;//基本信息
    public AQI aqi;//空气质量
    public Now now;//当前的天气信息
    public Suggestion suggestion;//生活建议
    @SerializedName("daily_forecast")//未来几天的天气信息
    public List<Forecast> forecastList;
}
