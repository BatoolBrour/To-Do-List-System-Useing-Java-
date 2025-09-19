
package personal.task.manager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class UserInterface extends Application {
    TextField  titField;
    TextField  desField;
    TextField  dateField;
    VBox task;
    Stage taskStage;
    HBox boxx;
    
    
    @Override
    public void start(Stage primaryStage) {
        //Window ##1 
        Font fnt = Font.font("Verdana",15);
        VBox lbBox = new VBox (20);
         boxx = new HBox (7);
          
         
        Label tit = new Label("Title ");
        tit.setFont(fnt);
       
        Label des = new Label("Description ");
        des.setFont(fnt);
        Label date = new Label("Due date ");
        date.setFont(fnt);
        lbBox .getChildren().addAll(tit,des,date);
        
        VBox txtBox = new VBox(7);
          titField = new TextField();
          desField = new TextField();
          dateField = new TextField();
        VBox sub_buttonBox = new VBox(15);
               Button sub_button = new Button("Submite");
               Label space1 = new Label("   ");
               Label space2 = new Label("  ");
        sub_buttonBox.getChildren().addAll(space1,space2,sub_button);
        
        VBox opsholder = new VBox(15); 
        Label space = new Label("   ");
        Label space_ = new Label("  ");
         Button show = new Button("Show all tasks");
         opsholder.getChildren( ).addAll(space,space_,show);
        
      
        txtBox.getChildren().addAll(titField,desField,dateField);
        boxx.getChildren().addAll(lbBox,txtBox,sub_buttonBox,opsholder);
        
           
        Scene scene = new Scene(boxx);
        primaryStage.setScene(scene);
        primaryStage.setTitle("To-Do List");
        primaryStage.show();
        
   SubmmitHandlerClass shc = new SubmmitHandlerClass();
      sub_button.setOnAction(shc);
////////////////Window ##2/////////////////////////////////
         taskStage = new Stage();
         task= new VBox (10);
        Scene scene2 = new Scene(task);
        taskStage.setScene(scene2);
        taskStage.setTitle("Tasks");
         
//////////////////////////////////////////////////////////
    }
  
   public class SubmmitHandlerClass implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent o) {
         Task gettingtask = new Task(titField.getText(),desField.getText(),dateField.getText());
         Label showTask_tit = new Label("Task title     : "+gettingtask.getTitle());
         Label showTask_des =new Label("Task describtion: "+gettingtask.getDescription());
         Label showTask_date =new Label("Task due date  : "+gettingtask.getDueDate() );
         Label showTask_status = new Label("Task status : "+gettingtask.getStatus());
         
         String stars = "Task describtion: "+desField.getText();
         String trimm="*";
         Label trim = new Label(trimm);
         while(trimm.length() <= stars.length() ){
            trimm +="*";
           trim = new Label(trimm);
         }
         Label response = new Label ("DONE!");
         boxx.getChildren().add(response);
         task.getChildren().addAll(showTask_tit,showTask_des,showTask_date,trim,showTask_status);
         taskStage.show();
        }
       
   }
     public static void main(String[] args) {
        launch(args);
    }
}
    
