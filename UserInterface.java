
package personal.task.manager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class UserInterface extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    
        VBox lbBox = new VBox (20);
        HBox boxx = new HBox (7);
        
        Label tit = new Label("Title ");
        Label des = new Label("Description ");
        Label date = new Label("Due date ");
        lbBox .getChildren().addAll(tit,des,date);
        
        VBox txtBox = new VBox(7);
        TextField  titField = new TextField();
        TextField   desField = new TextField();
        TextField  dateField = new TextField();
        txtBox.getChildren().addAll(titField,desField,dateField);
        boxx.getChildren().addAll(lbBox,txtBox);
          
        
        Scene scene = new Scene(boxx,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("To-Do List");
        primaryStage.show();
        
    }    
    public static void main(String[] args) {
        launch(args);
    }
    
}
