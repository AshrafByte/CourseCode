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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import system.Account;
import system.Instructor;
import system.LMS;
import system.Student;

/**
 * FXML Controller class
**/
public class CreateAccountController implements Initializable
{
   @FXML
   TextField username;
   @FXML
   TextField email;
   @FXML
   PasswordField password;
   @FXML
   PasswordField confirmPassword;
   @FXML
   Label errorL ;
   @FXML
   RadioButton accountType;
   /**
    * Initializes the controller class.
    */
   @Override
   public void initialize(URL url, ResourceBundle rb)
   {
      // TODO
   }   
   
 
   private boolean isValidFields()
   {
      if (username.getText().equals("") || email.getText().equals("") || password.getText().equals("")  || confirmPassword.getText().equals(""))
      {
         errorL.setText("Please provide all data fields");
         return false;
      }
      if (LMS.findAccount(username.getText()) != null)
      {
         errorL.setText("Username already exists");
         return false;
      }
      if (!(password.getText().equals(confirmPassword.getText())))
      {
         errorL.setText("Passwords don't match");
         return false;
      }
      return true;
   }
   @FXML
   private void register() throws IOException
   {
      if (isValidFields())
      {
         if (accountType.isSelected())
            App.account = new Instructor(username.getText(), password.getText(), email.getText());
         else
            App.account = new Student(username.getText(), password.getText(), email.getText());
         LMS.createAccount(App.account);
         App.setRoot("dashboard");
      }
      else
         App.playErrorAnimation(errorL);
         
   }
}
