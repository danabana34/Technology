/*Dana Walker 

This program simulates a phonebook
 * 
 * 
 * 
 */

package phbook;

import java.util.Scanner;

public class MainPhoneBook {

	public static void main(String[] args) {
		
		displayMenu();
	}
	
	
	public static void displayMenu() {
		
		Scanner in = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		 // Rename this object
		boolean changed = false;
		Person cust1= new Person();
		AddRecord phoneBook = new AddRecord();
		
		while(true) {
	
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("1. Add a record" );
		System.out.println("2. Delete a record");
		System.out.println("3. Search by first name");
		System.out.println("4. Search by last name");
		System.out.println("5. Update an existing record");
		System.out.println("6. Search by full name");
		System.out.println("7. Search for existing record");
		System.out.println("8. Search by phone number");
		System.out.println("9. Search by city");
		System.out.println("10. Search by state");
		System.out.println("11. Exit program");
	
	
	
	
		int options = in.nextInt();
	
	//The method allows the user to select phonebook options
		
	//create a switch statement
		
	switch(options) {
	case 1:
		System.out.println("Enter first name:");
		String firstName = inString.nextLine();
		System.out.println("Enter middle name:");
		String middleName = inString.nextLine();
		System.out.println("Enter last name:");
		String lastName = inString.nextLine();
		System.out.println("Enter phone number i.e. 1112222345 ");
		String phoneNumber = inString.nextLine();
		System.out.println("Enter the street address:");
		String streetAddress = inString.nextLine();
		System.out.println("Enter the city");
		String city = inString.nextLine();
		System.out.println("Enter the state i.e. CA:");
		String state = inString.nextLine();
		System.out.println("Enter zip code:" );
		String zipcode = inString.nextLine();
		
		

		cust1.setFirstName(firstName);
		cust1.setMiddleName(middleName);
		cust1.setLastName(lastName);
		cust1.setPhoneNumber(phoneNumber);
		cust1.getAddress().setCity(city);
		cust1.getAddress().setState(state);
		cust1.getAddress().setStreet(streetAddress);
		cust1.getAddress().setZip(zipcode);
		System.out.println();
		System.out.println("The new record is: " +firstName+  " "+middleName+ " "
				+lastName + " " +streetAddress + " ");
		System.out.println();
		
		phoneBook.addPerson(cust1);
		break;
		
	case 2:
		
		System.out.println("Enter the phone number of the person you like to delete:");
		String phoneNumber1 = inString.nextLine();
		
		phoneBook.removeRecord(phoneNumber1);
		
	case 3:
		System.out.println("What's the first name that you would like to search?");
		String searchFirstName = inString.next();
		phoneBook.searchLastName(searchFirstName);
		break;
		
		
	case 4:
		System.out.println("What's the last name that you would like to search?");
		String searchLastName = inString.next();
		phoneBook.searchLastName(searchLastName);
		
	case 5:
		System.out.println("Whats the phone number that you would like to search?");
		String num = inString.next();
		phoneBook.updatingRecord(num);
		break;
		
	case 6:
		System.out.println("Enter the first name to search:");
		String firstName2 = inString.nextLine();
		System.out.println("Enter the last name to search");
		String lastName2 =inString.nextLine();
		
		phoneBook.searchFullName(firstName2, lastName2);
		break;
		
	case 7:
		System.out.println();
		phoneBook.allRecords();
		System.out.println();
		break;
		
	case 8:
		System.out.println("Enter the phone number you would like to search");
		String phoneNumber2 = inString.next();
		if(phoneNumber2.length()!= 9)
			System.out.print("Please enter a digit number");
		phoneBook.searchNum(phoneNumber2);
		break;
		
		
	case 9:
		System.out.println("Enter the city you would like to search");
		String city1 = inString.nextLine();
		phoneBook.searchCity(city1);
		System.out.println();
		break;
		
	case 10:
		System.out.println("Enter the state you would like to search");
		String state1 = inString.next();
		phoneBook.searchState(state1);
		break;
		
	case 11:
		System.out.println("Exit PhoneBook:");
		System.exit(0);
		break;
		
	default:
		System.out.println("Enter a number between 1- 11");
		
		
		}
		
		}
	}
		
		
		
		
		
		
		
		
		
	}
	
	


