import java.util.ArrayList;

public class Task {

	private static ArrayList<Task> tasks = new ArrayList<>();
	private String name;
	private int cost;
	
	public Task(String name, int cost) {
		this.name = name;
		this.cost = cost;
		tasks.add(this);
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
	public void printData() {
		System.out.println(name+" "+cost+"€");
	}

	public static ArrayList<Task> getTasks() {
		return tasks;
	}

}