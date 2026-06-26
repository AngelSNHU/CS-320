//static import for JUnit testing
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ContactServiceTest {
	//contact service tests
	@Test
	//test for adding contacts to service
public void testAddContact() {
		ContactService service = new ContactService();
	Contact contact = new Contact(
			"123456",
			"Angel",
			"Espartza",
			"6612376474",
			"5903 Asti"
			);
	service.addContact(contact);
	assertNotNull(service.getContact("123456"));
	assertEquals("Angel", service.getContact("123456").getFirstName());
	}
@Test
//test for rejecting duplicate contact IDs
public void testDuplicateContactId() {
	
	ContactService service = new ContactService();
	
	Contact contact1 = new Contact(
			"123456",
			"Angel",
			"Espartza",
			"6612376474",
			"5903 Asti"
			);
	Contact contact2 = new Contact(
			"123456",
			"Robert",
			"Pineda",
			"1234567899",
			"3546 Clovis"
			);
	service.addContact(contact1);
	
	assertThrows(IllegalArgumentException.class, () -> {
		service.addContact(contact2);
	});
}
	
@Test
//test for deleting contact that uses contact ID
public void testDeleteContact() {
	
	ContactService service = new ContactService();
	
	Contact contact = new Contact(
			"123456",
			"Angel",
			"Esparza",
			"6612376474",
			"5903 Asti"
			);
	service.addContact(contact);
	service.deleteContact("123456");
	
	assertNull(service.getContact("123456"));
}
	

@Test
//test for updating contacts first name
public void testUpdateFirstName() {
	
	ContactService service = new ContactService();
	
	Contact contact = new Contact(
			"123456",
			"Angel",
			"Espartza",
			"6612376474",
			"5903 Asti"
			);
	service.addContact(contact);
	service.updateFirstName("123456", "Mario");
	assertEquals("Mario", service.getContact("123456").getFirstName());
}

@Test
//test for updating contact last name
public void testUpdateLastName() {
	ContactService service = new ContactService();
	Contact contact = new Contact(
			"123456",
			"Angel",
			"Esparza",
			"6612376474",
			"5903 Asti"
			);
service.addContact(contact);
service.updateLastName("123456", "Holland");
assertEquals("Holland", service.getContact("123456").getLastName());
}

@Test
//test for updating contact phone number
public void testUpdatePhoneNumber() {
	ContactService service = new ContactService();
	
	Contact contact = new Contact(
			"123456",
			"Angel",
			"Esparza",
			"6612376474",
			"5903 Asti"
			);
	
	service.addContact(contact);
	service.updatePhoneNumber("123456", "1234567899");
	assertEquals("1234567899", service.getContact("123456").getPhoneNumber());
}
@Test
//test for updating contact address
public void testUpdateAddress() {
	ContactService service = new ContactService();
	
	Contact contact = new Contact(
			"123456",
			"Angel",
			"Esparza",
			"6612376474",
			"5903 Asti"
			);
	service.addContact(contact);
	service.updateAddress("123456",  "237 New Street");
	assertEquals("237 New Street", service.getContact("123456").getAddress());
}
}
