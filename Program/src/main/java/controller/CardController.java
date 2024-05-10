package controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import java.net.URL;
import java.util.ResourceBundle;

public class CardController implements Initializable{
    @FXML
    private HBox cardLayout;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ProgressBar progressBar = new ProgressBar();
        progressBar.setStyle("-fx-fill: green;");
    }

}
