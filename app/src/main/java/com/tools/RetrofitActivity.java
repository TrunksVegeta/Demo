package com.tools;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.tools.adapter.Retofit_Adapter;
import com.tools.base.MyBaseActivity;
import com.tools.client.HttpClient;
import com.tools.entity.Retrofit_Bean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/7/6.
 * Retrofit 简单使用 加载图片 并使用RecylcerView进行数据适配
 */

public class RetrofitActivity extends MyBaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_retrofit;
    }

    @Override
    protected void findViewByid() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    @Override
    protected void Operate() {
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        new HttpClient().getData("100","2").enqueue(new Callback<Retrofit_Bean>() {
            @Override
            public void onResponse(Call<Retrofit_Bean> call, Response<Retrofit_Bean> response) {
                recyclerView.setAdapter(new Retofit_Adapter(response.body().getResults(),RetrofitActivity.this));
            }

            @Override
            public void onFailure(Call<Retrofit_Bean> call, Throwable t) {

            }
        });
    }

    private RecyclerView recyclerView;
}
