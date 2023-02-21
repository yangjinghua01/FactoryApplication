package com.example.factoryapplication.simple5;

import com.example.factoryapplication.simple3.IoHandler;
import com.example.factoryapplication.simple3.PreferenceIOHandler;

/**
 * 工厂设计模式里的简单工厂
 */
public class IOHandlerFactory {
    /**
     * 通过传入class泛型来实例化对象。
     *
     * @param ioHanderClass
     * @return
     */
    public static IOHandler createIOHandler(Class<? extends IOHandler> ioHanderClass) {
        try {
            return ioHanderClass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return new PreferencesIOHandler();
    }

    /**
     * 在工厂里直接创建对象
     *
     * @return
     */
    public static IOHandler getMemoryHandler() {
        return createIOHandler(MemoryIOHandler.class);
    }
}
