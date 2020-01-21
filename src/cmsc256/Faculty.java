/*
 * Francisco Perez
 * CMSC 256 - Section ALL
 * Project Name - Inheritance
 * A class that creates an Faculty consisting of rank.
 */
package cmsc256;
public class Faculty extends Employee{
	private String rank;
	/* Creating default class for Faculty 
	 */
	public Faculty() {
		super();
		rank = "Instructor";
	}
	/*Creating parameterized constructor for Faculty
	 * */
	public Faculty(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String rank) {
		super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
		if(!isValidRank(rank)) {
			throw new IllegalArgumentException("Rank is not formatted correctly. ");
		}
		this.rank=rank;
	}
	/*Creating boolean method to check if rank is one of 5 values that a faculty object can be
	 * 
	 */
	private boolean isValidRank(String rank) {
		String[] ranks = {"Adjunct","Instructor","Assistant Professor","Associate Professor","Professor"};
		for (int i = 0; i<ranks.length; i++) {
			if(rank.equals(ranks[i])) {
				return true;
			}
		}
		return false;
	}
	/*Creating toString method to output Faculty object
	 * */ 
	public String toString() {
		String result;
		result=super.toString();
		result += "Rank: "+rank+"\n";
		return result;
	}
}