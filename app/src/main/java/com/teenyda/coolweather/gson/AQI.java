package com.teenyda.coolweather.gson;


/**
 * @Auther: teenyda
 * @Date: 2019/4/20 15:14
 * @Description:
 */
public class AQI {

    public  AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
