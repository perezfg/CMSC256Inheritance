/*
 * Francisco Perez
 * CMSC 256 - Section ALL
 * Project Name - Inheritance
 * A class that creates an Employee consisting of office, salary, and hireDate 
 */
package cmsc256;
import java.time.LocalDate;

public class Employee extends Person{
	private String office;
	private int salary;
	private LocalDate hireDate;
	/* Creating default class for Employee 
	 */
	public Employee() {
		office = "Unassigned";
		salary = 0;
		hireDate=null;
	}
	/*Creating parameterized constructor for Employee
	 * */
	public Employee(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year) {
		super(first, middle, last, homeAddress, phoneNumber, email);
		hireDate = LocalDate.of(year, month, day);
		this.office = office;
		if (salary<0){
			throw new IllegalArgumentException("Salary needs to be greater than 0");
		}
		this.salary=salary;
	}
	/*Creating toString method to output Employee object
	 * */ 
	public String toString() {
		String result;
		result=super.toString();
		result+="Office: "+office+"\n";
		result+="Salary: $"+salary+"\n";
		if(hireDate==null) {
			result+="Date Hired: "+ null+"\n";
		}
		else {
		result+="Date Hired: "+hireDate.getMonthValue()+"/"+hireDate.getDayOfMonth()+"/"+hireDate.getYear()+"\n";
		}
		return result;
	}
	
}