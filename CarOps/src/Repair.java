import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Repair {

	private static ArrayList<Repair> repairs = new ArrayList<>();
	private Vehicle vehicle;
	private int days;
	private SupervisorMech mech;
	private ArrayList<Task> tasks;
	private HashMap<Part,Integer> parts;
	private boolean completed;
	private Eval eval;

	
	
	public Repair(Eval eval) {
		this.vehicle = eval.getVehicle();
		this.days = eval.getDays();
		this.tasks = new ArrayList<>();
		this.parts = new HashMap<>();
		this.completed = false;
		this.eval = eval;
		repairs.add(this);
	}
	
	
	//exists for the purposes of the assignment
	public Repair(int days) {
		this.days = days;
		this.tasks = new ArrayList<>();
		this.parts = new HashMap<>();
		this.completed = false;
		repairs.add(this);
	}
	
	public void printData() {
		if(days==1)
			System.out.println("Duration: 1 day, total cost: " + this.getTotalCost()+"€");
		else
			System.out.println("Duration: " + days + " days, total cost: " + this.getTotalCost()+"€");
	}
		
	
	public void printFullData() {
		System.out.println("Repair Information");
		//button for full vehicle info
		System.out.println(vehicle.getSimpleData());
		System.out.println("Supervisor Mechanic: "+mech.getName());
		if(tasks.isEmpty())
			System.out.println("0 tasks completed");
		else {
			System.out.println("Tasks completed:");
			for(Task t : tasks) 
				t.printData();
		}
		if(parts.isEmpty())
			System.out.println("0 parts used");
		else {
			System.out.println("Parts used:");
			for( Entry<Part, Integer> e : parts.entrySet() ){
			    System.out.println( e.getKey().getName() + " x " + e.getValue() + ", "+e.getKey().getCost()*e.getValue()+"€");
			}
		}
		if(completed)
			this.printData();
		else {
			System.out.println("Expected duration "+days+" day(s), cost so far: "+this.getTotalCost()+"€");
		}
	}
		
	public void addTask(Task t){
		tasks.add(t);
	}

	public void addPart(Part p) {
		if(parts.putIfAbsent(p, 1)!=null)
			parts.put(p, parts.get(p) + 1);
	}
	
	public void addPart(Part p, int ammount) {
		if(parts.putIfAbsent(p, ammount)!=null)
			parts.put(p, parts.get(p) + ammount);
	}

	public int getTotalCost() {
		int cost=0;
		for(Part p:parts.keySet())
			cost+=p.getCost()*parts.get(p);
		for(Task t:tasks)
			cost+=t.getCost();
		return cost;
	}
	
	

	public static ArrayList<Repair> getRepairs() {
		return repairs;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
		if(completed)
			mech.removeRepair(this);
	}


	public void setMech(SupervisorMech mech) {
		this.mech = mech;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setDays(int days) {
		this.days = days;
	}

}