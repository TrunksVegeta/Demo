package com.tools;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.tools.adapter.SysApp_Adapter;
import com.tools.base.MyBaseActivity;
import com.tools.entity.SystemApp_Bean;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 * 常用的系统应用
 */

public class SystemAppActivity extends MyBaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sysapp;
    }

    @Override
    protected void findViewByid() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView2);
        list = new ArrayList<>();
        adapter = new SysApp_Adapter(list, this);
    }

    @Override
    protected void Operate() {
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        list.add(new SystemApp_Bean(R.string.sys_title_text, R.mipmap.ic_launcher));
        list.add(new SystemApp_Bean(R.string.sys_title_text2, R.mipmap.ic_launcher));
        list.add(new SystemApp_Bean(R.string.sys_title_text3, R.mipmap.ic_launcher));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new SysApp_Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        String state = Environment.getExternalStorageState();
                        if (state.equals(Environment.MEDIA_MOUNTED)) {
                            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            Format format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                            File outFile = new File(Environment.getExternalStorageDirectory()
                                    + File.separator + Environment.DIRECTORY_DCIM + "/Camera"
                                    , format.format(new Date()) + ".jpg");
                            intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(outFile));
                            intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
                            startActivityForResult(intent, 100);
                        } else {
                            Toast.makeText(SystemAppActivity.this,
                                    "请确认是否有SD卡", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case 1:
                        Intent intent = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
                        startActivityForResult(intent, 0);
                        break;
                    case 2:
                        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED) == true) {
                            Intent intent1 = null;
                            intent1 = new Intent();
                            File file = new File(FILE_PATH + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
                                    .format(new java.util.Date()) + ".mp4");
                            intent1.setAction("android.media.action.VIDEO_CAPTURE");
                            intent1.addCategory("android.intent.category.DEFAULT");
                            intent1.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                            intent1.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
                            startActivityForResult(intent1, 0);
                        } else {
                            Toast.makeText(SystemAppActivity.this, "sd卡不存在", Toast.LENGTH_SHORT).show();
                        }
                        break;
                }
            }
        });
    }

    private RecyclerView recyclerView;
    private List<SystemApp_Bean> list;
    private SysApp_Adapter adapter;
    // 存放录像路径
    private static final String FILE_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/video/";
}
