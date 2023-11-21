package com.pluralsight;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Scanner;

import static com.pluralsight.Shape.parseColor;

public class MainApp {
    public static Scanner scanner = new Scanner(System.in);

    // The world is your canvas
    public static World world;

    //The turtle is your pen
    public static Turtle turtle;
    public static Point2D.Double location;
    public static Color color;
    public static int border;
    public static double xCoordinate, yCoordinate, radius, length, width, sideLength;
    public static String tempColor;


    public static void main(String[] args) {
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
        homeScreen();
    }
    public static void homeScreen() {

        System.out.println("What would you like to do? \n" +
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
                "T) Triangle\n" +
                "H) Return to home");
        String shapeChoice = scanner.nextLine().toUpperCase();

        switch(shapeChoice) {
            case "S":
                System.out.println("What color square will Scoot draw?\n " +
                        "Color Options: red, blue, green, magenta, or cyan\n");
                tempColor = scanner.nextLine().toLowerCase();
                System.out.println("What is the width of the square's border?\n");
                border = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What is the placement of the square on the canvas?\n" + "Enter the X Coordinate: ");
                xCoordinate = scanner.nextDouble();
                System.out.println("Enter Y Coordinate\n");
                yCoordinate = scanner.nextDouble();
                location = new Point2D.Double(xCoordinate, yCoordinate);
                color = parseColor(tempColor);

                Square square = new Square(turtle, location, border, color);
                square.paint();
                System.out.println("Scoot made a square!");
                homeScreen();

                break;

            case "C":
                System.out.println("What color circle will Scoot draw?\n" +
                        "Color Options: red, blue, green, magenta, or cyan\n");

                tempColor = scanner.nextLine();
                System.out.println("What is the width of the circle's border?\n");
                border = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What size circle do you want Scoot to draw?\n");
                radius = scanner.nextDouble();
                System.out.println("What is the placement of the circle on the canvas?\n" + "Enter X Coordinate: ");
                xCoordinate = scanner.nextDouble();
                System.out.println("Enter Y Coordinate: ");
                yCoordinate = scanner.nextDouble();
                scanner.nextLine();
                location = new Point2D.Double(xCoordinate,yCoordinate);
                color = parseColor(tempColor);

                Circle circle = new Circle(turtle, location, border, color, radius);
                circle.paint();
                System.out.println("Scoot made a circle!");
                homeScreen();




                break;

            case "R":
                System.out.println("What color rectangle should Scoot draw?\n " +
                        "Color Options: red, blue, green, magenta, or cyan\n");
                tempColor = scanner.nextLine();
                System.out.println("What is the width of the rectangle's border?\n");
                border = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What is the length of the rectangle?\n");
                length = scanner.nextDouble();
                System.out.println("What is the width of the rectangle?\n");
                width = scanner.nextDouble();
                System.out.println("What is the placement of the rectangle on the canvas?\n" + "Enter X Coordinate: ");
                xCoordinate = scanner.nextDouble();
                System.out.println("Enter Y Coordinate: ");
                yCoordinate = scanner.nextDouble();
                scanner.nextLine();
                location = new Point2D.Double(xCoordinate,yCoordinate);
                color = parseColor(tempColor);

                Rectangle rectangle = new Rectangle(turtle,location,border,color, length, width);
                rectangle.paint();
                System.out.println("Scoot made a rectangle!");
                homeScreen();


                break;

            case "T":
                System.out.println("What color triangle should Scoot draw?\n " +
                        "Color Options: red, blue, green, magenta, or cyan\n");
                tempColor = scanner.nextLine();
                System.out.println("What is the width of the triangle's border?\n");
                border = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What is the length of the triangle's sides?\n");
                sideLength = scanner.nextDouble();
                System.out.println("What is the placement of the triangle on the canvas?\n" + "Enter X Coordinate: ");
                xCoordinate = scanner.nextDouble();
                System.out.println("Enter Y Coordinate: ");
                yCoordinate = scanner.nextDouble();
                scanner.nextLine();
                location = new Point2D.Double(xCoordinate,yCoordinate);
                color = parseColor(tempColor);

                Triangle triangle = new Triangle (turtle,location,border,color, sideLength);
                triangle.paint();
                System.out.println("Scoot made a triangle!");
                homeScreen();






            case "H":
                homeScreen();
                break;

        }


    }


    public static void  saveShape(){
        String directoryPath = "Workshops/TurtlePaint/savedimages";
        System.out.println("Enter the filename to save your drawing:\n" + " Hint: Make sure to add .png to end of your filename!");
        String filename = scanner.nextLine();

        world.saveAsPNG(directoryPath, filename);
        System.out.println("Success! Your image was saved! Check it out under: Workshops/TurtlePaint/savedimages");
        homeScreen();
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
