package com.patterns.Decorator;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;

/**
 * Created by Vetriselvan on 04-08-2017.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(5, 4))));
        widget.draw();
    }

}