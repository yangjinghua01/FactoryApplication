package com.example.factoryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 模式定义：
 * 定义一个创建对象的接口，让子类决定实例化那个类，而对象的创建统一交由工厂去生成，有良好的封装性，既做到类解耦也保证类做少知识原则。
 * 任何设计模式都是用来解决一些特定场景问题的一种思想，那么如果你在开发中遇到某一问题，可以回顾所以知识，是不是可以用设计模式去解决
 * 一个一个问题来分析解决，MVP
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}