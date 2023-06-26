import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Eval {

	private static ArrayList<Eval> evals = new ArrayList<>();
	private Vehicle vehicle;
	private ArrayList<Task> tasks;
	private HashMap<Part,Integer> parts;
	private int days;
	private boolean proceed;

	
	public Eval(Vehicle vehicle, ArrayList<Task> tasks, HashMap<Part, Integer> parts, int days) {
		this.vehicle = vehicle;
		this.tasks = tasks;
		this.parts = parts;
		this.days = days;
		evals.add(this);
	}
	
	public Eval(Vehicle vehicle, int days) {
		this.vehicle = vehicle;
		this.tasks = new ArrayList<>();
		this.parts = new HashMap<>();
		this.days = days;
		evals.add(this);
	}
	
	
	
	public void printData() {
		System.out.println("Evaluation of damage");
		this.vehicle.printData();
		if(this.tasks.isEmpty())
			System.out.println("Vehicle in perfect condition, no need for repairs.");
		else {
			System.out.println("Expected duration of repair: "+days+" days");
			System.out.println("Expected tasks needed for repair:");
			for(Task t : tasks)
				t.printData();
			if(!this.parts.isEmpty()) {
				System.out.println("Expected parts to be used for the repair:");
				for( Entry<Part, Integer> e : parts.entrySet() ){
				    System.out.println( e.getKey().getName() + " x " + e.getValue() + ", "+e.getKey().getCost()*e.getValue()+"€");
				}
					
			}
			System.out.println("Expected cost: "+this.calculateCost()+"€");
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


	public int calculateCost() {
		int cost=0;
		for(Part p:parts.keySet())
			cost+=p.getCost()*parts.get(p);
		for(Task t:tasks)
			cost+=t.getCost();
		return cost;
	}
	
	public void proceed(boolean b) {
		proceed = b;
		if(b) {
			new Repair(this);
		}
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public int getDays() {
		return days;
	}
	

}