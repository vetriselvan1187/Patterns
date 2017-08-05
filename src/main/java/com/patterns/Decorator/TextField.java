package com.patterns.Decorator;

/**
 * Created by Vetriselvan on 04-08-2017.
 */
public class TextField implements Widget {

    private int width;
    private int height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw(){
        System.out.println("TextFiled = "+ width+" , "+height);
    }
}

