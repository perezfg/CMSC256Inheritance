/*
 * Francisco Perez
 * CMSC 256 - Section ALL
 * Project Name - Inheritance
 * A class that creates an Staff consisting of title
 */

package cmsc256;
public class Staff extends Employee{
	private String title;
	/* Creating default class for Staff 
	 */
	public Staff() {
		super();
		title = "None Given";
	}
	/*Creating parameterized constructor for Staff
	 * */
	public Staff(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String title) {
		super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
		this.title=title;
	}
	/*Creating toString method to output Staff object
	 * */ 
	public String toString() {
		String result;
		result = super.toString();
		result+="Title: "+ title +"\n";
		return result;
	}
}