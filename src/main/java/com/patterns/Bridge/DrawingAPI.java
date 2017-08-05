package com.patterns.Bridge;

/**
 * Created by Vetriselvan on 05-08-2017.
 */
interface DrawingAPI {
    public void drawCircle(final double x, final double y, final double radius);
}

class DrawingAPI1 implements DrawingAPI {

    public void drawCircle(final double x, final double y, final double radius) {
        System.out.printf("API1 Circle at %f:%f radius %f\n", x, y, radius);
    }
}

class DrawingAPI2 implements DrawingAPI {

    public void drawCircle(final double x, final double y, final double radius) {
        System.out.printf("API2 Circle at %f:%f radius %f\n", x, y, radius);
    }
}