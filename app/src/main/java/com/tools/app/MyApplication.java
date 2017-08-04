package com.tools.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yanzhenjie.nohttp.BuildConfig;
import com.yanzhenjie.nohttp.Logger;
import com.yanzhenjie.nohttp.NoHttp;

import org.litepal.LitePalApplication;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by 浅子影 on 2017/3/7.
 */

public class MyApplication extends LitePalApplication {

    private static Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Logger.setDebug(BuildConfig.DEBUG);
        Logger.setTag("NoHttpSample");
        NoHttp.initialize(this);
        Fresco.initialize(this);
        //正式版的时候设置false，关闭调试
        JPushInterface.setDebugMode(true);
        //初始化sdk
        JPushInterface.init(this);
    }

    public static Application getInstance() {
        return instance;
    }
}
