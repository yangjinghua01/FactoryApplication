package com.example.factoryapplication.simple4;


public class PreferencesIOFactory implements IOFactory{
    @Override
    public IOHandler createIOHandler() {
        return new PreferencesIOHandler();
    }
}
