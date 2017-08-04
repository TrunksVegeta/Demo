package com.tools.weather;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tools.R;
import com.tools.base.MyBaseActivity;
import com.tools.http.Url;
import com.tools.utils.HttpUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/7/10.
 */

public class WeatherActivity  extends MyBaseActivity{

    @Override
    protected int getLayoutId() {
        return R.layout.activity_weather;
    }

    @Override
    protected void findViewByid() {
        imageView = (ImageView) findViewById(R.id.weather_bg);
        textView = (TextView) findViewById(R.id.weather_title);
    }

    @Override
    protected void Operate() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (preferences.getString("bing_pic", null) != null) {
            Glide.with(this).load(preferences.getString("bing_pic", null)).into(imageView);
        } else {
            loadBingPic();
        }
    }

    private void loadBingPic() {
        HttpUtils.sendOkHttpRequest(Url.Test4, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String pic = response.body().string();
                SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(WeatherActivity.this).edit();
                editor.putString("bing_pic", pic);
                editor.apply();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Glide.with(WeatherActivity.this).load(pic).into(imageView);
                    }
                });
            }
        });
    }

    private ImageView imageView;
    private TextView textView;
}
