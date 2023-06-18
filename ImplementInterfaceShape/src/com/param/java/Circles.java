package com.param.java;

import java.util.*;
public class Circles implements Shape{
	static float radius=0.0f;
	static double area=0.0d;
	static double perimeter=0.0d;

	@Override
	public void accept() {
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle:");
		radius=sc.nextFloat();
		sc.close();
	}

	public double calculateArea() {
		area=pi*radius*radius;
		return area;
	}

	public double calculatePerimeter() {
		
		perimeter=2*pi*radius;
		return perimeter;
	
	}

	@Override
	public void display() {
		
		System.out.println("The area of the circle is= "+area+" the perimeter of the circle is= "+perimeter);
	}

}
