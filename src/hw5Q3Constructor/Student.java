package hw5Q3Constructor;

public class Student {
	// Variable declared
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	// Default Constructor declared
	public Student() {
		System.out.println("This is from default Constructor of Student class");
	}

	// Parameterized Constructor declared
	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Name: " + stName + ", ID: " + stID + ", Sex: " + sex + ", Grade: " + grade
				+ ", Java Programmer: " + isProgrammer);
	}
}
