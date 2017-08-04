package com.tools;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tools.base.MyBaseActivity;
import com.tools.listener.DefaultClickEffect;
import com.tools.listener.OnClickTouchListener;
import com.tools.utils.StatuUtils;
import com.tools.weather.WeatherActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by java on 2017/6/14.
 */

public class HomeActivity extends MyBaseActivity implements View.OnClickListener {

    private RelativeLayout home_item1;
    private RelativeLayout home_item2;
    private RelativeLayout home_item3;
    private RelativeLayout home_item4;
    private OnClickTouchListener touchListener;
    private DefaultClickEffect defaultClickEffect;
    private TextView home_time;
    private Calendar calendar;
    private static final int msgKey = 1;

    @Override
    protected int getLayoutId() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            StatuUtils.translucentStatusBar(HomeActivity.this,false);
        }
        return R.layout.activity_home;
    }

    @Override
    protected void findViewByid() {
        calendar = Calendar.getInstance();
        home_item1 = (RelativeLayout) findViewById(R.id.home_item1);
        home_item2 = (RelativeLayout) findViewById(R.id.home_item2);
        home_item3 = (RelativeLayout) findViewById(R.id.home_item3);
        home_item4 = (RelativeLayout) findViewById(R.id.home_item4);
        home_time = (TextView) findViewById(R.id.home_time);
        touchListener = new OnClickTouchListener();
        defaultClickEffect = new DefaultClickEffect();
    }

    @Override
    protected void Operate() {
        touchListener.setViewClickEffect(defaultClickEffect);
        home_item1.setOnClickListener(this);
        home_item1.setOnTouchListener(touchListener);
        home_item2.setOnClickListener(this);
        home_item2.setOnTouchListener(touchListener);
        home_item3.setOnClickListener(this);
        home_item3.setOnTouchListener(touchListener);
        home_item4.setOnClickListener(this);
        home_item4.setOnTouchListener(touchListener);
        new TimeThread().start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_item1:
                Intent intent = new Intent();
                intent.setClass(HomeActivity.this, HttpActivity.class);
                HomeActivity.this.startActivity(intent);
                break;
            case R.id.home_item2:
                this.startActivity(new Intent(this, RetrofitActivity.class));
                break;
            case R.id.home_item3:
                this.startActivity(new Intent(this, SystemAppActivity.class));
                break;
            case R.id.home_item4:
                this.startActivity(new Intent(this, WeatherActivity.class));
                break;
        }
    }

    public class TimeThread extends Thread {
        @Override
        public void run() {
            do {
                try {
                    Thread.sleep(1000);
                    Message msg = new Message();
                    msg.what = msgKey;
                    handler.sendMessage(msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (true);
        }
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case msgKey:
                    home_time.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new java.util.Date()));
                    break;
                default:
                    break;
            }
        }
    };
}
