package com.ff.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 孵孵 on 2018/2/3 0003.
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