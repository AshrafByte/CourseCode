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
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class HomeController implements Initializable
{    
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
   public void goToDashboard() throws IOException
   {
      App.setRoot("dashboard");
   }
   
   @FXML
   public void goToLogin() throws IOException
   {
      App.account = null;
      App.setRoot("login");
      System.out.println("You logged out");
   }
   
}
