package com.paramp.java;

import java.util.*;
public class TestInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//the try-catch block is used to handle checked exceptions
		try {
			System.out.print("Enter an integer:");
			int a=sc.nextInt();
			String s = "";
			if(a>0)
				System.out.println("Well tried. Right input");
			else
				throw new NegativeInputException(s);//throw keyword handles single exception without ducking it or handling multiple as 'throws'
				
		}
		catch(NegativeInputException ni) {
			System.out.println("The number is negative. Please enter the number again");
			ni.getLocalizedMessage();
		}
		
		
		sc.close();
	}

}
