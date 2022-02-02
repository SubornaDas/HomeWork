package hw3Q2JavaVariables;

public class AboutMe {
//	int type of variable is declared, not initialized
	public int age;
//	Bellow all the variables are initialized
	public String onlineBusiness = "Style&Trendz";
	public int zipcode = 30340;
	public byte houseNumber = 120;
	public char location = 'E';
	public short yearlyInvestment = 30000;
	public long phoneNumber = 4702770607l;
	public float height = 5.5f;
	public double acres = 50.2569884546556;
	public boolean deliveryMethod = false;

	public static void main(String[] args) {
//	Aboutme  class is instantiated
		AboutMe aboutMe = new AboutMe();
		System.out.println("My business name: " + aboutMe.onlineBusiness);
		System.out.println("\tAddress: " + aboutMe.houseNumber + " Hillside drive, Zipcode " + aboutMe.zipcode);
		System.out.println("\tOnly method of delivery is online: " + aboutMe.deliveryMethod
				+ ", Estimated Yearly incvestment around " + aboutMe.yearlyInvestment);
		System.out.println("\tFor more info contact number: " + aboutMe.phoneNumber);
	}
}
