package application;

/* CS-320
 * Dakota Keyes 
 Contact Service & Testing */ 



// Member field, accessible for all member functions

public class Contact {
	 String contactID;
	 String firstName;
	 String lastName;
	 String phoneNumber;
	 String address; 
	
//Constructors
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address)  {
			
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		else {
			this.contactID = contactID;
		}
		if(firstName== null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		else {
			this.firstName = firstName;
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		else {
			this.lastName = lastName;
		}
		if(phoneNumber == null || phoneNumber.length()!= 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		else {
			this.address = address;
		}
			//if(contactID.length() <= 10 && contactID != null) {
			//	this.contactID = contactID;
			}
		//super();
		
//			this.firstName = firstName;
//			this.lastName = lastName;
//			this.phoneNumber = phoneNumber;
//			this.address = address;
	
	//ContactId
	//Getter
	
	public String getContactID() {
		return contactID;
	}
	//Setter
	public void setContactID(String contactID) {
		if(contactID.length() <= 10 && contactID != null) {
			this.contactID = contactID;
	}
	}
	//firstName
	//Getter
	public String getFirstName() {
		return firstName;
	}
	//Setter
	public void setFirstName(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
	}
	//lastName
	//Getter
	public String getLastName() {
		return lastName;
	}	
	//Setter
	public void setLastName(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
	}
	//phoneNumber
	//Getter
	public String getPhoneNumber() {
		return phoneNumber;
	}
	//Setter
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() <= 10 && phoneNumber != null) {
		this.phoneNumber = phoneNumber;
		}
	}
	//address
	//Getter
	
	public String getAddress() {
		return address;
	}
	//setter
   public void setAddress(String address) {
	   if(address.length() <= 30 && address != null) {
		   this.address = address;
	   }
   }

	//Checking against contact input
	@Override
	
	public String toString() {
		return "Contact [contactID=" + contactID + ", " + "firstName=" + firstName + ", " + "lastName=" + lastName + ", " + "phoneNumber=" + phoneNumber + ", " + "address = " + address + "]";
}
	}
	
