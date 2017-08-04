package com.tools;

import android.widget.ListView;

import com.google.gson.Gson;
import com.tools.adapter.Main_Adapter;
import com.tools.base.MyBaseActivity;
import com.tools.entity.Test_CompanyInfo;
import com.tools.http.Url;
import com.tools.utils.CutOutUtils;
import com.yanzhenjie.nohttp.NoHttp;
import com.yanzhenjie.nohttp.RequestMethod;
import com.yanzhenjie.nohttp.rest.OnResponseListener;
import com.yanzhenjie.nohttp.rest.Request;
import com.yanzhenjie.nohttp.rest.RequestQueue;
import com.yanzhenjie.nohttp.rest.Response;

import java.util.ArrayList;
import java.util.List;

public class NoHttpActivity extends MyBaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void findViewByid() {
        requestQueue = NoHttp.newRequestQueue();
        listView = (ListView) findViewById(R.id.list);
        list = new ArrayList<>();
        mainAdapter = new Main_Adapter(NoHttpActivity.this, list);
        listView.setAdapter(mainAdapter);
    }

    @Override
    protected void Operate() {
        RequestNet();
    }

    private void RequestNet() {
        Request<String> request = NoHttp.createStringRequest(Url.Test, RequestMethod.GET);
        request.add("userid", "28")
                .add("rownum", "0")
                .add("rowcount", "1")
                .add("companyName", "")
                .add("waterLevel", "")
                .add("industryLevel", "")
                .setConnectTimeout(10 * 1000)
                .setReadTimeout(20 * 1000)
                .setTag(new Object());
        requestQueue.add(NOHTTP_TEST_NUM, request, new OnResponseListener<String>() {
            @Override
            public void onStart(int what) {

            }

            @Override
            public void onSucceed(int what, Response<String> response) {
                if (response.responseCode() == 200) {
                    companyInfo = new Gson().fromJson(CutOutUtils.Substring(response.get()), Test_CompanyInfo.class);
                    list.addAll(companyInfo.getData());
                    mainAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailed(int what, Response<String> response) {

            }

            @Override
            public void onFinish(int what) {

            }
        });
    }

    private RequestQueue requestQueue;
    private Test_CompanyInfo companyInfo;
    private Main_Adapter mainAdapter;
    private ListView listView;
    private List<Test_CompanyInfo.DataBean> list;
    private static final int NOHTTP_TEST_NUM = 0x0001;
}
