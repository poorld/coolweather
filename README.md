# 酷欧天气

- 数据库管理: LitePal
- 网络请求: OkHttp
- 解析JSON: gson
- 图片加载和展示: Glide

城市接口：http://guolin.tech/api/china

天气数据接口: https://free-api.heweather.net/s6/weather/forecast?location=CN101010100&key=6f05f822e8cd4e4187e831ea51a332af

http://guolin.tech/api/weather?cityid=CN101010100&key=6f05f822e8cd4e4187e831ea51a332af

```
{
    "HeWeather": [
        {
            "status": "ok",
            "basic": {},
            "aqi": {},
            "now":{},
            "suggestion":{},
            "daily_forecast": []
        }
    ]
}
```