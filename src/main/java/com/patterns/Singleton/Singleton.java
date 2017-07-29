package com.patterns.Singleton;

/**
 * Created by Vetriselvan on 29-07-2017.
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getSingleton() {
        return SingletonHolder.INSTANCE;
    }
}
