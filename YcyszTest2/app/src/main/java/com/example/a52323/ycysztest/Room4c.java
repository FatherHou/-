package com.example.a52323.ycysztest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.Window;
import android.view.WindowManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.io.FileWriter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Room4c extends AppCompatActivity {
    private TextView textView;
    public static final String ENCODING = "UTF-8";
    String s = "你的冷漠招来他的咒骂，你依旧不为所动，走向下一扇门，存活";
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest="当前页面是房间4c ";
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
        setContentView(R.layout.r4c);
        textView = ((TextView) findViewById(R.id.textView17));
        tiaoziUtil = new org.crazyit.activity.TiaoZiUtil(textView, s, 20);
        Button bn = (Button) findViewById(R.id.button29);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间4c 这个按钮是进入房间5";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间4c 这个按钮是进入房间5", "");
                Intent intent = new Intent(Room4c.this, Room5.class);
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
}
