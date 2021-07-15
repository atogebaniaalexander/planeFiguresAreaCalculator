package com.unicorn;
import java.util.*;
/**   QUESTION
 * Your sibling approaches you with her assignment on how to calculate
 * the area of various plane figures.
 *As a java programmer,
 * Create a program with methods to handle the following cases.
 * She can view all the plane figure options available to her.
 * She can select by entering the option number of the plan figure
 * When she selects the option, She should see a short instruction and the number of sides needed and their corresponding names.
 * Prompt her to enter the values of the sides against the side names
 *Return and display the area of that plane figure.
 *
 * @author alexander
 */
public class Main {
    //method to clear the terminal of whatever command executed before the next is executed.

    /*
     * this part consists of methods to display information about the plane figures.
     **/

    //method to display instructions needed in order to find the area a circle.
    public static void displayInstructionForCircle() {
        System.out.println("==========================================================\n");
        System.out.println("The area of a circle is calculated by the formula pi * r + r.\nr-radius");
        //
        System.out.println("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        double rad = input.nextDouble();
        System.out.println("radius = " + rad + " cm" );
        System.out.println("==========================================================\n");
        System.out.println("The area of the circle is : " + calculateAreaOfCircle(rad) + " centimetres square" );


    }
    //method to display instructions needed in order to find the area a Square.
    public static void displayInstructionForSquare() {
        System.out.println("==========================================================\n");
        System.out.println("The area of a Square is calculated by the formula: l * l.\nl-length");
        //
        System.out.println("Enter the length of the Square: ");
        Scanner input = new Scanner(System.in);
        double l = input.nextDouble();
        System.out.println("length = " + l + " cm" );
        System.out.println("==========================================================\n");
        System.out.println("The area of the Square is : " + calculateAreaOfSquare(l) + " centimetres square" );


    }
    //method to display instructions needed in order to find the area a Triangle.
    public static void displayInstructionForTriangle() {
        System.out.println("==========================================================\n");
        System.out.println("The area of a Triangle is calculated by the formula: ( b * h)/2.\n b-base\th-height");
        //
        System.out.println("Enter the base of the Triangle: ");
        Scanner input = new Scanner(System.in);
        double b = input.nextDouble();
        System.out.println("Enter the height of the Triangle: ");
        double h = input.nextDouble();
        System.out.println("base = " + b + " cm" );
        System.out.println("height = " + h + " cm" );
        System.out.println("==========================================================\n");
        System.out.println("The area of the Triangle is : " + calculateAreaOfTriangle(b,h) + " centimetres square" );

    }
    //method to display instructions needed in order to find the area a Rectangle.
    public static void displayInstructionForRectangle() {
        System.out.println("==========================================================\n");
        System.out.println("The area of a Rectangle is calculated by the formula: b * l.\n b-breadth\th-length");
        //
        System.out.println("Enter the length of the Rectangle: ");
        Scanner input = new Scanner(System.in);
        double l = input.nextDouble();
        System.out.println("Enter the breadth of the Rectangle: ");
        double b = input.nextDouble();
        System.out.println("base = " + l + " cm" );
        System.out.println("height = " + b + " cm" );
        System.out.println("==========================================================\n");
        System.out.println("The area of the Rectangle is : " + calculateAreaOfRectangle(b,l) + " centimetres square" );
    }
    //method to display instructions needed in order to find the area a Trapezium.
    public static void displayInstructionForTrapezium() {
        System.out.println("==========================================================\n");
        System.out.println("The area of a Trapezium is calculated by the formula:  h(a+b)/2.\n a-short base\tb-long base \th-height");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter short base of the Trapezium ");
        double a = input.nextDouble();
        System.out.println("Enter long base of the Trapezium ");
        double b = input.nextDouble();
        System.out.println("Enter the height of the Trapezium: ");
        double h = input.nextInt();
        System.out.println("short base= " + a + " cm" );
        System.out.println("long base = " + b + " cm" );
        System.out.println("long base = " + h + " cm" );
        System.out.println("==========================================================\n");
        System.out.println("The area of the Trapezium is : " + calculateAreaOfTrapezium(a,b,h) + " centimetres square" );
    }
    //method to display instructions needed in order to find the area a Kite  [d1 x d2]/2.
    public static void displayInstructionForKite() {
        System.out.println("==========================================================\n");
        System.out.println("The area of a Kite is calculated by the formula: [d1 x d2]/2.\n d1-first diagonal\td2-second diagonal");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter short base of the Kite ");
        double d1 = input.nextDouble();
        System.out.println("Enter long base of the Kite ");
        double d2 = input.nextDouble();
        System.out.println("short base= " + d1 + " cm" );
        System.out.println("long base = " + d2 + " cm" );
        System.out.println("==========================================================\n");
        System.out.println("The area of the Kite is : " + calculateAreaOfKite(d1,d2) + " centimetres square" );
    }
    /*
     *this part consists of methods to perform the calculations for the areas of the plane figures.
     */

    //A method to calculate the area of a circle
    public static double calculateAreaOfCircle(double radius) {
        final double PI = Math.PI;
        return PI * Math.pow(radius, 2);
    }
    //A method to calculate the area of a triangle
    public static double calculateAreaOfTriangle(double base, double height) {
        return  (base * height)/2;
    }
    //A method to calculate the area of a rectangle
    public static double calculateAreaOfRectangle(double l, double b) {
        return l * b;
    }
    //A method to calculate the area of a trapezium
    public static double calculateAreaOfTrapezium(double base, double length, double height) {
        return height * (base + length)/2;
    }
    //A method to calculate the area of a kite
    public static double calculateAreaOfKite(double d1, double d2) {
        return  (d1 * d2)/2;
    }
    //A method to calculate the area of a square
    public static double calculateAreaOfSquare(double l) {
        return l * l;
    }
    /*
     *A method to create the main display menu
     */
    public static void displayMenu() {
        String[] planeFigures = new String[] {"1.Circle", "2.Square", "3.Triangle", "4.Rectangle", "5.Trapezium", "6.kite"};
        System.out.println("==========================================================");
        System.out.println("Here are the options available to select\n");
        //logic to determine when a user selects a plane and display the appropriate instructions and calculations
        for(int i = 1; i <= planeFigures.length; i++) {
            System.out.println(i + " - " + planeFigures[i-1]);
        }
        System.out.println("Enter your selection: ");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        System.out.println("==========================================================");
        if(selection==1) {
            displayInstructionForCircle();
        }
        else if(selection==2) {
            displayInstructionForSquare();
        }
        else if(selection==3) {
            displayInstructionForTriangle();
        }
        else if(selection==4) {
            displayInstructionForRectangle();
        }
        else if(selection==5) {
            displayInstructionForTrapezium();
        }
        else if(selection==6) {
            displayInstructionForKite();
        }
        else {
            System.out.println("Error!, Invalid entry");
        }

    }
    // main function
    public static void main(String[] args) {
        displayMenu();
    }
}





