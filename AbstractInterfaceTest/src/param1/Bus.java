package param1;

import java.util.*;
public class Bus extends MultiWheeled{

	String str1="";
	String str2="";
	String str3="";
	@Override
	public void manufacture_details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter manufacturers name:");
		str1=sc.nextLine();
		System.out.println("Enter state/location:");
		str2=sc.nextLine();
		
	}
	Bus(){
		System.out.println("The Bus has the following details:"+str1+"\t"+str2+"\t"+str3);
	}
	
	//the  methods manufacture_details() and wheel_no() declared in interface are overridden in child class
		@Override
		public void wheel_no() {
			System.out.println("wheel_no=4");
			
		}
		@Override
		protected void monitoring() {
			
		}
}
