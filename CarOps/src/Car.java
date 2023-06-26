public class Car extends Vehicle {

	public Car(String plate, String brand, String model, int year) {
		super(plate, brand, model, year);
	}
	
	
	public void printData() {
		System.out.println("Type: Car");
		super.printData();	
	}
	
	
}