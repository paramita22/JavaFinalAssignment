package com.params.java;


import java.util.*;
public class DummyBank {
	
	static long acc=0;
	static double balance=1000;//minimum balance initialised
	static double withdraw=0.0d;//initialisation of double variable
	static double deposit=0.0d;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		char ans=' ';
		System.out.println("Enter your 10 digit account number:");
		acc=sc.nextLong();
		long acc1=acc;
		//to count the number of digits in acccount number
		while(acc1>0) {
			count+=1;
			acc1/=10;
		}
		if(count==10) {//to check if account number is valid
			do {
				System.out.println("Enter option to Transact:: 1 for withdrawal || 2 for deposit || 3 to check balance");
				int option=sc.nextInt();
				switch(option) {
		
					case 1:	System.out.println("Enter amount for withdrawal");
							withdraw=sc.nextDouble();
							balance-=withdraw;
							System.out.println("Amount withdrawn is= "+withdraw+"Balance for the given account number is= "+balance);
							break;
					
					case 2: System.out.println("Enter the amount to deposit");
							deposit=sc.nextDouble();
							balance+=deposit;
							System.out.println("Amount deposited is ="+deposit+"Balance after deposit ="+balance);
							break;
					
							
					case 3: System.out.println("Do you want to check balance? Press Y for yes || N for no");
							char op=sc.next().charAt(0);
							switch(op) {
								case 'Y': System.out.println("You cerrent balance is= "+balance);
											break;
								case 'N': System.out.println("You may exit");
											break;
								default: System.exit(0);
								
							}
							break;
							
					default: System.out.println("Please visit again");
								break;
						
					}
				
				
				System.out.println("Do you want to continue? Press'y' for yes and 'n' for no");
				ans=sc.next().charAt(0);
			}while(ans=='y');
		}
		else {
			System.out.println("Wrong account number entered. Please try again");
		}
		sc.close();
	}

}
