/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class MyLearningController implements Initializable
{

   @FXML
   TilePane coursesPane;
   /**
    * Initializes the controller class.
    */
   @Override
   public void initialize(URL url, ResourceBundle rb)
   {
      // TODO
   }   
   
   @FXML
   public void goToSetting() throws IOException
   {
      App.setRoot("setting");
   }
   
   @FXML
   public void goToLogin() throws IOException
   {
      App.setRoot("login");
   }
   
   @FXML
   public void goToDashboard() throws IOException
   {
      App.setRoot("dashboard");
   }
   
   @FXML 
   private void sortCourses()
   {
        ObservableList<Node> boxes = coursesPane.getChildren();
        List<Node> boxesList = new ArrayList<>(boxes);
        Collections.sort(boxesList, (v1, v2) -> Integer.valueOf(((VBox)v1).getAccessibleText()).compareTo (Integer.parseInt(((VBox)v2).getAccessibleText())));
        coursesPane.getChildren().clear();
        coursesPane.getChildren().addAll(boxesList);
   }
}