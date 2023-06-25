package com.paramp.java;

//creating a class to create a user defined Custom Exception ij java
public class NegativeInputException extends Exception {

	/**
	 * 
	 */
	//parametrised Constructor
	public NegativeInputException(String s){
		super(s);
	}
}
