package application;

//CS-320 Software Test Automation & QA
//Dakota Keyes
//TaskService class

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class TaskService {

  // Creating instance of ArrayList of Task
	
  public static ArrayList<Task> tasks = new ArrayList<>();
  public static boolean addTask(Task task) {
  		for(Task taskList : tasks) {
  			if(taskList.getID().equals(task.getID())) {
  				return false;
  			}
  	}
  	
  			tasks.add(task);
  		
  		      return true;
  }
  TaskService service = new TaskService();
  
  public void addTask(String taskID, String taskName, String taskDescription) {
  	Task task = new Task (taskID, taskName, taskDescription);
  			tasks.add(task);
  }

  
  @SuppressWarnings("unlikely-arg-type")
  
  
	public static boolean deleteTask(String taskID) {
  		for(Task taskList : tasks) {
  			if(taskList.getID().equals(taskID)) {
  		    	 tasks.remove(taskList.getID());
  				return true;
  			}
  		}
  				return false;
  	}
  
  // Update taskName and Return
  
public static boolean updateTaskNameById(String ID, String Name) {
  	for(Task taskList : tasks) {
  		if(taskList.getID().equals(ID)) {
  			taskList.updateName(Name);
  			return true;
  		}
  	}
  	return false;
  			
  			
  			
  		}
  	
  
  public static boolean updateTaskDescriptionById(String TaskID, String Description) {
  	for(Task taskList : tasks) {
  		if(taskList.getID().equals(TaskID)) {
  			(taskList).updateDescription(Description);
  			return true;
  		}
  	}
  	return false;
  			
  			
  			
  		}

}

  	
  