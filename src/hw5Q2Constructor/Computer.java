package hw5Q2Constructor;

public class Computer {
	// Variable declared
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	// default constructor declared
	public Computer() {
		System.out.println("This is from default Constructor of Computer Class");
	}

	// Parameterized Constructor declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating System: " + operatingSystem
				+ ", Price: " + price + "$, Grade: " + grade + ", Made in USA? " + madeInUsa);
}
}
