package param1;


public interface Vehicles1 {

	boolean license=true;
	int year_of_manufacture=2020;//variable in an interface are by default static and final
	static void wheel_no() {
		System.out.println("Vehicles are meant to transfer passenger and goods");
	}
	default void threewheels() {
	}
	default void fourwheels() {
	}
	default void multiwheels() {
	}
	void costing();
	void manufacture_details();
	static String monitoring() {
		return "101";
	}
}
