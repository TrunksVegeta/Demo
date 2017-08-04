package com.tools.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.tools.R;
import com.tools.entity.Retrofit_Bean;
import com.tools.entity.SystemApp_Bean;

import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */

public class SysApp_Adapter extends RecyclerView.Adapter<SysApp_Adapter.ViewHolder> implements View.OnClickListener {

    private List<SystemApp_Bean> list;
    private Context context;
    private OnItemClickListener onItemClickListener = null;

    public SysApp_Adapter(List<SystemApp_Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(view, (int) view.getTag());
        }
    }

    public static interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sysapp, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(position);
        if (position % 2 != 1)
            holder.layout.setBackgroundColor(context.getResources().getColor(R.color.gray_light));
        else
            holder.layout.setBackgroundColor(context.getResources().getColor(R.color.translucent));
        holder.textView.setText(list.get(position).getTitle());
        holder.imageView.setImageResource(list.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        LinearLayout layout;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView2);
            textView = (TextView) itemView.findViewById(R.id.textView3);
            layout = (LinearLayout) itemView.findViewById(R.id.linerLayout);
        }
    }
}
