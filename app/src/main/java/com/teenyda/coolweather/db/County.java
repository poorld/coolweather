package com.teenyda.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 09:05
 * @Description:
 */
public class County extends DataSupport {
    private int id;
    // 县的名字
    private String countyName;

    private String weatherId;
    // 所属市id值
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
