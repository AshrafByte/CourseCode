/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.Effect;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class LoginController implements Initializable
{
   @FXML
   TextField userName ;
   @FXML
   PasswordField password ;
   @FXML
   Label error ;
   /**
    * Initializes the controller class.
    */
   @Override
   public void initialize(URL url, ResourceBundle rb)
   {
      // TODO
   }

   @FXML
   private void goToHome() throws IOException
   {
      if (userName.getText().equals("Ahmed") && password.getText().equals("1234"))
         App.setRoot("home");
      else
      {
         FadeTransition ft1 = new FadeTransition(Duration.seconds(5),error);
         error.setVisible(true);
         ft1.setFromValue(1.0);
         ft1.setToValue(0);
         ft1.play();
         
      }
    
   }
}
