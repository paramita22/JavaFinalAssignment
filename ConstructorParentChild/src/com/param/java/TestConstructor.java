package com.param.java;

public class TestConstructor {
			
	public static void main(String[] args) {
	
		Child c1=new Child();//Child object created which invokes the parent constructor even without the use of super() keyword
		c1.display();// the child class object accesses all variables of parent class

	}

}
