
public class TaskForRepair{
	
	private Repair repair;
	private Task task;
	private boolean completed;
	
	public TaskForRepair(Repair repair, Task task) {
		this.repair = repair;
		this.task = task;
	}

	public Repair getRepair() {
		return repair;
	}

	public Task getTask() {
		return task;
	}
	
	public void printData() {
		System.out.println(repair.getVehicle().getSimpleData()+" "+task.getName());
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
