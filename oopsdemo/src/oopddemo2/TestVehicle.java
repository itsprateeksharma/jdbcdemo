package oopddemo2;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vObj=new Vehicle();
		vObj.drive();
		
		Vehicle vCar=new Car1(); //upcasting
		vCar.drive();//invoke overridden drive method
		
		Vehicle vTruck=new Truck();
		vTruck.drive();
		//vTruck.load(); //compile time error
		
		Truck t1=new Truck();
		t1.load();
		
	}

}
