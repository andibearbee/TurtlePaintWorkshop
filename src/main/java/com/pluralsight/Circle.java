package com.pluralsight;

import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends Shape{
    protected double radius;

    public Circle(Turtle turtle, Point2D.Double location, double border, Color color, double radius) {
        super(turtle, location, border, color);
        this.radius = radius;
    }

    @Override
    public void paint() {

    }
}
