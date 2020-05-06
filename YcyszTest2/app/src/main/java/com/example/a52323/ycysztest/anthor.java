package com.example.a52323.ycysztest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.Window;

public class anthor extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    public static final String ENCODING = "UTF-8";
    //String s = "你刚来到这个房间，墙上一个醒目的计时器便启动了，倒计时仅剩5秒。环顾四周，发现墙壁上有一个按钮，按钮上映着一个数字：495。此时你决定：";
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest="点击了制作人名单";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 获取窗口管理器
        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        // 获得屏幕宽和高
        display.getMetrics(metrics);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.author1);
        textView1 = ((TextView) findViewById(R.id.textView34));
        textView2 = ((TextView) findViewById(R.id.textView35));
        textView3 = ((TextView) findViewById(R.id.textView36));
        textView4 = ((TextView) findViewById(R.id.textView37));
        stringTxt(strtest);
        strtest.replace("点击了制作人名单","");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    public static void stringTxt(String str) {
        try {
            SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String time = now.format(date);
            String s = time + " " + str;
            //包含创建新文件功能
            FileWriter fw = new FileWriter("/mnt/sdcard/jilu.txt", true);
            fw.write(s + "\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


