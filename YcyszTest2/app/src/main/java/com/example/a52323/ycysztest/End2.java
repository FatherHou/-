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

public class End2 extends AppCompatActivity {
    private TextView textView;
    public static final String ENCODING = "UTF-8";
    String s = "开机后，电脑右下角赫然显示着：2018年9月13日，18：00。 原来我在里面待了一整天了啊……你这样想着。 不好！13号……今晚上不就要交报告了么。可恶，宿舍的网那么差，在这里把代码写完再回去吧。 你骂骂咧咧地打开了Android studio，继续写一款名为《回到机房》的手机游戏的接口交互代码。好在，之前已完成了大半的工作，剩下的任务并不是很多了……你庆幸地想着。 一会儿回去，肯定得跟那帮家伙们好好地吹一吹爸爸的经历。一天没回来，这些二货该不会以为我出去浪了吧…… 有一搭没一搭地想着，你写完了剩下的代码。调试、纠错、运行……一切看起来十分完美。你提交完报告，收拾好自己的东西，走出机房，离开了实验楼。 外面的世界一如既往的安静祥和，傍晚的太阳慵懒地照着，路上也不见个学生的身影，看来大家都下课回去了吧。 你伸了伸懒腰，深吸了一口久违的新鲜空气。 啊，这世界可真美好……你长出了一口气，想着之前一系列惊险恐怖的场景，回来可真好啊…… 你掏出充了一部分电的手机，开机。看着熟悉的开机画面，你觉得回到了久违的现实世界，而刚刚经历的东西，就把它们当成一个梦吧。  你看了看时间，才下午六点。 时间还早，犒劳一下自己，吃点儿好的去吧。 这样想着，你收起手机，向前走去。 （完)";
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest = "当前页面是房间结局2 ";
 //   final MediaPlayer mPlayer= MediaPlayer.create(this, R.raw.iii);
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
        setContentView(R.layout.ed2);
        textView = ((TextView) findViewById(R.id.textView33));
        tiaoziUtil = new org.crazyit.activity.TiaoZiUtil(textView, s, 20);
        Button bn = (Button) findViewById(R.id.button51);
        // 初始化MediaPlayer对象，准备播放音乐
        final MediaPlayer mPlayer = MediaPlayer.create(
                End2.this, R.raw.iii);
        mPlayer.setLooping(true);
        mPlayer.start();
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest = strtest + "下个页面是结局2 这个按钮是进入开始界面";
                stringTxt(strtest);
                strtest = strtest.replace("下个页面是结局2 这个按钮是进入开始界面", "");
                Intent intent = new Intent(End2.this, MainActivity.class);
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
