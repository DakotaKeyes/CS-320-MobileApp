package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/* CS-320 Software Test Automation & QA
Dakota Keyes
JUint Testing for class TaskServiceTest */

//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TaskServiceTest {
	
	 private TaskService taskService;
	@Test
public void testAddTasks() {
		
		Task task= new Task("9876543210", "Coding", "Coding in Pycharm");
	//	Object Test1 = task;
		assertTrue(TaskService.addTask(task));
	}
	
	@Test
public void testDeleteTaskTrue() {
		Task task= new Task("9876543210", "Coding", "Coding in Pycharm");
	//	Object Test2 = task;
		TaskService.addTask(task);
		assertTrue(TaskService.deleteTask("9876543210"));
	}
	
	@Test
public void testDeleteTaskFalse() {
		//
		Task task= new Task("9876543210", "Coding", "Coding in Pycharm");
	//	Object Test3 = task;
		TaskService.addTask(task);
		assertFalse(TaskService.deleteTask("9876543210"));
	}


	@Test
public void testUpdateTaskNameTrue() {
		//
		Task task = new Task ("9876543210", "Coding in Java", null);
		//Object Test4 = task;
		TaskService.addTask(task);
		assertTrue(TaskService.updateTaskNameById("9876543210", "Coding in Java"));
	}
	@Test
	public void testUpdateTaskNameFalse() {
		Task task = new Task ("9876543210", "Coding in Java", "Unit Testing in Eclipse");
	//	Object Test4 = task;
		TaskService.addTask(task);
		assertFalse(TaskService.updateTaskNameById("9876543210", "Coding in Java"));
	}
}	