
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
    
    @Override
    public void start(Stage primaryStage) {
        //Window ##1 
        Font fnt = Font.font("Verdana",15);
        VBox lbBox = new VBox (20);
        HBox boxx = new HBox (7);
          
          
        Label tit = new Label("Title ");
       tit.setFont(fnt);
        Label des = new Label("Description ");
        des.setFont(fnt);
        Label date = new Label("Due date ");
        date.setFont(fnt);
        lbBox .getChildren().addAll(tit,des,date);
        
        VBox txtBox = new VBox(7);
        TextField  titField = new TextField();
        TextField   desField = new TextField();
        TextField  dateField = new TextField();
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
        
           
        Scene scene = new Scene(boxx,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("To-Do List");
        primaryStage.show();
        
        //Window ##2
        
    }    
    public static void main(String[] args) {
        launch(args);
    }
    
}
