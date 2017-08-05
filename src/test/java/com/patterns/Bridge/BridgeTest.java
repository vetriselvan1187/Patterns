package com.patterns.Bridge;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Vetriselvan on 05-08-2017.
 */
public class BridgeTest {

    List<Shape> shapes;

    @Before
    public void setUp(){
        shapes = new ArrayList<Shape>();
    }

    @Test
    public void testCircleShapeWithTwoPointFivePerncent() {
        shapes.add(new CircleShape(1, 2, 3, new DrawingAPI1()));
        shapes.add(new CircleShape(2, 3, 5, new DrawingAPI2()));

        for(Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }

    @After
    public void tearDown(){
        shapes = null;
    }
}
