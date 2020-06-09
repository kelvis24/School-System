package schoolSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DataEntry {
	
	private int numberOfPeople;
	private ArrayList<People> arr = new ArrayList<People>();
	
	public DataEntry() {
		
	}
	
	public void getNumber(Scanner scan) {
		System.out.println(" how many people");
		numberOfPeople = scan.nextInt();
	}
	
	public void startRecording(Scanner scan) {
		
		for (int i = 0; i < numberOfPeople; i++) {
			
			System.out.println("Please enter the First Name");
			String firstName = scan.next();
			System.out.println("Please enter the Last Name");
			String lastName = scan.next();
			
			People person = new People(firstName, lastName);
			
			System.out.println("Please enter the sex");
			String sex = scan.next();
			person.addSex(sex);
			
			System.out.println("Please enter the Address");
			String address = scan.next();
			person.addAddress(address);
			
			System.out.println("Please enter the contract start date");
			String sDate= scan.next();
			person.addContractStartDate(sDate);
			
			System.out.println("Please enter the contract end date");
			String eDate= scan.next();
			person.addContractEndDate(eDate);
			
			System.out.println("Please enter the age");
			int age = scan.nextInt();
			person.addAge(age);
			
			System.out.println("Please enter the Salary");
			int salary = scan.nextInt();
			person.addSalary(salary);
			
			System.out.println("Please enter the role");
			String role = scan.next();
			person.addRole(role);
			
			arr.add(person);
			
		}
	}
	
	public void getInfo() {
		
		for (int i = 0; i < numberOfPeople; i++) {
			
			People guy = arr.get(i);
			
			System.out.println(guy.getName() + " is a " + guy.getSex() + " from " 
					+ guy.getAddress() + " with a contract starting from " + guy.getContractStartDate() + 
					" ending " + guy.getContractEndDate() +". " + "He's of age " + guy.getAge() + " with a contact " 
					+ guy.getContact() + " and a job as a " + guy.getRole() + " with a salary of " + guy.getSalary()
					);

			System.out.println("    ");
		}
	}
	

}
