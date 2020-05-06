package com.example.a52323.ycysztest;

import android.content.Intent;
import android.media.MediaPlayer;
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
import android.widget.ResourceCursorAdapter;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.io.FileWriter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Room4 extends AppCompatActivity {

    private TextView textView;
    public static final String ENCODING = "UTF-8";
    String s = "你进入房间，发现有个人被困在铁笼中，见你进来他立刻向你求救：“救救我吧，只要你摁下那边的开关就行。”你决定：";
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest="当前页面是房间4 ";
    private String str;
  //  final MediaPlayer mPlayer= MediaPlayer.create(this, R.raw.ddd);

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
        setContentView(R.layout.r4);
        textView = ((TextView) findViewById(R.id.textView14));
        tiaoziUtil = new org.crazyit.activity.TiaoZiUtil(textView, s, 20);
        Button bn1 = (Button) findViewById(R.id.button24);
        Button bn2 = (Button) findViewById(R.id.button25);
        Button bn3 = (Button) findViewById(R.id.button26);
        Button bn4=(Button)findViewById(R.id.button55);
        Button bn5=(Button)findViewById(R.id.button61);
        // 初始化MediaPlayer对象，准备播放音乐
        final MediaPlayer mPlayer = MediaPlayer.create(
                Room4.this, R.raw.ddd);
        mPlayer.setLooping(true);
        mPlayer.start();

        //A选项按钮监听器
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间4 这个按钮是进入房间4a";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间4 这个按钮是进入房间4a", "");
                Intent intent = new Intent(Room4.this, Room4a.class);
                startActivity(intent);
            }

        });
        //B选项按钮监听器
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间4 这个按钮是进入房间4b";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间4 这个按钮是进入房间4b", "");
                Intent intent = new Intent(Room4.this, Room4b.class);
                startActivity(intent);
            }

        });
        //C选项按钮监听器
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是房间4 这个按钮是进入房间4c";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间4 这个按钮是进入房间4c", "");
                Intent intent = new Intent(Room4.this, Room4c.class);
                startActivity(intent);
            }

        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str="Room4";
                writeTxt(str);
            }
        });

        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是开始界面 这个按钮是Back";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是开始界面 这个按钮是Back", "");
                Intent intent = new Intent(Room4.this, MainActivity.class);
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


