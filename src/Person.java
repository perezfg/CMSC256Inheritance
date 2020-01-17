public class Person{
	private int id;
	private String phoneNumber;
	private String email;
	private static int recordNumber=0;
	
	public Person() {
		
	}
	
	public Person (String first, String middle, String last, Address homeAddress, String phoneNumber, String email) {
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.id = ++recordNumber;
	}
public String getName() {;
		return null;
	}
@Override
	public String toString() {
		String result="";
		result="Phone Number: "+phoneNumber+"\n";
		result+="Email Address: "+email+"\n";
		result+="ID: "+id+"\n";
		return result;
	}
}