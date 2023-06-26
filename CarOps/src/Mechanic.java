import java.util.ArrayList;

public class Mechanic {

	private static ArrayList<Mechanic> mechs = new ArrayList<>();
	private String name;
	private ArrayList<TaskForRepair> tasks;
	
	
	public Mechanic(String name) {
		this.name = name;
		tasks = new ArrayList<>();
		mechs.add(this);
	}
	
	public void printData() {
		System.out.println("Name: "+name);
		if(this.tasks.isEmpty())
			System.out.println("No tasks.");
		else {
			System.out.println("Tasks:");
			for(TaskForRepair t:tasks)
				t.printData();
		}
			
	}

	public void addTask(TaskForRepair t) {
		tasks.add(t);
	}
	
	public void addTask(Repair r, Task t) {
		TaskForRepair tr = new TaskForRepair(r,t);
		tasks.add(tr);
	}

	public static ArrayList<Mechanic> getMechs() {
		return mechs;
	}

	public String getName() {
		return name;
	}

}