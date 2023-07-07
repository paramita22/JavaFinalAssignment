package com.java.params;

import java.util.*;
public class List2 {

	static int n,sl,ss;
	static List<Integer> l1=new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of integers to be accepted:");
		n=scan.nextInt();
		
		System.out.println("Enter Integers one by one:");
		for(int k=0;k<n;k++) {
			int m=scan.nextInt();
			l1.add(m);
		}
		
		System.out.println(l1);
		
		List2 ls2=new List2();
		System.out.println("The second Largest element in the list is:"+ls2.searchSecondlargest());
		System.out.println("The second smallest element in the list is:"+ls2.searchSecondSmallest());
	}
	
	static int searchSecondlargest() {
		Collections.sort(l1);
		
		sl=l1.get(n-2);
		return sl;
		
	}
	
	static int searchSecondSmallest() {
		
		Collections.sort(l1);
		ss=l1.get(1);
		
		
		return ss;
		
	}

}


class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
		next=null;
	}
}