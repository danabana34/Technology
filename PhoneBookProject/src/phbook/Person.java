package phbook;

public class Person {

	// Create the variables
		private String firstName;
		private String middleName;
		private String lastName;
		private Address address = new Address();
		private String city;
		private String state;
		private String zipcode;
		private String phoneNumber;

		

		
		public Person(String firstName, String middleName, String lastName, Address address, String phoneNumber) {
			super();
			this.firstName = firstName;
			this.middleName =middleName;
			this.lastName = lastName;
			this.address = address;
			this.phoneNumber = phoneNumber;
		}
		
		
				public Person() {
			
			
		}
			
			public String toString() {
				return firstName + " " + lastName + " " + middleName + ", "
						+ address + ", " + phoneNumber;
			}
			
			
			
			
			

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address= address;
		}

	
		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
		
		
}