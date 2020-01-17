import java.time.LocalDate;
public class Employee extends Person{
	private String office;
	private int salary;
	private LocalDate hireDate;
	
	public Employee() {
		
	}
	public Employee(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year) {
		super(first, middle, last, homeAddress, phoneNumber, email);
		hireDate = LocalDate.of(year, month, day);
		this.office = office;
		this.salary=salary;
	}
	public String toString() {
		String result;
		result=super.toString();
		result+="Office: "+office+"\n";
		result+="Salary: "+salary+"\n";
		result+="Date Hired: "+hireDate+"\n";
		return result;
	}
	
}