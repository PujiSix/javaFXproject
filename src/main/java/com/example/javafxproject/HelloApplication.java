package com.example.javafxproject;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        ToggleButton slideButton = new ToggleButton();
        slideButton.getStyleClass().add("slide-button");

        HBox root = new HBox(slideButton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 200, 100);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setTitle("Slide Button Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}