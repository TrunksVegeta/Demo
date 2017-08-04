package com.tools.listener;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by java on 2017/6/20.
 */

public class OnClickTouchListener implements View.OnTouchListener {

    //View的点击状态效果定义
    private ViewClickEffect effect = new DefaultClickEffect();

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                effect.onPressedEffect(v);
                v.setPressed(true);
                break;

            case MotionEvent.ACTION_MOVE:
                float x = event.getX();
                float y = event.getY();
                boolean isInside = (x > 0 && x < v.getWidth() && y > 0 && y < v.getHeight());
                if (v.isPressed() != isInside) {
                    v.setPressed(isInside);
                }
                break;
            case MotionEvent.ACTION_CANCEL:
                effect.onUnPressedEffect(v);
                v.setPressed(false);
                break;
            case MotionEvent.ACTION_UP:
                effect.onUnPressedEffect(v);
                if (v.isPressed()) {
                    v.performClick();
                    v.setPressed(false);
                }
                break;
        }
        return true;
        }

        public ViewClickEffect getViewClickEffect() {
            return effect;
        }

        public void setViewClickEffect(ViewClickEffect viewClickEffect) {
            effect = viewClickEffect;
        }
}
