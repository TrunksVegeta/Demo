package com.tools.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tools.R;
import com.tools.entity.Retrofit_Bean;

import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */

public class Retofit_Adapter extends RecyclerView.Adapter<Retofit_Adapter.ViewHolder> {

    private List<Retrofit_Bean.ResultsBean> list;
    private Context context;

    public Retofit_Adapter(List<Retrofit_Bean.ResultsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_retrofit,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(context).load(list.get(position).getUrl()).into(holder.imageView);
        holder.textView.setText("接口来自：" + list.get(position).getWho());
        holder.textView2.setText("日期：" + list.get(position).getPublishedAt());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView textView2;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);
            textView2 = (TextView) itemView.findViewById(R.id.textView2);
        }
    }
}
