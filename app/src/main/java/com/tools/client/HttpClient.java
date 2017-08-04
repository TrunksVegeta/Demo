package com.tools.client;

import com.tools.entity.Retrofit_Bean;
import com.tools.http.RetrofitTest;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by Administrator on 2017/7/6.
 */

public class HttpClient {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(com.tools.http.Url.Test2)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    RetrofitTest retrofitTest = retrofit.create(RetrofitTest.class);

    public Call<Retrofit_Bean> getData(String num, String index){
        return retrofitTest.getIndex(num,index);
    }
}
