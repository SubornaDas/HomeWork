package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// class object keyword constructor.
		AboutMe suborna = new AboutMe();
		// Variable initialized here
		suborna.name = "Suborna Das";
		suborna.age = 26;
		suborna.yearlyExpense = 3000;
		suborna.areaZipcode = 30340;
		suborna.phoneNumber = 4702770607l;
		suborna.sex = 'F';
		suborna.height = 5.525795623325656f;
		suborna.cgpa = 4.9562656;
		suborna.europeanCitizen = false;
		suborna.aboutMe();

		System.out.println("\n");

		AboutMe alex = new AboutMe();
		alex.name = "Alex";
		alex.age = 36;
		alex.yearlyExpense = 4000;
		alex.areaZipcode = 30360;
		alex.phoneNumber = 6782770607l;
		alex.sex = 'M';
		alex.height = 5.925795623325656f;
		alex.cgpa = 3.9562656;
		alex.europeanCitizen = true;
		alex.aboutMe();
	}

}
