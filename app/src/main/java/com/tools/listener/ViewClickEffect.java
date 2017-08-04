package com.tools.listener;

import android.view.View;

/**
 * Created by java on 2017/6/20.
 * View点击效果接口
 */

public interface ViewClickEffect {
    /**
     * 按下去的效果
     *
     * @param view
     */
    void onPressedEffect(View view);

    /**
     * 释放的效果
     *
     * @param view
     */
    void onUnPressedEffect(View view);
}
