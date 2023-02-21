package com.example.factoryapplication.simple4;

/**
 * 运行内存存储的 Factory
 *
 */

public class MemoryIOFactory implements IOFactory{
    @Override
    public IOHandler createIOHandler() {
        return new MemoryIOHandler();
    }
}
