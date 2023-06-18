package com.param.java;

import java.util.*;
public class Rectangles implements Shape{
	static float length=0.0f;
	static float breadth=0.0f;
	static double area=0.0d;
	static double perimeter=0.0d;

	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		length=sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle:");
		breadth=sc.nextFloat();
		sc.close();
	}

	public double calculateArea() {
		area=length*breadth;
		return area;
	}

	public double calculatePerimeter() {
		perimeter=2*(length+breadth);
		return perimeter;
	}

	@Override
	public void display() {
		System.out.println("Area of the rectangle is= "+area+" Perimeter of the rectangle is= "+perimeter);
		
	}
	

}
