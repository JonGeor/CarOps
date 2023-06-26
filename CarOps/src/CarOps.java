public class CarOps {

	public static void main(String[] args) {
		
		
		
		Task t1 = new Task("Αλλαγή λαδιών", 20);
		Task t2 = new Task("Αλλαγή φίλτρου καμπίνας", 5);
		Task t3 = new Task("Συντήρηση φρένων", 30);
		
		Part p1 = new Part("Συσκευασία λαδιών 4lt", 30);
		Part p2 = new Part("Φίλτρο λαδιού", 20);
		Part p3 = new Part("Φίλτρο καμπίνας", 30);
		Part p4 = new Part("Τακάκι φρένων εμπρός τροχού", 5);
		Part p5 = new Part("Τακάκι φρένων πίσω τροχού", 5);
		Part p6 = new Part("Υγρό φρένων", 10);
		
		Repair r1 = new Repair(1);
		r1.addTask(t1);
		r1.addTask(t2);
		r1.addPart(p1);
		r1.addPart(p2);
		r1.addPart(p3);
		Repair r2 = new Repair(2);
		r2.addTask(t3);
		r2.addPart(p4,4);
		r2.addPart(p5,4);
		r2.addPart(p6);
		
		for(Repair r : Repair.getRepairs())
			r.printData();
		for(Part p : Part.getParts())
			p.printData();
		for(Task t : Task.getTasks())
			t.printData();



	}

}
