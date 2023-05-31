package com.example.javafxproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LogicControl {
    Stage stage;
    public void keyEx(AnchorPane anchor){
        stage = (Stage) anchor.getScene().getWindow();
        stage.close();
    }
    public void alertNotif(String title, String header, String conten){
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(conten);
        alert.show();
    }

    public void view(String fxmlFile,String cssFile,Boolean resizePane){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(parent);
            scene.getStylesheets().add(getClass().getResource(cssFile).toExternalForm());
            Stage stage = new Stage();

            //scene settings
            scene.setFill(Color.TRANSPARENT);

            //stage settings
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            if (resizePane == null){

            }else {
                stage.setResizable(resizePane);
            }
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void closePage(AnchorPane anchor){
        stage= (Stage) anchor.getScene().getWindow();
        stage.close();
    }
    public void setLightScreen(AnchorPane anchor){
        anchor.getStylesheets().add(getClass().getResource("dark.css").toExternalForm());
        anchor.getStylesheets().remove(getClass().getResource("DesainHome.css").toExternalForm());
        System.out.println("ligt");

    }

    public void setDarkScreen(AnchorPane anchor){
        anchor.getStylesheets().add(getClass().getResource("DesainHome.css").toExternalForm());
        anchor.getStylesheets().remove(getClass().getResource("dark.css").toExternalForm());
        System.out.println("dark");
    }
}
