/*
 * Francisco Perez
 * CMSC 256 - Section ALL
 * Project Name - Inheritance
 * A class that creates an Student consisting of level
 */
package cmsc256;
public class Student extends Person{
	private String level;
	/* Creating default class for Student 
	 */
	public Student() {
		super();
		level = "Freshman";
	}
	/*Creating parameterized constructor for Staff
	 * */
	public Student(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String level) {
		super(first, middle, last, homeAddress, phoneNumber, email);
		if(!isValidLevel(level)) {
			throw new IllegalArgumentException("Level is not formatted correctly. ");
		}		
		this.level=level;
	}
	/*Creating boolean method to check if rank is one of 5 values that a student object can be
	 * 
	 */
	private boolean isValidLevel(String level) {
		String[] levels = {"Freshman","Sophomore", "Junior", "Senior","Graduate"};
		for (int i=0; i<levels.length; i++){
			if(level.equals(levels[i])) {
				return true;
			}
		}
		return false;
	}
	/*Creating toString method to output Student object
	 * */ 
@Override
	public String toString() {
		String result;
		result=super.toString();
		result+= "Student Level: "+level+"\n";
		return result;
	}
}