package com.teenyda.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 15:21
 * @Description:
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
