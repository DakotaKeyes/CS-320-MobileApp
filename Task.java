package application;
/* CS-320 Software Test Automation & QA
 * Dakota Keyes
 * Task class */ 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task {

    /*Access Modifier for private method
	/* Method can only be accessed within the class
	 *  
	 */
	
   // public static final Comparator compareById = null;
    
	private String ID;
    private String Name;
    private String Description;
    
    private String UpdatedDescription;

    public static List<Task> tasks = new ArrayList<>();
    /*
     * Constructor for Object - Task
  		3 Parameters (ID, Name, & Description)
     */
    
    public Task(String ID, String Name, String Description) {
    	if(ID == null || ID.length() > 10 ) {
    		throw new IllegalArgumentException("Invalid Task ID: Null or Length > 10");
    } else
    		this.ID = ID;
    
    	if(Name == null || Name.length() > 20) {
    		throw new IllegalArgumentException("Invalid Task Name: Null or Length > 20");
    	}
    	else {
    		this.Name = Name;
    	}
    	if(Description == null || Description.length() > 50) {
    		throw new IllegalArgumentException("Invalid Task Desription: Null or Length > 50");
    	}
    	else 
    		this.Description = Description;
    }

   
    	





	


	//Getter for String ID
    public String getID() {
        return ID;
    }

    //Setter for String ID
    
    public void setId(String ID) {
    	if(ID == null || ID.length() > 10 ) {
    		throw new IllegalArgumentException("Invalid Task ID: Null or Length > 10");
    	}
       else {
    	this.ID = ID;
       }
    }
 
    
    
    //Getter for String Name
    
    public String getName() {
        return Name;
    }
    
    //Setter for String Name
    
    public void setName(String Name) {
    	if(Name == null || Name.length() > 20) {
    		throw new IllegalArgumentException("Invalid Task Name: Null or Length > 20");
    	}
    	else {
    		this.Name = Name;
    	}
        
    }
    
    //Getter for String Description
    
    public String getDescription() {
        return Description;
    }
    
    //Setter for String Description
    
    public void setDescription(String Description) {
    	if(Description == null || Description.length() > 50) {
    		throw new IllegalArgumentException("Invalid Task Desription: Null or Length > 50");
    	}
    	else
    		this.Description = Description;
    }





// 	this.UpdatedDescription = UpdatedDescription;
// 	is not updating correctly


public void updateDescription(String UpdateDescription) {
	this.UpdatedDescription = UpdatedDescription;

}
	public void updateName(String Name) {
		this.updateName(Name);
	}
}
