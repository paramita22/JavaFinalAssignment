package param1;

//a class is abstract if it has at least 1 abstract method. The method manufacture_details() and wheel_no() of the implemented interface is not overridden, so are abstract
abstract class FourWheeled implements Vehicles1{

	static {
		System.out.println("You are viewing Four Wheeled vehicles");
	}
	public void costing(){
		System.out.println("The cost of these vehicles are within 10 lakh");
	}
	FourWheeled(){
		System.out.println("Year of manufacture is:"+year_of_manufacture);
	}
	public void fourwheels() {
		if(license==true) {
			System.out.println("License aquiring is a must");
			}
	}
	
	public abstract void manufacture_details();
	public abstract void wheel_no();
	protected abstract void monitoring();
}
