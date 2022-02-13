package hw9Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool {

	public abstract void anatomyLab();

	/*
	 * Abstract class can use two keywords to inherit i.e extends and Implements
	 * Abstract class can use "extends" keyword to inherit only one regular class or
	 * one abstract class, It can not use extend keyword to inherit Interface The
	 * keyword "implements" is used to inherit more than one Interfaces
	 */

//	Default Constructor declared
	public MedicalSchool() {
	}

	public void biochemistryLab() {

		System.out.println("This is printing from non abstract method biochemistryLab of MedicalSchool");
	}
}