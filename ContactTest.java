package application;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// object as a class member so all methods have access 
class ContactTest {
    Contact contact = new Contact("1", "firstName", "lastName", "5558675309", "123 ST"); 

    @Test
    void getContactID() {
        assertEquals("1", contact.getContactID());
    }

    @Test
    void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("5558675309", contact.getPhoneNumber());
    }

    @Test
    void getAddress() {
        assertEquals("123 ST", contact.getAddress());
    }
    
    //not required to test string
    
    //@Test
    //void testToString() {
   //     assertEquals("Contact [contactID=1, firstName=firstName, lastName=lastName, phoneNumber=5558675309, address = 123 ST]", contact.toString());
    //}

}

