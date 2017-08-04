package com.tools.weather.frag;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tools.R;
import com.tools.http.Url;
import com.tools.utils.AnalysisUtils;
import com.tools.utils.HttpUtils;
import com.tools.weather.entitiy.Province;

import org.litepal.crud.DataSupport;
import org.litepal.util.LogUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/7/10.
 */

public class WeatherFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_weather, container, false);
        findViewByid();
        return view;
    }

    private void findViewByid() {
        title = (TextView) view.findViewById(R.id.weather_title);
        back = (Button) view.findViewById(R.id.weather_back);
        listView = (ListView) view.findViewById(R.id.weather_listView);
        list = new ArrayList<>();
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        queryProvince();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }

    //根据数据查询如果没有数据请求服务器
    private void queryProvince() {
        title.setText(R.string.querying);
        listProvince = DataSupport.findAll(Province.class);
        if (listProvince.size() > 0){
            list.clear();
            for (Province province : listProvince){
                  list.add(province.getProvinceName());
                  Log.e("list", list.toString());
            }
            adapter.notifyDataSetChanged();
            listView.setSelection(0);
        }else{
            queryFromServer(Url.Test3,"province");
        }
    }

    private void queryFromServer(String address,final String type){
        showProgressDialog();
        HttpUtils.sendOkHttpRequest(address, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                closeProgressDialog();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                boolean result = false;
                if ("province".equals(type)) {
                    result = AnalysisUtils.handleProvinceResponse(response.body().toString());
                }
                if (result){
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            closeProgressDialog();
                            if ("province".equals(type)){
                                queryProvince();
                            }
                        }
                    });
                }
            }
        });
    }

    private void showProgressDialog(){
        materialDialog = new MaterialDialog.Builder(getActivity())
        .title(R.string.material_dialogs)
        .content(R.string.loading)
        .progress(false,100,true)
        .progressNumberFormat("%1d/%2d")
        .show();
    }

    private void closeProgressDialog(){
        materialDialog.dismiss();
    }

    private TextView title;
    private Button back;
    private ListView listView;
    private List<String> list;
    private View view;
    private ArrayAdapter<String> adapter;
    private List<Province> listProvince;
    private MaterialDialog materialDialog;
}
