package hw9Q3Abstraction;

public interface University extends College, Hospital {

	/*
	 * In inheritance only one keyword is used to inherit inside Interface i.e
	 * extends keyword. Interface can inherit Interface but cannot inherit a regular
	 * or abstract class by extends keyword. Interface can inherit more than one
	 * Interfaces by extends keyword.
	 */

//	public University() {
//	Interface can't have constructors and method can only be declared here, not implemented

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
		System.out.println("This is an exception of Interface from Java 1.8");
	}

	public static void library() {
		System.out.println("This is an exception of Interface from Java 1.8");
	}
}