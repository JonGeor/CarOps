import java.util.ArrayList;

public class Appointment {

	private static ArrayList<Appointment> appointments = new ArrayList<>();
	private Client client;
	private Vehicle vehicle;
	private String date;
	private double time;
	
	public Appointment(Client client, Vehicle vehicle, String date, double time) {
		this.client = client;
		this.vehicle = vehicle;
		this.date = date;
		this.time = time;
		appointments.add(this);
		System.out.println("New appointment has been created");
	}

	public Appointment(String date, int time) {
		this.date = date;
		this.time = time;
		appointments.add(this);
		System.out.println("New appointment has been created");
	}

	public Appointment(Client client, String date, int time) {
		this.client = client;
		this.date = date;
		this.time = time;
		appointments.add(this);
		System.out.println("New appointment has been created");
	}
	
	public void printData() {
		if(vehicle!=null)
			System.out.println(date + " " + this.timeToString() + " " + client.getSimpleData() + " " + vehicle.getSimpleData());
		else if(client!=null)
			System.out.println(date + " " + this.timeToString() + " " + client.getSimpleData());
		else
			System.out.println(date + " " + this.timeToString());
	}
	
	private String timeToString() {
		if(time%1==0)
			return time + ":00";
		else
			return time + ":30";
	}
	
	public void removeAppointment() {
		appointments.remove(this);
	}

	public static ArrayList<Appointment> getAppointments() {
		return appointments;
	}

}