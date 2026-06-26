//static import for JUnit testing
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	@Test
	// test for ensuring valid contact
	public void testContactCreation() {
		Contact contact = new Contact("123456", "Angel", "Esparza", "6612376474", "5903 Asti");
		
	assertEquals("123456", contact.getContactId());
	assertEquals("Angel", contact.getFirstName());
	assertEquals("Esparza", contact.getLastName());
	assertEquals("6612376474", contact.getPhoneNumber());
	assertEquals("5903 Asti", contact.getAddress());
	}
@Test
//test for ensuring valid contactId (no longer than 10 characters)
public void testInvalidContactId() {
	assertThrows(IllegalArgumentException.class,()-> {
		new Contact("12345678910", "Angel", "Esparza", "6612376474", "5903 Asti");
	});
}
@Test
// test for null contact ID
public void testNullContactId() {
	assertThrows(IllegalArgumentException.class,() ->{
		new Contact(null, "Angel", "Esparza", "6612376474", "5903 Asti");
	});
}
@Test
//test for ensuring valid first name (no longer than 10 characters)
public void testInvalidFirstName() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456", "Angelxxxxxx", "Esparza", "6612376474", "5903 Asti");
	});
}
@Test
//test for ensuring valid last name 
public void testInvalidLastName() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456", "Angel", "Esparzaxxxx", "6612366474", "5903 Asti");
	});
}
@Test
//test for ensuring valid phone number (exactly 10 characters)
public void testInvalidPhoneNumber() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456", "Angel", "Esparza", "1234", "5903 Asti");
	});
}
@Test
//test for null phone number
public void testNullPhoneNumber() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456", "Angel", "Esparza", null, "5903 Asti");
	});
	}
@Test
//test for ensuring a valid address
public void testInvalidAddress() {
	assertThrows(IllegalArgumentException.class,() -> {
		new Contact("123456", "Angel", "Esparza", "6612376474", "1234567891011121314151617181920");
	});
}
}