package edu.uqu.cs;

import java.util.Scanner;

/**
 * This Java project covers exercises related to Chapter 2
 * Follow the instructions in the comments.
 */

public class Lab2Part1
{
    // Declare all constants here
    // Hint: define PI = 3.1415
    public static final double PI = 3.1415;

    public static double calculateCircleArea(double radius) {
        // This method returns the area of the circle with the given radius
        double result = PI*(radius*radius);
        return result;
    }


    public static double calculateCircleCircumference(double radius) {
        // This method returns the circumference of the circle with the given radius
        double result = (2*PI*radius);
        return result;
    }

    public static double calculateRectangleArea(double length, double width) {
        // This method returns the area of the rectangle with given its length and width
        double result = (length*width);
        return result;
    }

    public static double calculateRectangleCircumference(double length, double width) {
        // This method returns the circumference of the rectangle with given its length and width
        double result = (2*length + 2*width);
        return result;
    }

    public static double calculateSquareArea(double sideLength) {
        // This method returns the area of the square with given its side length
        double result = (sideLength*sideLength);
        return result;
    }

    public static double calculateSquareCircumference(double sideLength) {
        // This method returns the circumference of the square with given its side length
        double result = (sideLength*4);
        return result;
    }

    /****************** Do not change the code below *********************/


    public static void main( String[] args )
    {
        System.out.println( "Welcome to the shape calculator for simple geometric shapes" );
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value of the radius of a circle:");
        double r = keyboard.nextDouble();
        System.out.println("The area of the circle is: " + calculateCircleArea(r));
        System.out.println("The circumference of the circle is: " + calculateCircleCircumference(r));

        System.out.println("Enter the width and the length of a rectangle separated by a space: ");
        double l = keyboard.nextDouble();
        double w = keyboard.nextDouble();
        System.out.println("The area of the rectangle is: " + calculateRectangleArea(l, w));
        System.out.println("The circumference of the rectangle is: "
                + calculateRectangleCircumference(w, l));

        System.out.println("Enter the length of a square's side: ");
        double sl = keyboard.nextDouble();
        System.out.println("The area of the square is: " + calculateSquareArea(sl));
        System.out.println("The circumference of the square is: "
                + calculateSquareCircumference(sl));

        keyboard.close();
    }
}
