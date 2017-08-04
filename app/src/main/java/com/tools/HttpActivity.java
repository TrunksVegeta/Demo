package com.tools;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.tools.app.MyApplication;
import com.tools.base.MyBaseActivity;
import com.tools.entity.BannerBean;
import com.tools.http.RetrofitTest;
import com.tools.http.Url;

import cn.bingoogolapple.bgabanner.BGABanner;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by java on 2017/7/26.
 */

public class HttpActivity extends MyBaseActivity implements BGABanner.Adapter<ImageView, String>,View.OnClickListener {

    private RetrofitTest retrofitTest;
    private BGABanner banner;
    private TextView okhttp;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_http;
    }

    @Override
    protected void findViewByid() {
        banner = (BGABanner) findViewById(R.id.http_banner);
        okhttp = (TextView) findViewById(R.id.okhttp);
        retrofitTest = new Retrofit.Builder()
                .baseUrl(Url.Test5)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(RetrofitTest.class);
        okhttp.setOnClickListener(this);
    }

    @Override
    protected void Operate() {
        RequestNet(banner, 4);
    }

    private void RequestNet(final BGABanner banner, int count) {
        retrofitTest.getBanner(count).enqueue(new Callback<BannerBean>() {

            @Override
            public void onResponse(Call<BannerBean> call, Response<BannerBean> response) {
                BannerBean bannerBean = response.body();
                //设置是否开启自动轮播,在 setData 方法之前调用,调了该方法后必须再调用一次 setData 方法
                //根据图片当图片数量大于 1 时开启自动轮播，等于 1 时不开启自动轮播
                banner.setAutoPlayAble(bannerBean.imgs.size() > 1);
                banner.setAdapter(HttpActivity.this);
                banner.setData(bannerBean.imgs, bannerBean.tips);
            }

            @Override
            public void onFailure(Call<BannerBean> call, Throwable t) {
                Toast.makeText(MyApplication.getInstance(), "网络数据加载失败" + t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void fillBannerItem(BGABanner banner, ImageView itemView, String model, int position) {
        Glide.with(itemView.getContext())
                .load(model)
                .into(itemView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.okhttp:
                this.startActivity(new Intent(this, OkHttpActivity.class));
                break;
        }
    }
}
