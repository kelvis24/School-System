package schoolSystem;

public class People {
	
	private String firstName;
	private String lastName;
	private String sex;
	private String address;
	private String startOfContract;
	private String endOfContract;
	private int contact;
	private int age;
	private int salary;
	private String role;
	
//	Constructed with just the names
	public People(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
//	Return the Full name of the person
	public String getName() {
		return firstName + " " + lastName;
	}
	
//	Update the registered Names
	public void updateName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void addSex(String sex) {
		this.sex = sex;
	}
	
	public void updateSex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void addAddress(String address) {
		this.address = address;
	}
	
	public void updateAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void addContractStartDate(String startDate) {
		this.startOfContract = startDate;
	}
	
	public void updateContractStartDate(String startDate) {
		this.startOfContract = startDate;
	}
	
	public String getContractStartDate() {
		return startOfContract;
	}
	
	public void addContractEndDate(String endDate) {
		this.endOfContract = endDate;
	}
	public void updateContractEndDate(String endDate) {
		this.endOfContract = endDate;
	}
	
	public String getContractEndDate() {
		return endOfContract;
	}
	
	
	public void addContact(int contact) {
        this.contact = contact;
	}
	
	public void updateContact(int contact) {
        this.contact = contact;
	}
	
	public int getContact() {
        return contact;
	}
	
//	Returns the age 
	public int getAge() {
		return age;
	}
	
//	Returns the salary
	public int getSalary() {
		return salary;
	}
	
//	Updates the users age
	public void updateAge(int age) {
		this.age = age;
	}
	
//	Updates the user's salary
	public void updateSalary(int salary) {
		this.salary = salary;
	}


	public void addAge(int age) {
		this.age = age;
	}
	
	public void addSalary(int salary) {
		this.salary = salary;
	}

	public void addRole(String role) {
		this.role = role;
	}
	
	public void updateRole(String role) {
		this.role = role;
	}
	
	
	public String getRole() {
		return role;
	}
}
