package com.example.mengji.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mengji on 2018/1/14.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}
