/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class MyLearningController implements Initializable
{

   Stage window = new Stage();
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
}
