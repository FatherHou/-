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

public class End1 extends AppCompatActivity {
    private TextView textView;
    public static final String ENCODING = "UTF-8";
    String s = "你在通道里前进了一会儿，这个通道似乎比之前经过的所有的通道都长很多你心里没底，但是想着这一路上经历的种种杀机都化险为夷了，心一横继续往前走。 走了几步，黑暗中你撞上了什么东西，原来到头了。你推了推门，门开了，门后一片黑暗，你小心翼翼地走了进去。 刚走进去，门就关上了，你吓了一跳，背靠着门胡乱张望着，努力想看清四周的环境。突然，一片昏暗的灯光亮了起来，你借着灯光，发现这里是一个十分宽阔的大厅。“终于不是之前的杀人房间了……”你这样想着。 你壮着胆子向前走了几步，继续观察周围的环境。忽然发现不远处的墙边站着两个人，穿着西装、戴着墨镜，正对着耳麦说着什么。你不禁后退了两步，可他们已经看向了你，并朝你走了过来。你心脏狂跳，几乎要叫出声来，但你突然失去了意识…… 不知道过了多久，你醒了过来。你检查了一下自己的情况，身上没有受伤的痕迹，连眼镜也完好无损地戴在自己脸上。 你又看了看四周的环境。 这……这不是机房的角落吗？我居然回来了？ 奇怪……难到之前真的是一场梦？不对啊，我怎么会跑到这里睡着了呢？ 你掏出手机想看看时间，发现手机电量过低已经打不开了。你估算了一下，自己在那个杀人迷宫里大概待了大半天的时间，手机也该没电了。好在机房里没断电，你把电源线接好，打开了电脑，顺便给手机充上了电。";
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest="当前页面是房间结局1 ";
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
        setContentView(R.layout.ed1);
        textView = ((TextView) findViewById(R.id.textView32));

        tiaoziUtil = new org.crazyit.activity.TiaoZiUtil(textView, s, 20);
        Button bn = (Button) findViewById(R.id.button50);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest=strtest+"下个页面是结局1 这个按钮是进入结局2";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是结局1 这个按钮是进入结局2", "");
                Intent intent = new Intent(End1.this, End2.class);
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