package com.example.fxjava.CharacterRemoverPack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CharacterRemoverController {
    @FXML
    private Label textLabel;
    @FXML
    private CheckBox vowelCheckbox;
    @FXML
    private CheckBox consonantCheckbox;
    @FXML
    private CheckBox numberCheckbox;
    public void remove(ActionEvent event){
        StringBuilder jek = new StringBuilder();
        for (char c: textLabel.getText().toCharArray()){
            if(vowelCheckbox.isSelected() && "AEIOU".indexOf(c)!=-1 ){
                continue;
            }
            if(consonantCheckbox.isSelected() && "AEIOU1234567890".indexOf(c)==-1 ){
                continue;
            }
            if(numberCheckbox.isSelected() && "1234567890".indexOf(c)!=-1 ){
                continue;
            }
            jek.append(c);
        }
        textLabel.setText(jek.toString());
    }
    public void restore(ActionEvent event){
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        textLabel.setText(text);
    }

}