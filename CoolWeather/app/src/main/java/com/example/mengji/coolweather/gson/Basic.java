package com.example.mengji.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mengji on 2018/1/14.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
