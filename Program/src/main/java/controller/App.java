package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.animation.FadeTransition;
import static javafx.application.Application.launch;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import system.Account;
import system.LMS;
import system.SystemTest;

/**
 * JavaFX App
 */
public class App extends Application
{

   private static Scene page;
   private static Stage window;
   static Account account;

   @Override
   public void start(Stage stage) throws IOException
   {
      window = stage;
      page = new Scene(loadFXML("card"));
      window.setScene(page);
      window.show();
   }

   static void setRoot(String fxml) throws IOException
   { 
      page = new Scene(loadFXML(fxml));
      window.setScene(page);
      window.centerOnScreen();
      window.show();
   }

   private static Parent loadFXML(String fxml) throws IOException
   {
      FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
      return fxmlLoader.load();
   }

   static void playErrorAnimation(Node n)
   {
      FadeTransition ft1 = new FadeTransition(Duration.seconds(5), n);
      n.setVisible(true);
      ft1.setFromValue(1.0);
      ft1.setToValue(0);
      ft1.play();
   }
   public static void main(String[] args)
   {
      SystemTest.TestGUI();
      launch(args);
   }

}
