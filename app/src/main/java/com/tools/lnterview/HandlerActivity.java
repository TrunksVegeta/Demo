package com.tools.lnterview;

import android.os.Handler;

import com.tools.R;
import com.tools.base.MyBaseActivity;

/**
 * Created by java on 2017/7/15.
 */

public class HandlerActivity extends MyBaseActivity{

    private Handler handler = new Handler();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_handler;
    }

    @Override
    protected void findViewByid() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        }).start();
    }

    @Override
    protected void Operate() {

    }
}
