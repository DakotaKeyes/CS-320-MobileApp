package application;


import java.util.ArrayList;

public class ContactService {
	//Array containing the list of contacts //
	private ArrayList<Contact> contacts;
	
	//The default constructor //
	public ContactService() {
		contacts = new ArrayList<>();	
}
	
	//Method to add given contact to list, if it does not exist already//
	public boolean add(Contact contact) {
		// determine if contact is present //
		boolean alreadyPresent = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
		// if the contact is not found, add contact and return true //
		if (!alreadyPresent) {
			contacts.add(contact);
			System.out.println("Contact Added Successfully!");
			return true;
			
		} else {
			
			System.out.println("Contact already present");
			return false;
		}
	}
	// remove Contact if exists in the list, using contactId//
	public boolean remove(String contactID) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact removed Successfully!");
				return true;
			}
		}
			System.out.println("Contact not present");
			return false;
	}
	
	 //Updates contactID, if found updates its firstName, lastName and address, or pass an empty string//
	 
	public boolean update(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				if (!firstName.equals(""))
					c.setFirstName(firstName);
				if (!lastName.equals(""))
					c.setLastName(lastName);
				if(!phoneNumber.equals(""))
					c.setPhoneNumber(phoneNumber);
				if (!address.equals("")) 
					c.setAddress(address);
				System.out.println("Contact updated Successfully!");
				return true;
			}
		}
		System.out.println("Contact not present");
		return false;
	}
}



