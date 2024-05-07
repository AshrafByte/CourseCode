module GUI {
    requires javafx.controls;
    requires javafx.fxml;
   requires java.base;

    opens GUI to javafx.fxml;
    exports GUI;
}
