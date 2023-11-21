package com.pluralsight;

import java.awt.*;
import java.awt.geom.Point2D;

public class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(Turtle turtle, Point2D.Double location, double border, Color color, double length, double width) {
        super(turtle, location, border, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void paint() {

    }
}
