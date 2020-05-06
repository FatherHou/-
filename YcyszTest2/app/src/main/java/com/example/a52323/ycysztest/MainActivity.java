package com.example.a52323.ycysztest;

import android.annotation.SuppressLint;
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
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.String;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private String strtest="当前页面是开始菜单 ";
    //private File savefile=new File("/mnt/sdcard/cundang.txt");
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
        setContentView(R.layout.activity_main);
        Button bn1=(Button) findViewById(R.id.button);
        Button bn2=(Button) findViewById(R.id.button5);
        Button bn4=(Button) findViewById(R.id.button3);
        Button bn5=(Button) findViewById(R.id.button4);
        //开始游戏按钮监听器
        bn1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
/*                    savefile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
                strtest=strtest+"下个页面是房间1 这个按钮是开始游戏";
                stringTxt(strtest);
                strtest=strtest.replace("下个页面是房间1 这个按钮是开始游戏", "");
                Intent intent = new Intent(MainActivity.this,Op1.class);
                startActivity(intent);
            }

        });
        //继续游戏按钮监听器
        bn2.setOnClickListener(new OnClickListener()
        {
            @SuppressLint("SdCardPath")
            @Override
            public void onClick(View source)
            {
                String s="";
                try {
//							FileReader fr=new FileReader("/mnt/sdcard/cundang.txt");
                    s=s+getFile("/mnt/sdcard/cundang.txt");
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
//						Toast toast=Toast.makeText(StartActivity.this, s, Toast.LENGTH_SHORT);
//						toast.show();
                if(s.equals("Room1"))
                {
                    Intent intent = new Intent(MainActivity.this
                            ,Room1.class);
                    //启动intent对应的Activity
                    startActivity(intent);
                }
                else if(s.equals("Room2"))
                {
                    Intent intent = new Intent(MainActivity.this
                            ,Room2.class);
                    //启动intent对应的Activity
                    startActivity(intent);
                }
                else if(s.equals("Room3"))
                {
                    Intent intent = new Intent(MainActivity.this
                            ,Room3.class);
                    //启动intent对应的Activity
                    startActivity(intent);
                }
                else if(s.equals("Room4"))
                {
                    Intent intent = new Intent(MainActivity.this
                            ,Room4.class);
                    //启动intent对应的Activity
                    startActivity(intent);
                }
                else if(s.equals("Room5"))
                {
                    Intent intent = new Intent(MainActivity.this
                            ,Room5.class);
                    //启动intent对应的Activity
                    startActivity(intent);
                }
                else if(s.equals("Room6"))
                {
                    Intent intent = new Intent(MainActivity.this
                            ,Room6.class);
                    //启动intent对应的Activity
                    startActivity(intent);
                }
                else if(s.equals("Room7"))
                {
                    Intent intent = new Intent(MainActivity.this
                            ,Room7.class);
                    //启动intent对应的Activity
                    startActivity(intent);
                }
            }

        });
        //作者名单按钮游戏监听器
        bn4.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                    Intent intent = new Intent(MainActivity.this,anthor.class);
                    startActivity(intent);
            }

        });
        //退出游戏按钮游戏监听器
        bn5.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                Intent intent=new Intent();
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addCategory("android.intent.category.MONKEY");
                startActivity(intent);
            }

        });

        // 初始化MediaPlayer对象，准备播放音乐
        final MediaPlayer mPlayer = MediaPlayer.create(
                MainActivity.this, R.raw.earth);
        mPlayer.setLooping(true);
        mPlayer.start();
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
    public static String getFile(String fileName) {
        try {
            // 创建文件
            File file = new File(fileName);
            // 创建FileInputStream对象
            FileInputStream fis = new FileInputStream(file);
            // 创建字节数组 每次缓冲1M
            byte[] b = new byte[1024];
            int len = 0;// 一次读取1024字节大小，没有数据后返回-1.
            // 创建ByteArrayOutputStream对象
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            // 一次读取1024个字节，然后往字符输出流中写读取的字节数
            while ((len = fis.read(b)) != -1) {
                baos.write(b, 0, len);
            }
            // 将读取的字节总数生成字节数组
            byte[] data = baos.toByteArray();
            // 关闭字节输出流
            baos.close();
            // 关闭文件输入流
            fis.close();
            // 返回字符串对象
            return new String(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}

