package com.teenyda.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 15:11
 * @Description:
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

    @Override
    public String toString() {
        return "Basic{" +
                "cityName='" + cityName + '\'' +
                ", weatherId='" + weatherId + '\'' +
                ", update=" + update +
                '}';
    }
}
