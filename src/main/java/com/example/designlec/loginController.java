package com.example.designlec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {
    public PasswordField passwordText;
    public TextField usernameText;


    public Label mySpaceLabel;

    @FXML
    protected void oncloseMenuButtonClick(){
        System.exit(0);
    }

    @FXML
    protected void onLoginButtonClick(){
        String username = usernameText.getText();
        String password = passwordText.getText();
        if(username.isEmpty() || password.isEmpty()){
            mySpaceLabel.setMaxSize(200, 50);
            mySpaceLabel.setText("Please enter your username and password");
        }
    }
}
