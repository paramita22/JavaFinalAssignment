package com.params1.java;


import java.util.*;
public class BSTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of the array");
		//Accepting the array elements
		for(int x=0;x<n;x++) {
			
			System.out.print(x+1+": ");
			arr[x]=sc.nextInt();
			System.out.println();
		}
		
		//Sorting the array elements with bubble-sort as Binary Search works on a sorted array
		
			
	}

}
