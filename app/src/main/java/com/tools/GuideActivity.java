package com.tools;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.tools.base.MyBaseActivity;
import com.tools.view.CustomVideoView;
import com.tools.view.PrinterTextView;

/**
 * Created by java on 2017/7/26.
 */

public class GuideActivity extends MyBaseActivity implements View.OnClickListener{

    private ImageView title;
    private CustomVideoView videoView;
    private PrinterTextView printerTextView;
    private RelativeLayout relativeLayout;

    @Override
    protected int getLayoutId() {
        hideBar();
        return R.layout.activity_guide;
    }

    @Override
    protected void findViewByid() {
        videoView = (CustomVideoView) findViewById(R.id.guide_videoview);
        title = (ImageView) findViewById(R.id.guide_title);
        printerTextView = (PrinterTextView) findViewById(R.id.guide_text);
        relativeLayout = (RelativeLayout) findViewById(R.id.guide_relayout);
        relativeLayout.setOnClickListener(this);
    }

    @Override
    protected void Operate() {
        showVideo();
        showAnim();
        showPrinterText();
    }

    @Override
    protected void onResume() {
        super.onResume();
        showVideo();
        showAnim();
        showPrinterText();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.guide_relayout:
                this.startActivity(new Intent(this, HomeActivity.class));
                this.finish();
                break;
        }
    }

    private void showVideo() {
        videoView.setVideoURI(Uri.parse("android.resource://"
                + this.getPackageName() + "/" + R.raw.kr36));
        videoView.start();
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }
        });
    }

    private void showPrinterText(){
        printerTextView.setTextString("Welcome to visit and study. "
                + "\n" + "          欢迎学习和参考.")
                .startPrinterInAnimation(new PrinterTextView.TextAnimationListener() {
                    @Override
                    public void animationFinish() {

                    }
                });
    }

    private void showAnim() {
        PropertyValuesHolder alpha = PropertyValuesHolder.ofFloat("alpha", 0.3f, 1f);
        PropertyValuesHolder scaleX = PropertyValuesHolder.ofFloat("scaleX", 0.3f, 1f);
        PropertyValuesHolder scaleY = PropertyValuesHolder.ofFloat("scaleY", 0.3f, 1f);
        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(title, alpha, scaleX, scaleY);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(2000);
        animatorSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }

        });
        animatorSet.start();
    }
}
