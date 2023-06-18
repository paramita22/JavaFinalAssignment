package com.param.java;

import java.util.*;
public class TestShape{


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the shape you want to work with:Options==>1 for Circle|| 2 for Triangle || 3 for Rectangle || 4 to exit");
		int option=sc.nextInt();

			switch(option){
				case 1: Circles t1=new Circles();
						t1.accept();
						t1.calculateArea();
						t1.calculatePerimeter();
						t1.display();
						break;
						
				case 2: Triangles t2=new Triangles();
						t2.accept();
						t2.calculateArea();
						t2.calculatePerimeter();
						t2.display();
						break;
				
				case 3: Rectangles t3=new Rectangles();
						t3.accept();
						t3.calculateArea();
						t3.calculatePerimeter();
						t3.display();
						break;
				
				default: System.out.println("Wrong input ||Try again");
						System.exit(0);
						
			}
		
	sc.close();
	}

}
