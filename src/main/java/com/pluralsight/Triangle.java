package com.pluralsight;

import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape{
   protected double sideLength;

    public Triangle(Turtle turtle, Point2D.Double location, double border, Color color, double sideLength) {
        super(turtle, location, border, color);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {
        turtle.setColor(this.color);
        turtle.setPenWidth(this.border);
        turtle.penUp();
        turtle.goTo(this.location);
        turtle.penDown();
        turtle.setDelay(1);

        for (int i = 0; i < 3; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(120);
            // Turn 120 degrees for an equilateral triangle
        }





    }
}

