package com.tools.http;

import com.tools.entity.BannerBean;
import com.tools.entity.Retrofit_Bean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/7/6.
 */

public interface RetrofitTest {

    @GET("{num}/{index}")
    Call<Retrofit_Bean> getIndex(@Path("num") String num, @Path("index")String index);

    @GET("{itemCount}item.json")
    Call<BannerBean> getBanner(@Path("itemCount") int itemCount);
}
