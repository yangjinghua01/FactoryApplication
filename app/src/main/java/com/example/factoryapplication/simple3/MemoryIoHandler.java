package com.example.factoryapplication.simple3;

import android.util.LruCache;

public class MemoryIoHandler implements IoHandler {
    //存在内存里面，原理是什么？其实就是Map集合
    private static LruCache<String, Object> mCache = new LruCache<>(10 * 1024 * 1024);

    @Override
    public void save(String key, String value) {
        mCache.put(key, value);
    }

    @Override
    public void save(String key, double value) {

    }

    @Override
    public void save(String key, int value) {

    }

    @Override
    public void save(String key, long value) {

    }

    @Override
    public void save(String key, boolean value) {

    }

    @Override
    public void save(String key, Object value) {

    }

    @Override
    public String getString(String key, String defaultValue) {
        return (String) mCache.get(key);
    }

    @Override
    public double getdouble(String key, double defaultValue) {
        return 0;
    }

    @Override
    public int getint(String key, int defaultValue) {
        return 0;
    }

    @Override
    public Long getlong(String key, long defaultValue) {
        return null;
    }

    @Override
    public Boolean getboolean(String key, boolean defaultValue) {
        return null;
    }

    @Override
    public Object getObj(String key, Object defaultValue) {
        return null;
    }
}
