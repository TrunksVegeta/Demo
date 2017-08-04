package com.tools.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by 浅子影 on 2017/4/11.
 * 我的Service服务
 */

public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    //应用程序通过返回的IBinder对象与Service组件进行通信。
    //The application communicates with the Service component by the returned IBinder object.

    @Override
    public void onCreate() {
        super.onCreate();
    }
    //Service被创建时回掉该方法。
    //This method is returned when Service is created.

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
    //Service被启动时回掉该方法。
    //Service is returned when it is started.

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    //Service被关闭之前回掉该方法。
    //This method is returned before Service is turned off.
}
