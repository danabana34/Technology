package phbook;

import java.util.Scanner;

public class AddRecord {

	private static Person[] people;
	Scanner inString = new Scanner(System.in);
	
	public void allRecords() {
		Person temp;
		for(int i=0; i<people.length; i++) {
			for (int j= i+1; i <people.length; i++){
				if(people[i].getFirstName().charAt(0)>people
					[j].getFirstName().charAt(0)){
				temp = people[i];
				people[i] = people[j];
				people[j] = temp;
				}
					}
				
				}
		for (int i = 0; i<people.length -1; i++) {
			System.out.println(people[i]);
		}
			}
			
	public void updatingRecord(String num) {
		for (int i= 0; i<people.length; i++) {
			if (people[i].getPhoneNumber().equals(num)) {
				System.out.println("Enter first name:");
				people[i].setFirstName(inString.nextLine());
				System.out.println("Enter middle name:");
				people[i].setMiddleName(inString.nextLine());
				System.out.println("Enter last name:");
				people[i].setLastName(inString.nextLine());
				System.out.println("Enter phone number i.e. 1112222345 ");
				people[i].setPhoneNumber(inString.nextLine());
				System.out.println("Enter the street address:");
				people[i].getAddress().setStreet(inString.nextLine());
				System.out.println("Enter the city");
				people[i].getAddress().setCity(inString.nextLine());
				System.out.println("Enter the state i.e. CA:");
				people[i].getAddress().setState(inString.nextLine());
				System.out.println("Enter zip code:" );
				people[i].getAddress().setZip(inString.nextLine());
			}
		}
		
	}
			public void searchFullName(String firstName1, String lastName1) {
				for (int i= 0; i<people.length; i++) {
					if(people[i].getFirstName().trim().toUpperCase().equals(firstName1.toUpperCase()) && 
					  people[i].getLastName().trim().toUpperCase().equals(lastName1.toUpperCase())) {
						System.out.println(people[i]);
						
					}
				}
			}
			
	
	

	public void searchCity(String city) {
		for (int i = 0; i <people.length; i++) {
			if(city.toUpperCase().trim().equals(people[i].getAddress().getCity())) {
				System.out.print(people[i]);

			}
		}
	}
	public void searchState(String state) {
		for (int i = 0; i <people.length; i++) {
			if(state.toUpperCase().trim().equals(people[i].getAddress().getState())) {
				System.out.print(people[i]);

			}
		}
	}

	public void removeRecord (String pNum) {

		int j=0,temp=0;
		for( int i = 0; i < people.length; i++) {
			if(pNum.toUpperCase().trim().equals(people[i].getPhoneNumber().trim().toUpperCase())){
				temp =i;

			}
		}

		for (int k = temp; k < people.length-1; k++) {

			people[k] = people[k+1];
			j++;

		}
		people[people.length-1] = null;
	}
	public void searchNum (String num) {

		for (int i = 0; i < people.length; i++) {

			if( num.toUpperCase().trim().equals( people[i].getPhoneNumber().toUpperCase().trim())) {
				System.out.print(people[i]);
				System.out.println();
			}

		}
	}
	public void searchFirstName (String name) {

		for (int i = 0; i < people.length; i++) {

			if( name.toUpperCase().trim().equals( people[i].getFirstName().trim().toUpperCase())) {
				System.out.print(people[i]);
				System.out.println();

			}

		}
	}
	public void searchLastName (String lastName) {

		for (int i = 0; i < people.length; i++) {

			if( lastName.toUpperCase().trim().equals( people[i].getLastName().toUpperCase().trim())) {
				System.out.print(people[i]);
				System.out.println();
			}
		}
	}


	public void addPerson(Person p1) {
		if(people==null) {
			people = new Person[1];
		}else {
			people = expandArray(people);
		}
		people[people.length-1] = p1;
	}

	private  static Person[] expandArray(Person[] p2) {
		Person [] target = new Person[people.length +1];
		for(int i = 0; i < people.length; i++) {
			target[i] = people[i];
		}
		return target;
	}


}

	
