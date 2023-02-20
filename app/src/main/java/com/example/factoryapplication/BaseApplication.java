package com.example.factoryapplication;

import android.app.Application;

import com.example.factoryapplication.simple2.PreferencesUtils;

public class BaseApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesUtils.getInstance().init(this);
    }
}
