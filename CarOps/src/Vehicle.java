import java.util.ArrayList;

public abstract class Vehicle {

	private static ArrayList<Vehicle> vehicles = new ArrayList<>();
	private String plate;
	private String brand;
	private String model;
	private int year;
	private Client owner;
	
	public Vehicle(String plate, String brand, String model, int year) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.year = year;
		vehicles.add(this);
	}
	
	public Vehicle(String plate, String brand, String model, int year, Client c) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.year = year;
		owner = c;
		vehicles.add(this);
	}


	public String getPlate() {
		return plate;
	}
	
	public void printData() {
		System.out.println("License Plate: " + plate);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);	
	}
	
	public String getSimpleData() {
		return brand+" "+model;
		
	}

	public static ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
		owner.addV(this);
	}
	

}