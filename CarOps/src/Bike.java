public class Bike extends Vehicle {

	private double displacement;
	
	public Bike(String plate, String brand, String model, int year,double displacement) {
		super(plate, brand, model, year);
		this.displacement = displacement;
	}

	public void printData() {
		System.out.println("Type: Bike");
		super.printData();	
		System.out.println("Displacement: " + displacement);
	}

}