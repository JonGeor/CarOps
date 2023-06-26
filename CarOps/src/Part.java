import java.util.ArrayList;

public class Part {
	
	private static ArrayList<Part> parts = new ArrayList<>();
	private String name;
	private int cost;
	
	public Part(String name,int cost) {
		this.name = name;
		this.cost = cost;
		parts.add(this);
	}

	public int getCost() {
		return cost;
	}
	
	public void printData() {
		System.out.println(name+" "+cost+"€");
	}

	public static ArrayList<Part> getParts() {
		return parts;
	}

	public String getName() {
		return name;
	}

}