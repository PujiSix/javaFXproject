package com.example.javafxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class parentHallo extends Application{

    public void start(Stage primaryStage) throws Exception {

        LogicControl control = new LogicControl();
        control.view("LoginPage.fxml","DesainLogin.css",false);

    }

    public static void main(String[] args) {
        launch(args);
    }

    }

