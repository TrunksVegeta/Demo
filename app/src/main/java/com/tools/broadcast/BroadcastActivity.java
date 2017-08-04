package com.tools.broadcast;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.tools.base.MyBaseActivity;
import com.tools.R;

/**
 * Created by 浅子影 on 2017/4/11.
 */

public class BroadcastActivity extends MyBaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_broadcast;
    }

    @Override
    protected void findViewByid() {
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.BroadcastActivity_coordinatorLayout);
    }
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void Operate() {

    }

    public void createSnackbar(View v) {
        Snackbar.make(coordinatorLayout, "Snackbar", Snackbar.LENGTH_LONG).show();
    }
}
