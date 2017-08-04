package com.tools.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tools.R;
import com.tools.entity.Test_CompanyInfo;

import java.util.List;

/**
 * Created by 浅子影 on 2017/4/23.
 */

public class Main_Adapter extends BaseAdapter{

    private Context context;
    private LayoutInflater inflater;
    private List<Test_CompanyInfo.DataBean> list;

    public Main_Adapter(Context mContext, List<Test_CompanyInfo.DataBean> list) {
        this.context = mContext;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_main,null);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.name.setText(list.get(position).getName());
        return convertView;
    }

    class ViewHolder{
        TextView name;
    }
}
