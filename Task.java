
package personal.task.manager;
import java.util.Scanner;


public class Task {
  
    private String title ;
    private String description ;
    private String dueDate;
    private boolean status;
    
    public Task(String title , String description , String dueDate){
        this.title = title ;
        this.description = description;
        this.dueDate = dueDate ;
        status =false;
        
    }
    
    public String getTitle(){ return title ;}
    public String getDescription(){ return description ;}
    public String getDueDate(){ return dueDate ;}
    public boolean getStatus(){ return status ;}
    
    public void markComplete(){
        status = true ;
    }
    public void updateTask(String title , String description , String dueDate,Boolean status){
        if(title!=null) this.title  = title;
        if(description!=null) this.description= description;
        if(dueDate!=null) this.dueDate  = dueDate;
        if(status!=null) this.status = status;
    
}
    public String displayTask(){
        return "Title:"+title+"\nDescription:"+description+"\nDue date:"+dueDate+
                "\nStatus"+status;
    }

    @Override
    public String toString(){
        return displayTask();
    }
}
   