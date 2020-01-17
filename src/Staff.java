public class Staff extends Employee{
	private Name name;
	private Address address;
	private String title;
	
	public Staff() {
		
	}
	public Staff(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String title) {
		super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
		if (middle == null) {
			this.name= new Name(first, last);
		}
		this.name=new Name(first, middle, last);
		this.address = homeAddress;
		this.title=title;
	}
	
	public String toString() {
		String result;
		result = "Staff: \n";
		result+="-----------------\n";
		result +=name+"\n";
		result+="-----------------\n";
		result +="Home Address: "+address+"\n";
		result += super.toString();
		result+="Title: "+ title +"\n";
		return result;
	}
}