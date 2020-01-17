public class Student extends Person{
	private Name name;
	private Address address;
	private String level;
	
	public Student() {
		
	}
	public Student(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String level) {
		super(first, middle, last, homeAddress, phoneNumber, email);
		if(!isValidLevel(level)) {
			throw new IllegalArgumentException("Level is not formatted correctly. ");
		}		
		if (middle == null) {
			this.name= new Name(first, last);
		}
		this.name=new Name(first, middle, last);
		this.address = homeAddress;
		this.level=level;
	}
	private boolean isValidLevel(String level) {
		String[] levels = {"Freshman","Sophomore", "Junior", "Senior","Graduate"};
		for (int i=0; i<levels.length; i++){
			if(level.equals(levels[i])) {
				return true;
			}
		}
		return false;
	}
@Override
	public String toString() {
		String result;
		result = "Student: \n";
		result+="-----------------\n";
		result +=name+"\n";
		result+="-----------------\n";
		result +="Address: "+address+"\n";
		result+=super.toString();
		result+= "Student Level: "+level+"\n";
		return result;
	}
}