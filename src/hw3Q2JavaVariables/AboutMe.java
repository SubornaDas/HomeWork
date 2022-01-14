package hw3Q2JavaVariables;

/* Create a package name "hw3Q2JavaVariables" inside the Home work project, Create a Class name "AboutMe". Declare only one type of variable(so you know declare vs initialize), and initialize String and other 8 types of variable (you can give a different name from mine). Instantiate AboutMe class under main method and call few variables by object (you can use String concatenation to make it more meaningful outcome). Give a single line comment where a variable is declared and initialized. Follow indentation by Organizing the code and paste below. [Mark distribution (80) : using variable --20, instantiate class - 20, call variables by object and print a meaningful outcome 20, comment for variable is declared and initialized - 10, organize code and other-- 10]*/
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
	public boolean usCitizen = false;

	public static void main(String[] args) {
//	Now we will instantiate the class
		AboutMe aboutMe = new AboutMe();
		System.out.println("My business name: " + aboutMe.onlineBusiness);
		System.out.println("\tAddress: " + aboutMe.houseNumber + " Hillside drive, Zipcode " + aboutMe.zipcode);
		System.out.println("\tFor more info contact number: " + aboutMe.phoneNumber);

	}

}
