package com.example.mengji.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mengji on 2018/1/14.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperatuer temperatuer;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperatuer {
        public String max;
        public String min;
    }
}
