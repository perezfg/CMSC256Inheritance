/*
 * Francisco Perez
 * CMSC 256 - Section ALL
 * Project Name - Inheritance
 * A class that creates a Person consisting of name, address, phoneNumber, email, and id 
 */
package cmsc256;
public class Person{
	private Name name;
	private Address address;
	private int id;
	private String phoneNumber;
	private String email;
	private static int recordNumber=0;
	/* Creating default class for Person 
	 */
	public Person() {
		name = new Name();
		address = new Address();
		phoneNumber= "None Given";
		email = "None Given";
		id= ++recordNumber;
	}
	/*Creating parameterized constructor for Person
	 * */
	public Person (String first, String middle, String last, Address homeAddress, String phoneNumber, String email) {
		if (middle == null) {
			this.name= new Name(first, last);
		}
		this.name=new Name(first, middle, last);
		this.address = homeAddress;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.id = ++recordNumber;
	}
	/*Creating getter for Name for Person
	 * */
public String getName() {;
		return name.toString();
	}
	/*Creating toString method to output Person object
	 * */ 
@Override
	public String toString() {
		String result=this.getClass().getSimpleName()+":\n";
		result+="---------------------------------------\n";
		result+=name.toString()+"\n";
		result+="---------------------------------------\n";
		result+="Home Address: "+address.toString()+"\n";
		result+="Phone Number: "+phoneNumber+"\n";
		result+="Email Address: "+email+"\n";
		result+="ID: "+id+"\n";
		return result;
	}
}