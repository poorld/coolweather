package com.teenyda.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 09:04
 * @Description:
 */
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
