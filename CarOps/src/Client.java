import java.util.ArrayList;

public class Client {

	private static ArrayList<Client> clients = new ArrayList<>();
	private String name;
	private String lastname;
	private String phone;
	private String address;
	private String email;
	private ArrayList<Vehicle> vehicles;
	
	public Client(String name, String lastname, String phone, String address, String email) {
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.vehicles = new ArrayList<>();
		clients.add(this);
		System.out.println("New client added to the database");
	}
	
	public Client(String name, String lastname, String phone, String address, String email,Vehicle v) {
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.vehicles = new ArrayList<>();
		vehicles.add(v);
		clients.add(this);
		System.out.println("New client added to the database");
	}
	
	public String getSimpleData() {
		return lastname+" "+name;
	}
	
	public void printData() {
		System.out.println("Client Info:");
		System.out.println("Name: " + name);
		System.out.println("Lastname: " + lastname);
		System.out.println("Phone Number: " + phone);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);
		if(!vehicles.isEmpty()) {
			System.out.println("Client's Vehicles:");
			int i=1;
			for(Vehicle v : vehicles) {
				System.out.println("Info of Vehicle "+i+":");
				v.printData();
				i++;
			}		
		}	
	}
	
	public void addVehicle(Vehicle v) {
		v.setOwner(this);
	}
	
	public void addV(Vehicle v) {
		vehicles.add(v);
	}

	public static ArrayList<Client> getClients() {
		return clients;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	
	
	

}