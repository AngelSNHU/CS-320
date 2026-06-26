import java.util.ArrayList;
//set contact service class
public class ContactService {
	//storing contacts
	private ArrayList<Contact> contacts = new ArrayList<>();

public void addContact(Contact contact) {
	// duplicate contact ID check
	for(Contact existingContact : contacts) {
		// compares existing contact ID and the new contact ID
		if(existingContact.getContactId().equals(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID exists already");
		}
	}
	// add contact for array list
	contacts.add(contact);
}
// get contact with contactId
public Contact getContact(String contactId) {
	for(Contact contact : contacts) {
		if(contact.getContactId().equals(contactId)) {
			return contact;
		}
	}
	return null;
}
//remove contact with contactId
public void deleteContact(String contactId) {
	contacts.removeIf(contact -> contact.getContactId().equals(contactId));
}
//update first name for same contactId
public void updateFirstName(String contactId, String firstName) {
	
	for(Contact contact : contacts) {
		
		if (contact.getContactId().equals(contactId)) {
			contact.setFirstName(firstName);
		}
	}
}
//update last name for same contactId
public void updateLastName(String contactId, String lastName) {
	for (Contact contact : contacts) {
		
		if (contact.getContactId().equals(contactId)) {
			contact.setLastName(lastName);
			
		}
	}
}
//update phone number for same contactId
public void updatePhoneNumber(String contactId, String phoneNumber) {
	
	for(Contact contact : contacts) {
		
		if(contact.getContactId().equals(contactId)) {
			contact.setPhoneNumber(phoneNumber);
		}
	}
}
//update address for same contactId
public void updateAddress(String contactId, String address) {
	
	for(Contact contact : contacts) {
		
		if(contact.getContactId().equals(contactId)) {
			contact.setAddress(address);
		}
	}
  }
}