package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



// Testing ContactService 
public class ContactServiceTest {
	//Testing for Add Method//
	@Test
	public void testMethodAddPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Doe", "5558675309", "123 ST");
		Contact c2 = new Contact("C002", "Jane", "Dough", "5558675300", "124 ST");
		Contact c3 = new Contact("C003", "Jim", "Morris", "5558675301", "125 ST");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}
///Add fail method
	@Test
	public void testMethodAddFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Doe", "5558675309", "123 ST");
		Contact c2 = new Contact("C002", "Jane", "Dough", "5558675300",  "124 ST");
		Contact c3 = new Contact("C003", "Jim", "Morris", "5558675301", "125 ST");
		assertEquals(true, cs.add(c1));
		assertEquals(false, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
	}
	/* test the delete method */
	@Test
	public void testMethodDeletePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Doe", "5558675309",  "123 ST");
		Contact c2 = new Contact("C002", "Jane", "Dough", "5558675300", "124 ST");
		Contact c3 = new Contact("C003", "Jim", "Morris", "5558675301", "125 ST");
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.remove("C003"));
		assertEquals(true, cs.remove("C002"));
	}
	/* test the delete method */
	@Test
	public void testMethodDeleteFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Doe", "5558675309",  "123 ST");
		Contact c2 = new Contact("C002", "Jane", "Dough", "5558675300", "124 ST");
		Contact c3 = new Contact("C003", "Jim", "Morris", "5558675301", "125 ST");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
		assertEquals(false, cs.remove("C004"));
		assertEquals(true, cs.remove("C002"));
	}
	/* test the update method */
@Test
public void testUpdatePass() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("C001", "John", "Doe", "3218675309", "123 ST");
	Contact c2 = new Contact("C002", "Jane", "Dough", "3218675300", "124 ST");
	Contact c3 = new Contact("C003", "Jim", "Morris", "3218675301", "125 ST");
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c3));
	assertEquals(true, cs.add(c2));
	//
	assertEquals(true, cs.update("C003", "Morris", "Jamantha", "3211112222", ""));
	assertEquals(true, cs.update("C002", "Harry", "Bush", "1111111111", "124 ST"));
	}
/* test the update method */
@Test
	public void testUpdateFail() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("C001", "John", "Doe", "3218675309", "123 ST");
	Contact c2 = new Contact("C002", "Jane", "Dough", "3218675300","124 ST");
	Contact c3 = new Contact("C003", "Jim", "Morris", "3218675301", "125 ST");
	assertEquals(true, cs.add(c3));
	assertEquals(true, cs.add(c2));
	assertEquals(false, cs.update("C004", "Morris", "Jamantha", "0000000000", ""));
	assertEquals(true, cs.update("C002", "Harry", "Bush", "0001112222", "124 ST"));
	}
}
