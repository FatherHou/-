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
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.io.FileWriter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Op1 extends AppCompatActivity
{
    private TextView textView;
    public static final String ENCODING = "UTF-8";
    String s = "哐……哐……哐…… 一阵强烈的震动…… 你的意识逐渐恢复…… 震动声消失了，你醒了过来，你试着睁开眼，却被刺眼的灯光晃得头晕目眩。 好不容易适应了四周的亮度，你看到一片天花板，自己似乎是躺在某个房间的地板上。你想挪动身体爬起来，却发现浑身酸痛，四肢无力。 好疼……我是谁？我为什么会在这儿躺着？ 奇怪……我记得的最后一件事是在机房写代码，然后好像迷迷糊糊睡过去了……为什么会在这里醒过来？ 我到底睡了多久……你记得“今天”是2018年9月13日——就是你在机房写代码的日子。可恶……明天就要交报告了……我得赶紧回去啊…… 又过了一会儿，你挣扎着爬了起来，开始观察四周的环境。这是一个四四方方的房间。房间的六个面都由一些正方形的一米见方的格子组成，格子间有分隔，但是拼接得严丝合缝，根本无法撬开。房间里面十分干净，而且什么都没有，甚至没有灯，但是似乎每个格子都在发亮，所以看起来没有任何阴暗的死角。有一面墙上的一个格子被做成了像一扇小门的样子。" ;
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest = "当前页面是op1 ";
   // final MediaPlayer mPlayer= MediaPlayer.create(this, R.raw.hhh);
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
        setContentView(R.layout.op1);
        textView = ((TextView) findViewById(R.id.textView31));

        tiaoziUtil = new org.crazyit.activity.TiaoZiUtil(textView, s, 20);
        Button bn = (Button) findViewById(R.id.button48);
        // 初始化MediaPlayer对象，准备播放音乐
        final MediaPlayer mPlayer = MediaPlayer.create(
                Op1.this, R.raw.hhh);
        mPlayer.setLooping(true);
        mPlayer.start();
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest = strtest + "下个页面是op1 这个按钮是进入op2";
                stringTxt(strtest);
                strtest = strtest.replace("下个页面是op1 这个按钮是进入op2", "");
                Intent intent = new Intent(Op1.this, Op2.class);
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