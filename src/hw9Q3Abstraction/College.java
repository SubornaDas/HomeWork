package hw9Q3Abstraction;

public interface College {

	public abstract void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This is an exception of Interface from Java 1.8");
	}

	public static void studyRoom() {
		System.out.println("This is an exception of Interface from Java 1.8");
	}
}