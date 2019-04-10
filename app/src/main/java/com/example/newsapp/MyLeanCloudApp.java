package com.example.newsapp;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;


public class MyLeanCloudApp extends Application {
    public  final static String HTTPNET="http://api.coindog.com/live/list";

    @Override
    public void onCreate() {
        super.onCreate();

        //leancloud注册
        AVOSCloud.initialize(this,"hXszuq0oADNedAr3P8IJHFe7-gzGzoHsz","IzUyBcmEYHU1c4fPd7eiUWyP");
        //开启调试日志 放在 SDK 初始化语句 AVOSCloud.initialize() 后面，只需要调用一次即可,
        AVOSCloud.setDebugLogEnabled(true);
    }
}
