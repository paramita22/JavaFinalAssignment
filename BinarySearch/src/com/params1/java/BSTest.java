package com.params1.java;


import java.util.*;
public class BSTest {

	static int n=0,index=0,key=0;
	static int[] arr=new int[n];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of the array");
		
		//Accepting the array elements
		for(int x=0;x<n;x++) {
			
			System.out.print(x+1+": ");
			arr[x]=sc.nextInt();
			System.out.println();
		}
		
		//Sorting the array elements with bubble-sort as Binary Search works on a sorted array
		for(int p=0;p<n-1;p++) {
			for(int q=0;q<n-p-1;q++) {
				if(arr[q]>arr[q+1]) {
					int temp=arr[q];
					arr[q]=arr[q+1];
					arr[q+1]=temp;
				}
			}
		}
		//displaying sorted elements
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			
		System.out.println("Please enter the element to be searched: ");
		key=sc.nextInt();
		if(doBinarySearch(key)!=-1)
			System.out.println("The element is present in the array at position= "+doBinarySearch(key));
		else
			System.out.println("The entered element is not present in the array");
		
	}
	
	static int doBinarySearch(int k){
		int low=0;
		int high=n;
		int mid=(low+high)/2;
		if(high>low) {
		if(arr[mid]==key) {
			index=mid;
		}
		else if(arr[mid]<key){
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		}
		if(index==0)
			return -1;
		else
			return index;
	}
}
