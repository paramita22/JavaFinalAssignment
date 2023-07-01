package param1;

public class VehiclesApp1 {

	public static void main(String[] args) {
		try {
		Vehicles1 v1=new Auto();
		Vehicles1.wheel_no();
		}
		catch(Exception ex) {
			System.out.println("These 2 methods cannot be implemented");
		}
		ThreeWheeled w3=new Auto();
		w3.costing();
		w3.threewheels();
		w3.wheel_no();
		w3.manufacture_details();
		w3.monitoring();
		FourWheeled w4=new Car();
		w4.costing();
		w4.fourwheels();
		MultiWheeled w6=new Bus();
		w6.costing();
		w6.multiwheels();
		w6.wheel_no();

	}

}
