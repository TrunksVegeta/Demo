package com.tools;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.tools.base.MyBaseActivity;
import com.tools.entity.Retrofit_Bean;
import com.tools.entity.Test_CompanyInfo;
import com.tools.http.Url;
import com.tools.utils.CutOutUtils;
import com.tools.utils.OkHttpUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;

/**
 * Created by java on 2017/7/30.
 */

public class OkHttpActivity extends MyBaseActivity {

    @BindView(R.id.okhttp_listView)
    ListView listView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_okhttp;
    }

    @Override
    protected void findViewByid() {
        ButterKnife.bind(this);

    }

    @Override
    protected void Operate() {
        OkHttpUtils.doGet(Url.Test2 + "6/10", new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("IOException",e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("Response",response.body().string());
                Retrofit_Bean retrofit_bean = new Gson().fromJson(response.body().toString(), Retrofit_Bean.class);
                Log.e("Retrofit_Bean",retrofit_bean.getResults().get(0).get_id());
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
