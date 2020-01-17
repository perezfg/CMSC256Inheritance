public class Faculty extends Employee{
	private Name name;
	private Address address;
	private String rank;
	
	public Faculty() {
		
	}
	public Faculty(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String rank) {
		super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
		if(!isValidRank(rank)) {
			throw new IllegalArgumentException("Rank is not formatted correctly. ");
		}
		if (middle == null) {
			this.name= new Name(first, last);
		}
		this.name = new Name(first, middle, last);
		this.address = homeAddress;
		this.rank=rank;
		
	}
	private boolean isValidRank(String rank) {
		String[] ranks = {"Adjunct","Instructor","Assistant Professor","Associate Professor","Professor"};
		for (int i = 0; i<ranks.length; i++) {
			if(rank.equals(ranks[i])) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String result;
		result = "Faculty: \n";
		result+="-----------------\n";
		result +=name+"\n";
		result+="-----------------\n";
		result +="Home Address: "+address+"\n";
		result+=super.toString();
		result += "Rank: "+rank+"\n";
		return result;
	}
}