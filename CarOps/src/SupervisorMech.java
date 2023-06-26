import java.util.ArrayList;

public class SupervisorMech extends Mechanic {

	private ArrayList<Repair> repairs;

	public SupervisorMech(String name) {
		super(name);
		repairs = new ArrayList<>();
	}
	
	public void printData() {
		super.printData();
		if(this.repairs.isEmpty())
			System.out.println("Supervising no repairs");
		else {
			System.out.println("Supervising repairs:");
			for(Repair r : repairs)
				System.out.println(r.getVehicle().getSimpleData());
		}
	}
	
	public void addRepair(Repair r) {
		repairs.add(r);
	}
	
	public void removeRepair(Repair r) {
		repairs.remove(r);
	}

	public ArrayList<Repair> getRepairs() {
		return repairs;
	}

	//GUI
	public void assignTask(TaskForRepair t, Mechanic m) {
		m.addTask(t);
	}
	
	public void finishedRepair(Repair r) {
		r.setCompleted(true);
	}
}
