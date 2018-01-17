package com.example.mengji.coolweather.gson;

/**
 * Created by mengji on 2018/1/14.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
