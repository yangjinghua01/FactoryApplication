package com.example.factoryapplication.simple4;

public class DiskIOFactory implements IOFactory{
    @Override
    public IOHandler createIOHandler() {
        return new DiskIOHandler();
    }
}
