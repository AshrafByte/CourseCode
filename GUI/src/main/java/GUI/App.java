package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene page;
    private static Stage window;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage ;
        page = new Scene(loadFXML("login"));
      
        window.setScene(page);
        window.show();
    }

    static void setRoot(String fxml) throws IOException {
        page = new Scene(loadFXML(fxml));
        window.setScene(page);
        window.show();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

}