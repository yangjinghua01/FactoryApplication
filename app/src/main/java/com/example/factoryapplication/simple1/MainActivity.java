package com.example.factoryapplication.simple1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.factoryapplication.R;

/**
 * 模式定义：
 * 定义一个创建对象的接口，让子类决定实例化那个类，而对象的创建统一交由工厂去生成，有良好的封装性，既做到类解耦也保证类做少知识原则。
 * 任何设计模式都是用来解决一些特定场景问题的一种思想，那么如果你在开发中遇到某一问题，可以回顾所以知识，是不是可以用设计模式去解决
 * 一个一个问题来分析解决，MVP
 */
public class MainActivity extends AppCompatActivity {
private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.test_tv);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                用户的登录信息或者其他信息大家怎么保存的 sp
                SharedPreferences cache = getSharedPreferences("cache", Context.MODE_PRIVATE);
                cache.edit().putString("userName","yjh").putString("age","990820").commit();
            }
        });
    }
}