package com.example.factoryapplication.simple3;

/**
 * 数据存储的一些规范
 */
public interface IoHandler {
    /*****************保存数据开始**********************/
    void save(String key, String value);

    void save(String key, double value);

    void save(String key, int value);

    void save(String key, long value);

    void save(String key, boolean value);

    void save(String key, Object value);

    /******************保存数据结束*****************/

    /********************获取数据***********************/
    String getString(String key, String defaultValue);

    double getdouble(String key, double defaultValue);

    int getint(String key, int defaultValue);

    Long getlong(String key, long defaultValue);

    Boolean getboolean(String key, boolean defaultValue);

    Object getObj(String key, Object defaultValue);
}
