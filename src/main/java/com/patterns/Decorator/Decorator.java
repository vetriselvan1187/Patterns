package com.patterns.Decorator;

import javax.swing.border.Border;

/**
 * Created by Vetriselvan on 04-08-2017.
 */
abstract class Decorator implements Widget {

    Widget widget;
    public Decorator(Widget widget){
        this.widget = widget;
    }

    public void draw(){
        this.widget.draw();
    }
}

class BorderDecorator extends Decorator {

    public BorderDecorator(Widget widget){
        super(widget);
    }

    public void draw(){
        super.draw();
        System.out.println("extra functionalites of border decorator");
    }
}

class ScrollDecorator extends Decorator {

    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("extra functionalities of scroll decroator");
    }
}