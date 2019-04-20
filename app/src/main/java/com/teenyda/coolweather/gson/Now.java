package com.teenyda.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 15:17
 * @Description:
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
