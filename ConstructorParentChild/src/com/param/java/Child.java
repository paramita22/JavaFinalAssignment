package com.param.java;

public class Child extends Parent{
	
	int a=30;
	float b=4.4f;
	String s1="Child call";
	
	Child(){
		System.out.println("I am the Child");
		System.out.println("integer="+a+", float= "+b+" , String= "+s1);
	}
	
	void display() {
		System.out.println("Variables of the child class are: "+"Integer= "+a+", Float= "+b+", String= "+s1);
	}

}
