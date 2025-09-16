

package personal.task.manager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java .util .ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskManager {
   ArrayList<Task> tasks = new ArrayList<Task>(); 
   File tasksFolder = new File ("C:\\Tasks\\");
   File tasksFile = new File(tasksFolder,"To Do List.txt");
   
    public TaskManager(){
        if(!tasksFolder.exists())
            tasksFolder.mkdir();
        if(!tasksFile.exists()){
            try {
                tasksFile.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
    }
    public void addTask(Task task){
        tasks.add(task);
          saveToFile();
      
    }
    public void deleteTask(int position){
       tasks.remove(position-1);
        saveToFile();
    }
    
    public void listTasks(){
        tasks.forEach(System.out::println);
    }
public void updateTask(int pos , String title , String description ,
                       String dueDate,Boolean status)
     {
      Task tas = tasks.get(pos-1);
      tas.updateTask(title, description, dueDate, status);
      saveToFile();
         
    }
    public void saveToFile(){
       int position =0;
       try {
           
          FileWriter fw = new FileWriter(tasksFile);
          PrintWriter pw = new PrintWriter(fw,true);
            for(Task t:tasks){
                position++;
             pw.println(position+"."+t);
            }}catch (IOException ex) {
           Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
       }
       }
         
}
