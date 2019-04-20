package com.teenyda.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.teenyda.coolweather.util.SaveAllData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SaveAllData.getAllProvince();
    }
}
