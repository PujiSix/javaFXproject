package com.example.javafxproject;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloController  extends LogicControl{
    @FXML private TextField EmailText;
    @FXML private PasswordField PasswordText;
    @FXML private AnchorPane LoginPageAnchorPane,SignUpPageAnchorPane,HomePageAnchorPane;
    @FXML private Stage stage;
    @FXML private ImageView imageView;
    @FXML private Label labelHome;

    private Boolean isScreen = true;

    public void exitLogin(ActionEvent e){super.keyEx(LoginPageAnchorPane);}
    public void exitSignUp(ActionEvent e){super.keyEx(SignUpPageAnchorPane);}
   public void exitHomePage(ActionEvent e) {super.keyEx(HomePageAnchorPane);}

   public void login(ActionEvent e)throws Exception{
        String email = EmailText.getText();
        String password = PasswordText.getText();
        if (email.isEmpty() && password.isEmpty()){
            super.alertNotif("Attention","Email dan Password anda kosong","Isi kolom Email dan Password jika ingin login");
        } else if (email.isEmpty()){
            super.alertNotif("Attention","Email anda kosong","Isi kolom Email jika ingin login");
        }else if (password.isEmpty()){
            super.alertNotif("Attention","Password anda kosong","Isi kolom Password jika ingin login");
        }else {
            FadeTransition fadeTransition = new FadeTransition();
            fadeTransition.setDuration(Duration.millis(800));
            fadeTransition.setNode(LoginPageAnchorPane);
            fadeTransition.setFromValue(1);
            fadeTransition.setToValue(0);
            fadeTransition.setOnFinished((ActionEvent event)->
                    {
                        super.closePage(LoginPageAnchorPane);
                        viewHomePage();
                    }
                    );
            fadeTransition.play();

            
        }

   }
     public void viewHomePage(){
        try {
            super.view("HomePage.fxml","DesainHome.css",null);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
     }

    public void signUp(ActionEvent e){
       try {
           super.closePage(LoginPageAnchorPane);
           super.view("SignUpPage.fxml","DesainLogin.css",true);
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }
    }

    public void Login(ActionEvent e){
        try {
            super.closePage(SignUpPageAnchorPane);
            super.view("LoginPage.fxml","DesainLogin.css",false);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void ScreenMode(ActionEvent e){
        try {
            isScreen = !isScreen;
            if (isScreen){
                super.setLightScreen(HomePageAnchorPane);
            }else {
                super.setDarkScreen(HomePageAnchorPane);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    }
