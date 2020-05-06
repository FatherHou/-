package com.example.a52323.ycysztest;

import android.media.MediaPlayer;
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

public class Room1 extends AppCompatActivity {

    private TextView textView;
    public static final String ENCODING = "UTF-8";
    String s = "你刚来到这个房间，墙上一个醒目的计时器便启动了，倒计时仅剩5秒。环顾四周，发现墙壁上有一个按钮，按钮上映着一个数字：495。此时你决定：";
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest="当前页面是房间1 ";
    private String str;
//    final MediaPlayer mPlayer= MediaPlayer.create(this, R.raw.aaa);

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
        setContentView(R.layout.r1);
        textView = ((TextView) findViewById(R.id.textView3));
        tiaoziUtil = new org.crazyit.activity.TiaoZiUtil(textView, s, 20);
        Button bn1 = (Button) findViewById(R.id.button12);
        Button bn2 = (Button) findViewById(R.id.button13);
        Button bn3 = (Button) findViewById(R.id.button14);
        Button bn4=(Button)findViewById(R.id.button52);
        Button bn5=(Button)findViewById(R.id.button59);
        // 初始化MediaPlayer对象，准备播放音乐
        final MediaPlayer mPlayer = MediaPlayer.create(
                Room1.this, R.raw.aaa);
        mPlayer.setLooping(true);
        mPlayer.start();

        //A选项按钮监听器
        bn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间1a 这个按钮是A";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间1a 这个按钮是A", "");
                Intent intent = new Intent(Room1.this, Room1a.class);
                startActivity(intent);
            }

        });
        //B选项按钮监听器
        bn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间1b 这个按钮是B";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间1b 这个按钮是B", "");
                Intent intent = new Intent(Room1.this, Room1b.class);
                startActivity(intent);
            }

        });
        //C选项按钮监听器
        bn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间1c 这个按钮是C";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间1c 这个按钮是C", "");
                Intent intent = new Intent(Room1.this, Room1c.class);
                startActivity(intent);
            }

        });
        bn4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                str="Room1";
                writeTxt(str);
            }
        });

        bn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间1c 这个按钮是C";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间1c 这个按钮是C", "");
                Intent intent = new Intent(Room1.this, Room1c.class);
                startActivity(intent);
            }

        });
        bn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间开始界面 这个按钮是Back";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间开始界面 这个按钮是Back", "");
                Intent intent = new Intent(Room1.this, MainActivity.class);
                startActivity(intent);
            }

        });


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
    public static void writeTxt(String str){
        try {
            FileWriter fw = new FileWriter("/mnt/sdcard/cundang.txt");
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


