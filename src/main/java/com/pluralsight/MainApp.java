package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class MainApp {
    public static Scanner scanner = new Scanner(System.in);

    // The world is your canvas
    public static World world;

    //The turtle is your pen
    public static Turtle turtle;

    public static void main(String[] args) {
        homeScreen();
    }
    public static void homeScreen() {
        System.out.println("Welcome to Painting with Scoot! Your very own Turtle Pen Pal! \n" +
                            "What do you want the size of the canvas to be?\n" +
                            "Width: ");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Height: ");
        int height = scanner.nextInt();
        scanner.nextLine();
        world = new World(width, height);
        turtle = new Turtle(world);

        System.out.println("What would you like to do first? \n" +
                        "A) Add Shape \n" +
                        "S) Save Shape \n" +
                        "X) Exit \n");
        String menuChoice = scanner.nextLine().toUpperCase();
        switch (menuChoice) {
            case "A":
                addShape();
                break;
            case "S":
                saveShape();
                break;
            case "X":
                System.exit(0);
                break;
            default:
                System.out.println("Sorry, entry not available.");
                homeScreen();
                break;

        }





    }


    public static void addShape(){
        System.out.println("What shape would you like to draw?\n" +
                "S) Square\n" +
                "C) Circle\n" +
                "R) Rectangle\n" +
                "H) Return to home");
        String shapeChoice = scanner.nextLine().toUpperCase();

        switch(shapeChoice) {
            case "S":
                System.out.println();




                break;

            case "C":



                break;

            case "R":


                break;

            case "H":
                homeScreen();
                break;

        }


    }


    public static void  saveShape(){




    }
}

  /* To make the X --> calculate the hypotenuse (diagonal)
         a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
      double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);*/
