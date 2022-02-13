package hw8Q3Abstraction;

public class ColumbiaUniversity {

	public ColumbiaUniversity() {
		System.out.println("This is a default constructor");
	}
//	public void chemistry();
//	The above method is commented out because method can't be declared inside regular class, only implemented
//	It is also called abstract method

	public void biology() {
		System.out.println("This is a non abstract or implemented method");
	}
}