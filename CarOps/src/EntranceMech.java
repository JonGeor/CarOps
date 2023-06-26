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

}