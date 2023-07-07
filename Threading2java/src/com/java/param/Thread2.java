package com.java.param;

import java.util.*;
class Even implements Runnable{
	int m=0;
	public Even(int n) {
		m=n;
	}

	@Override
	public void run() {
		System.out.println("Even integers are being printed==");
		for(int i=0;i<m;i++) {
			if((i%2)==0)
				System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
}

class Odd implements Runnable{

	int m=0;
	public Odd(int n) {
		m=n;
	}

	@Override
	public void run() {
		System.out.println("Odd integers are being printed==");
			for(int i=0;i<m;i++) {
				if((i%2)!=0)
					System.out.print(i+" ");
			}
			System.out.println();
	}
	
	
	
}

public class Thread2{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the range of numbers:");
			
		int n=sc.nextInt();
		
		Even e1=new Even(n);
		Odd o1=new Odd(n);
		
		Thread t1=new Thread(e1);
		Thread t2=new Thread(o1);
		
		t1.start();
		t2.start();
	
	sc.close();
	}

}
