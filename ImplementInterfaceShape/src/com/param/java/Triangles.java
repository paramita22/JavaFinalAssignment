package com.param.java;

import java.util.*;
public class Triangles implements Shape{

	static float s1,s2,s3;
	static double area=0.0d;
	static double perimeter=0.0d;

	@Override
	public void accept() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter sides of triangle:");
		s1=scan.nextFloat();
		s2=scan.nextFloat();
		s3=scan.nextFloat();
		scan.close();
	}

	public double calculateArea() {
		double s=(s1+s2+s3)/2;
		double a=s*(s-s1)*(s-s2)*(s-s3);
		System.out.println(a);
		area=Math.pow(a,0.5);
		return area;
	}

	public double calculatePerimeter() {
		perimeter=s1+s2+s3;
		return perimeter;
	}

	@Override
	public void display() {
		System.out.println("Area of the given triangle is= "+area+" Perimeter of the given triangle is= "+perimeter);
		
	}

}
