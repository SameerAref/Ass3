/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q22;

import java.awt.Label;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lenovo
 */
public class Q3 extends Application {
    private ListView<Student> list;
     
    @Override
    public void start(Stage primaryStage) {
        
         Button b3 = new Button("Add student");
     Button b4 = new Button("View student");
     Pane p2= new VBox(7,b3,b4);
     ((VBox)p2).setAlignment(Pos.CENTER);
      Scene s2=new Scene(p2,350,450);
      p2.setStyle("-fx-background-color:gray");
      primaryStage.setTitle("Login Page");
      primaryStage.setScene(s2);
      primaryStage.setTitle("Optinal Page");
      
      
        list=new ListView<>();
        
     Button btn1=new Button("Add");
     btn1.setStyle("-fx-text-fill: white; -fx-background-color: Blue;");
     Button btn2=new Button("Resite");
     btn2.setStyle("-fx-text-fill: white; -fx-background-color: yellow;");
     Button btn3=new Button("Exite");
     btn3.setStyle("-fx-text-fill: white; -fx-background-color: pink;");
     
     javafx.scene.control.TextField t2=new javafx.scene.control.TextField();
     javafx.scene.control.Label l1=new javafx.scene.control.Label("id:");
     javafx.scene.control.TextField t1=new javafx.scene.control.TextField();
     javafx.scene.control.Label l2=new javafx.scene.control.Label("Name: ");
     javafx.scene.control.TextField t3=new javafx.scene.control.TextField();
     javafx.scene.control.Label l3=new javafx.scene.control.Label("Major :");  
     javafx.scene.control.TextField t4=new javafx.scene.control.TextField();
     javafx.scene.control.Label l4=new javafx.scene.control.Label("Grade:");
     javafx.scene.control.Label l5=new javafx.scene.control.Label("Student data");
       
     HBox h2=new HBox(4,btn1,btn2,btn3);
       h2.setAlignment(Pos.CENTER);
        list.setPrefSize(300, 350);
        
         HBox h3=new HBox(1,l1,t2);
         HBox h4=new HBox(3,l2,t1);
         HBox h5=new HBox(3,l3,t3);
         HBox h6=new HBox(3,l4,t4);
         VBox b=new VBox(10,l5,h3,h4,h5,h6,h2); 
        
        
        VBox b1=new VBox(list);
        HBox h=new HBox(3,b,b1);
        h.setAlignment(Pos.CENTER);
        h.setStyle("-fx-background-color:green;-fx-padding: 70px");
         Scene s3=new Scene(h,680,700);
       
      b3.setOnAction(event->{
         primaryStage.setScene(s3);
      });
      
      List <Student> lista=new ArrayList<>();
      btn1.setOnAction(event->{
          Student s=new Student(Integer.parseInt(t2.getText()),t1.getText(),t3.getText(), Double.parseDouble(t4.getText()));
        lista.add(s);

         lista.sort( Comparator.comparingDouble(Student::getGrade).reversed());

     list.getItems().setAll(lista);
         t1.setText("");
         t2.setText("");
         t3.setText("");
         t4.setText("");
      });
     
      primaryStage.show();
      
    }
 
    public static void main(String[] args) {
        launch(args);
    }
    
}