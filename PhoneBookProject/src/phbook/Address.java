package phbook;

public class Address {

	
	// Address Class
	
		
		private String Street;
		private String City; 
		private String State; 
		private String Zip;
		public Address(String address, String city, String state, String zip) {
			
			Street = address;
			City = city;
			State = state;
			Zip = zip;
		}

		public Address() {
			// TODO Auto-generated constructor stub
		}

		public String getStreet() {
			return Street;
		}

		public void setStreet(String street) {
			Street = street;
		}

		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getZip() {
			return Zip;
		}
		public void setZip(String zip) {
			Zip = zip;
		}

		@Override
		public String toString() {
			return Street +", " + City + ", " + State + ", " + Zip ;
		}
		
		
		
		
		
		


	}


