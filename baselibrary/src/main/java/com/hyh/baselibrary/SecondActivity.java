package com.hyh.baselibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hyh.baselibrary.inoneinvoke.CreateTips;
import com.hyh.moduleinvoke.MyInvoke;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.tv_text1);
        MyInvoke myInvoke = new MyInvoke();
        //调用子模块MyInvoke的getStr()方法时会转移到调用主模块MyInvoke的getStr()
        textView.setText(myInvoke.getStr());

        TextView textView2 = findViewById(R.id.tv_text2);
        CreateTips createTips = new CreateTips();
        textView2.setText(createTips.getStr());
    }
}
