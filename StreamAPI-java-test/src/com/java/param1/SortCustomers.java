package com.java.param1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class SortCustomers {

	public static void main(String[] args) {
		List<Customers> custList=new ArrayList<Customers>();
		
		custList.add(new Customers("Amit",47,2000.00));
		custList.add(new Customers("Bandit",31,1500.00));
		custList.add(new Customers("Cecil",46,3000.00));
		custList.add(new Customers("Dobby",27,1000.00));
		custList.add(new Customers("Enu",41,2000.00));
		
	//printing the original list 
		System.out.println(custList);
	custList.forEach(e->System.out.println(e));
	
	System.out.println("Sort the list by name");
	//sort the list by name
	List<Customers> sortedByName=custList.stream()
	.sorted((e1,e2)->e1.name.compareTo(e2.name))
	.collect(Collectors.toList());
	
	sortedByName.forEach(System.out :: println);
	
	System.out.println("Sort the list by age");
	//sort the list by age
	
	List<Customers> sortByAge=custList.stream().sorted(Comparator.comparingInt(Customers::getAge))
			.collect(Collectors.toList());
	sortByAge.forEach(e->System.out.println(e));

	
	System.out.println("sort the list by cashback");
	//sort the list by cashback
	List<Customers> sortByCashback=custList.stream().sorted(Comparator.comparingDouble(Customers::getCashback))
			.collect(Collectors.toList());
	sortByCashback.forEach(e->System.out.println(e));

	//filter
	System.out.println("Filter and then sort");
	custList.parallelStream()
		.filter(e->e.cashback>3000.00)
		.sorted(Comparator.comparingDouble(Customers::getCashback))
		.forEach(System.out :: println);

}

}

class Customers{
	
	String name;
	private int age;
	double cashback;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCashback() {
		return cashback;
	}

	public void setCashback(double cashback) {
		this.cashback = cashback;
	}
	
	public Customers(String name, int age, double cashback) {
		// TODO Auto-generated constructor stub
	}
}
