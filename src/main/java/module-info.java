module com.example.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    exports com.example.javafxproject;


    opens com.example.javafxproject to javafx.fxml;

}