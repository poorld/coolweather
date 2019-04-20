package com.teenyda.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 15:18
 * @Description:
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
