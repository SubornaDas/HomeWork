package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// Default Constructor is initialized
		Computer computer = new Computer();
		// Parameterized Constructor is Initialized
		Computer computer1 = new Computer("Apple", "MacBook Air", "Mac OS Mojave", 800, 'A', false);
		Computer computer2 = new Computer("HP", " ENVY 2-in-1 15.6", "Windows", 900, 'A', true);
	}
}
