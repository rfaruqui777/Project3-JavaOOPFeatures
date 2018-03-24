package OOP.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeID(100);
		employee1.setEmployeeName("Ruksana");
		employee1.setEmployeeDOB("07-27-1979");
		employee1.setEmployeeJDate("07-07-2018");
		System.out.println(employee1.getEmployeeID() + "  "+employee1.getEmployeeName() + "  " + employee1.getEmployeeDOB() + "  " + employee1.getEmployeeJDate());
	}
}
