package hw8Q3Abstraction;

public abstract class EngineeringSchool {
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is printing from non abstract method computerLab of EngineeringSchool");
	}
}
