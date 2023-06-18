package com.param.java;

public interface Shape {

	//variables of interface are by default static and final in java interface
	double pi=3.14;
	
	void accept();//abstract methods are without body and have to be overridden in implementing classes
	
	static double calculateArea() {
		
		return 0;
	}//java interfaces can also have methods with body according to recent updations, these methods need not be overridden
	
	static double calculatePerimeter() {
		
		return 0;
		
}
	void display();

}
