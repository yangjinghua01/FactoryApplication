package com.example.factoryapplication.simple2;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesUtils {
    private volatile static PreferencesUtils mInstance;
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor editor;

    private PreferencesUtils() {

    }

    public void init(Context context) {
        mPreferences = context.getApplicationContext().getSharedPreferences("cache", Context.MODE_PRIVATE);
    }

    public static PreferencesUtils getInstance() {
        if (mInstance == null) {
            synchronized (PreferencesUtils.class) {
                if (mInstance == null) {
                    mInstance = new PreferencesUtils();
                }
            }
        }
        return mInstance;
    }

    public PreferencesUtils saveString(String key, String value) {
        editor.putString(key, value);
        return this;
    }

    public void commit() {
        editor.commit();
    }

    public String getString(String key) {
        return mPreferences.getString(key, "");
    }
}
