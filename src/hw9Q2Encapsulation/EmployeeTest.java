package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Juanita");
		employee.setAge(30);
		employee.setSex('F');
		employee.setUsCitizen(true);

		System.out.println(
				"Employee Info: " + "\nEmployee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
						+ "\nEmployee Sex: " + employee.getSex() + "\nUs Citizen: " + employee.isUsCitizen());
	}
}
