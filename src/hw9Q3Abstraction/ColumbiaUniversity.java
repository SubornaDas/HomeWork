package hw9Q3Abstraction;

public class ColumbiaUniversity {

	/*
	 * Regular Class can use two keywords to inherit in inheritance. A regular class
	 * can inherit one Regular class or one Abstract class with Extends keyword
	 * Regular class can inherit one or more Interfaces by Implements keyword
	 */

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