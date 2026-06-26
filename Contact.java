//@Name Angel Esparza
//@Date 5/20/26
//@Course CS-320

public class Contact {
 // different contact variables
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public Contact(String contactId, String firstName, String lastName, 
	String phoneNumber, String address) {
//contact class requirements	
  // contact ID
	if (contactId == null || contactId.length() > 10) {
		throw new IllegalArgumentException("contact ID not valid");
	}
 // first name
	if (firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("First name not valid");
	}
 // last name
	if (lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Last name not valid");
	}
 // phone number
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("phone number not valid");
		}
 // address
	if(address == null || address.length() > 30) {
		throw new IllegalArgumentException("Invalid address");
	}
// set values
	this.contactId = contactId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.address = address;
}

//get functions
public String getContactId() {
	return contactId;
}

public String getFirstName() {
	return firstName;
}

public String getLastName()  {
	return lastName;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public String getAddress() {
	return address;
}

//setter functions
public void setFirstName(String firstName) {
	if (firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("Not a valid first name");
	}
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	
	if (lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Not a valid last name");
	}
	this.lastName = lastName;
}

public void setPhoneNumber(String phoneNumber) {
	
	if(phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
		throw new IllegalArgumentException("Not a valid phone number");
	}
	this.phoneNumber = phoneNumber;
}
public void setAddress(String address) {
	
	if (address == null || address.length() > 30) {
		throw new IllegalArgumentException("Not a valid address");
	}
	
	this.address = address;
}
}
	
