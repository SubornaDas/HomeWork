package hw4Q2JavaVariables;

//String and other 8 types of variables are declared
public class AboutMe {
	public String name;
	public byte age;
	public short yearlyExpense;
	public int areaZipcode;
	public long phoneNumber;
	public char sex;
	public float height;
	public double cgpa;
	public boolean europeanCitizen;

//	We created a constructor
	public AboutMe() {
		System.out.println("This is all about me: ");
	}

//	We declared a method here
	public void aboutMe() {
		System.out.println("My Name: " + name + "\nAge: " + age + "\nMy yearly expenses: " + yearlyExpense
				+ "\nMy Zip code: " + areaZipcode + "\nMy phone Number: " + phoneNumber + "\nSex: " + sex
				+ "\nMy height: " + height + "\nMy CGPA: " + cgpa + "\nEuropean Citizen: " + europeanCitizen);
	}

}
