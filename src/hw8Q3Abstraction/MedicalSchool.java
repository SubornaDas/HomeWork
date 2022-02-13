package hw8Q3Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

//	Default Constructor declared
	public MedicalSchool() {
	}

	public void biochemistryLab() {

		System.out.println("This is printing from non abstract method biochemistryLab of MedicalSchool");
	}
}