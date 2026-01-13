// Polymorphism

import java.util.Scanner;
import java.lang.Math;

class Shape {

    Shape() {

    }

    double calculateArea() {
        return 1;
    }

}

class Circle extends Shape {

    int radiusCircle;

    Circle(int radius) {
        this.radiusCircle = radius;
    }

    double calculateArea() {
        double area = (double) Math.PI * this.radiusCircle * this.radiusCircle;
        double roundedArea = (double) Math.round(area * 100.0) / 100.0;
        return roundedArea;
    }

}

class Rectangle extends Shape {

    int widthRect, heightRect;

    Rectangle(int width, int height) {
        this.widthRect = width;
        this.heightRect = height;
    }

    double calculateArea() {
        return this.widthRect * this.heightRect;
    }

}

class Triangle extends Shape {

    int baseTri, heightTri;

    Triangle(int base, int height) {
        this.baseTri = base;
        this.heightTri = height;
    }

    double calculateArea() {
        return (this.baseTri * this.heightTri) / 2;
    }

}

public class Polymorphism {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String shapeType;

        while (true) {
            System.out.print("Enter shape: ");
            shapeType = input.nextLine();

            if (shapeType.equalsIgnoreCase("Circle")) {
                System.out.print("Enter radius: ");
                int circleRadius = input.nextInt();
                Shape myCircle = new Circle(circleRadius);
                double circleArea = myCircle.calculateArea();
                System.out.println("Area of Circle: " + circleArea);
                break;
            }
            else if (shapeType.equalsIgnoreCase("Rectangle")) {
                System.out.print("Enter width: ");
                int rectangleWidth = input.nextInt();
                input.nextLine();
                System.out.print("Enter height: ");
                int rectangleHeight = input.nextInt();
                Shape myRectangle = new Rectangle(rectangleWidth, rectangleHeight);
                int rectangleArea = (int) myRectangle.calculateArea();
                System.out.println("Area of Rectangle: " + rectangleArea);
                break;
            }
            else if (shapeType.equalsIgnoreCase("Triangle")) {
                System.out.print("Enter base: ");
                int triangleBase = input.nextInt();
                input.nextLine();
                System.out.print("Enter height: ");
                int triangleHeight = input.nextInt();
                Shape myTriangle = new Triangle(triangleBase, triangleHeight);
                int triangleArea = (int) myTriangle.calculateArea();
                System.out.println("Area of Triangle: " + triangleArea);
                break;
            }
            else {
                System.out.println("Error.");
            }
        }
    }
}