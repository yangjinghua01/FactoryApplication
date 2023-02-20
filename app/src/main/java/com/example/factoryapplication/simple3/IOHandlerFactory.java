package com.example.factoryapplication.simple3;

/**
 * 工厂设计模式里的简单工厂
 */
public class IOHandlerFactory {
    public enum IOType {
        MEMORY, PREDERENCES
    }

    public static IoHandler createIOHandler(IOType type) {
        switch (type) {
            case MEMORY:
//                直接返回对象，有的时候需要我们创建对象之后我们需要初始化一系列参数。
                return new MemoryIoHandler();
            case PREDERENCES:
                return new PreferenceIOHandler();
            default:
                return null;
        }
    }
}
