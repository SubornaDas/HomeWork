package hw9Q3Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public abstract void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This is an exception of Interface from Java 1.8");
	}

	public static void pharmacy() {
		System.out.println("This is an exception of Interface from Java 1.8");
	}
}
