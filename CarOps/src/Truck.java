public class Truck extends Vehicle {

	private double load;
	
	public Truck(String plate, String brand, String model, int year,double load) {
		super(plate, brand, model, year);
		this.load = load;
	}
	
	public void printData() {
		System.out.println("Type: Truck");
		super.printData();	
		System.out.println("Load: " + load);
	}
	

}