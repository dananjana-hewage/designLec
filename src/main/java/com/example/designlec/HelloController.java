package com.example.designlec;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button welcomeButton;

    @FXML
    protected void onHelloButtonClick() throws Exception {

        welcomeText.setText("Welcome to JavaFX Application!");
        welcomeButton.setText("Hi!!!!!!");

//        Stage newStage = new Stage();
        Stage prevoiusStage = (Stage) welcomeButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        prevoiusStage.setScene(new Scene( root, 580,400));
        prevoiusStage.show();


//        prevoiusStage.close();
    }
}