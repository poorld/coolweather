package com.teenyda.coolweather;

import com.teenyda.coolweather.db.City;
import com.teenyda.coolweather.db.County;
import com.teenyda.coolweather.db.Province;
import com.teenyda.coolweather.util.HttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * @Auther: teenyda
 * @Date: 2019/4/20 10:30
 * @Description:
 */
public class SaveAllData {

    public static final String BASE_URL = "http://guolin.tech/api/china";


    public static void saveProvince(final JSONArray provinceArray ) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 保存省份
                for (int i = 0; i < provinceArray.length(); i++) {
                    try {
                        JSONObject provinceObject = provinceArray.getJSONObject(i);
                        Province province = new Province();
                        province.setId(provinceObject.getInt("id"));
                        province.setProvinceName(provinceObject.getString("name"));
                        province.save();

                        getAllCity(province.getId());

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    // 保存城市
    public static void saveCity(JSONArray cityArray, int provinceId) {
        for (int i = 0; i < cityArray.length(); i++) {
                try {
                JSONObject cityObject = cityArray.getJSONObject(i);
                City city = new City();
                city.setProvinceId(provinceId);
                city.setId(cityObject.getInt("id"));
                city.setCityName(cityObject.getString("name"));

                city.save();

                getAllCounty(city.getProvinceId(),city.getId());

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveCounty(JSONArray countyArray, int cityId) {
        for (int i = 0; i < countyArray.length(); i++) {
            try {
                JSONObject countyObject = countyArray.getJSONObject(i);
                County county = new County();
                county.setCityId(cityId);
                county.setId(countyObject.getInt("id"));
                county.setCountyName(countyObject.getString("name"));
                county.setWeatherId(countyObject.getString("weather_id"));
                county.save();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 获取所有省份
     * @return
     */
    public static void getAllProvince() {


        HttpUtil.sendOkHttpRequest(BASE_URL, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    JSONArray provinceArray = new JSONArray(response.body().string());
                    saveProvince(provinceArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    /**
     * 获取所有城市
     * @return
     */
    public static void getAllCity(final int provinceId) {
        String url = BASE_URL + "/" + provinceId;
        HttpUtil.sendOkHttpRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    JSONArray cityArray = new JSONArray(response.body().string());
                    saveCity(cityArray,provinceId);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * 获取所有县
     */
    public static void getAllCounty(final int provinceId,final int cityId) {
        String url = BASE_URL + "/" + provinceId + "/" + cityId;
        HttpUtil.sendOkHttpRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    JSONArray countyArray = new JSONArray(response.body().string());
                    saveCounty(countyArray,cityId);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
