package com.bridgelabz.demo;

import java.util.Scanner;

class Point {
    public double x;// co-ordinate x
    public double y;// co-ordinate y

    public double getX() {
	return x;
    }

    public void setX(double x) {
	this.x = x;
    }

    public double getY() {
	return y;
    }

    public void setY(double y) {
	this.y = y;
    }
}

public class LineComparisionComputation {
    static void equalityCheck() {
	double lineLength1 = lineLength();
	double lineLength2 = lineLength();
	if (lineLength1 == lineLength2) {
	    System.out.println("equal");
	} else {
	    System.out.println("not equal");
	}
    }

    static void compareTo() {
	double lineLength1 = lineLength();
	double lineLength2 = lineLength();
	if (lineLength1 == lineLength2) {
	    System.out.println("lineLength1 is equal to lineLength2");
	} else if (lineLength1 > lineLength2) {
	    System.out.println("lineLength1 is greater than lineLength2");
	} else {
	    System.out.println("lineLength2 is greater than lineLength1");
	}
    }

    public static double lineLength() {
	Point point = new Point();
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the value of x1");
	point.setX((scanner.nextInt()));
	double x1 = point.getX();
	System.out.println("enter the value of x2");
	point.setX((scanner.nextInt()));
	double x2 = point.getX();
	System.out.println("enter the value of y1");
	point.setY((scanner.nextInt()));
	double y1 = point.getY();
	System.out.println("enter the value of y2");
	point.setY((scanner.nextInt()));
	double y2 = point.getY();
	double x = Math.pow((x1 - x2), 2);
	double y = Math.pow((y1 - y2), 2);
	double length = Math.sqrt(x + y);
	scanner.close();

	return length;

    }

    public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program using OOPS");
	compareTo();

    }

}
