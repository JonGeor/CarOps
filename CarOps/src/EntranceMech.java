public class EntranceMech extends Mechanic {
	
	public EntranceMech(String name) {
		super(name);
	}
	
	public void printData() {
		super.printData();
		if(Appointment.getAppointments().isEmpty())
			System.out.println("No upcoming appointments");
		else {
			System.out.println("Upcoming appointments:");
			for(Appointment a : Appointment.getAppointments())
				a.printData();
		}
	}

	//GUI
	public Eval createEval(Vehicle vehicle, ArrayList<Task> tasks, HashMap<Part, Integer> parts, int days) {
		return new Eval(vehicle, tasks, parts, days);
	}
	
	public Eval createEval(Vehicle vehicle, int days) {
		return new Eval(vehicle, days);
	}
	
	public Vehicle searchVehicle(String plate) {
		for(Vehicle v : Vehicle.getVehicles())
			if(v.getPlate().equals(plate))
				return v;
		return null;
	}//Various alternatives could work depending on the fields the mechanic fills in search screen
	
	public Vehicle createVehicle(char c,String plate, String brand, String model, int year, double extra) {
		if(c=='C')
			return new Car(plate, brand, model, year);
		if(c=='B')
			return new Bike(plate, brand, model, year, extra);
		return new Truck(plate, brand, model, year, extra);
	}

}
