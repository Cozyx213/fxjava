package com.example.fxjava.PasswordValidatorPack;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.paint.Color;

public class PasswordValidatorController   {
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Label statusLabel;

    public void textValueChanged() {
        String text = passwordTextField.getText();
        boolean dig=false;
        boolean spec = false;
        statusLabel.setTextFill(Color.RED);
        if(text.length()<8){
            statusLabel.setText("Password must be 8 characters long");
            return;
        }
        for(char c : text.toCharArray()){
            if("1234567890".indexOf(c)!=-1)dig=true;
            if("qwertyuiopasdfghjkllzxcvbnm1234567890".indexOf(Character.toLowerCase(c))==-1)spec=true;
        }
        if(!dig){
            statusLabel.setText("Password must contain at least one digit");
            return;
        }
        if(!spec){
            statusLabel.setText("Password must contain at least one special character");
            return;
        }
        statusLabel.setText("Password is valid");
        statusLabel.setTextFill(Color.GREEN);
    }
}
