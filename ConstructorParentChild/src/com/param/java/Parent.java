package com.param.java;

public class Parent {
	
	int a=10;
	float b=23.4f;
	String s1="Home";
	
	Parent(){
		System.out.println("I am the Parent");
		System.out.println("integer="+a+", float= "+b+" , String= "+s1);
	}
	
	void display() {
		System.out.println("Variables of the parent class are: "+"Integer= "+a+", Float= "+b+", String= "+s1);
	}
}
