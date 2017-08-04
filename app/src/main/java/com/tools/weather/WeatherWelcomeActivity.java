package com.tools.weather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.tools.R;
import com.tools.base.MyBaseActivity;

/**
 * Created by java on 2017/7/16.
 */

public class WeatherWelcomeActivity extends MyBaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_weather_welcome;
    }

    @Override
    protected void findViewByid() {

    }

    @Override
    protected void Operate() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (preferences.getString("weather", null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
