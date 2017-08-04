package com.tools.entity;

/**
 * Created by Administrator on 2017/7/6.
 */

public class SystemApp_Bean {
    private int title;
    private  int img;

    public SystemApp_Bean(int title, int img) {
        this.title = title;
        this.img = img;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
