package application;

/* CS-320 Software Test Automation & QA
 * Dakota Keyes
 * JUint Testing for class TaskTest */ 


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//3 Parameters (ID, Name, & Description)


public class TaskTest {
	

  @Test public void createValidTaskData() {
      Task task = new Task("9876543210", "Coding", "Coding in PyCharm");
      
      
      
      assertEquals("9876543210", task.getID());
      assertEquals("Coding", task.getName());
      assertEquals("Coding in PyCharm", task.getDescription());
      assertThrows(IllegalArgumentException.class, () -> new Task ("0110101010010101", "Task1", "This task has an invalid ID"));
      
  }
  
   @Test public void createInvalidTaskData() {
	   assertThrows(IllegalArgumentException.class, () -> new Task ("0110101010010101", "Task1", "This task has an invalid ID"));
	   
   }
   
   //Testing for ID 
   // ID less than equal to 10
   
   @Test public void IDTooLong() {
	   assertThrows(IllegalArgumentException.class, () -> {
		   new Task ("1234567890123", "Coding", "Coding in Pycharm");
		   
	   });  }
	  

	@Test public void IDIsNull() {
	   assertThrows(IllegalArgumentException.class, () -> {
		   new Task(null, "Coding", "Coding in Pycharm");
	   });  }
	
	// Testing for Name 
	// Name less than or equal to 20
	
	@Test public void NameTooLong() {
		   assertThrows(IllegalArgumentException.class, () -> {
			   new Task("9876543210", "Coding Name Too Long!", "Coding in Pycharm");
		   });  }
	   
	@Test public void NameIsNull() {
		   assertThrows(IllegalArgumentException.class, () -> {
			   new Task("9876543210", null, "Coding in Pycharm");
		   });  }

	//Testing for Description
	// Less than or equal to 50

	@Test public void DescriptionTooLong() {
		   assertThrows(IllegalArgumentException.class, () -> {
			   new Task("9876543210", "Coding", "Coding Coding Coding Coding Coding in in in in in PyCharm PyCharm PyCharm PyCharm PyCharm ");
		      });   }  


	
	@Test public void DescriptionIsNull() {
		   assertThrows(IllegalArgumentException.class, () -> {
			   new Task("9876543210", "Coding", null);
		   });  }

	}

	
