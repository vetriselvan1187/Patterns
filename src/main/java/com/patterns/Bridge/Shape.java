package com.patterns.Bridge;

/**
 * Created by Vetriselvan on 05-08-2017.
 */
abstract class Shape {

    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
    public abstract void resizeByPercentage(final double pct);
}

class CircleShape extends Shape {
    private double x, y, radius;

    public CircleShape(final double x, final double y, final double radius, DrawingAPI drawingAPI){
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    public void resizeByPercentage(final double pct) {
        radius *= (1.0 + pct / 100.00);
    }
}
