package com.ff.coolweather.gson;

/**
 * Created by 孵孵 on 2018/2/3 0003.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}