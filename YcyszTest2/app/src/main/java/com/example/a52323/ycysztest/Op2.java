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

public class Op2 extends AppCompatActivity {
    private TextView textView;
    public static final String ENCODING = "UTF-8";
    String s = "你又检查了一下自己身上的情况。除了还有些酸疼之外并没有受伤，衣物也完好无损，而且没有沾染什么尘土。你的随身物品，眼镜、手机、钱包、电脑……几乎都不见了。这个地方是怎么回事？我怎么会来这里？我想回去……\n" +
            "你走到了墙上的门边，观察了一下，没有发现什么有用的线索，只是普通的门。\n" +
            "你试着打开门，门没有锁，你向门里看去，门里是一个内壁光滑的通道，视线向里深入了几米之后便被黑暗吞噬了，不知道通向哪里。\n" +
            "总觉得……这个地方透出一股危险的气息……\n" +
            "你上下打量了一下门口，发现了一些东西：四处隐约有几道被涂抹过的黑色印记，似乎是某种液体所留，通道上方有一行用同样的痕迹写的小字：\n" +
            "没有人能活着离开这儿……\n" +
            "你不自觉地出了一身冷汗。\n" +
            "这个地方果然很古怪……没办法，既然等了很久没有什么变化，只能继续往前走了。";
    private org.crazyit.activity.TiaoZiUtil tiaoziUtil;
    private String strtest = "当前页面是房间结局2 ";

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
        setContentView(R.layout.op2);
        textView = ((TextView) findViewById(R.id.textView30));

        tiaoziUtil = new org.crazyit.activity.TiaoZiUtil(textView, s, 20);
        Button bn = (Button) findViewById(R.id.button49);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strtest = strtest + "下个页面是结局2 这个按钮是进入开始界面";
                stringTxt(strtest);
                strtest = strtest.replace("下个页面是结局2 这个按钮是进入开始界面", "");
                Intent intent = new Intent(Op2.this, Room1.class);
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
