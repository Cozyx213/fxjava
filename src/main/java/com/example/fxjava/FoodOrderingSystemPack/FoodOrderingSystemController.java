package com.example.fxjava.FoodOrderingSystemPack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodOrderingSystemController   {
    private double total =0;
    @FXML private ToggleGroup group1;
    @FXML private CheckBox cPizza;
    @FXML private CheckBox cBurger;
    @FXML private CheckBox cFries;
    @FXML private CheckBox cSoftDrinks;
    @FXML private CheckBox cTea;
    @FXML private CheckBox cSundae;

    @FXML private RadioButton rbNone;
    @FXML private RadioButton rb5;
    @FXML private RadioButton rb10;
    @FXML private RadioButton rb15;
    @FXML private Label message;
    public void order(ActionEvent event){
        int flag =0;
        if(cPizza.isSelected()){
            flag=1;
            total+=100;
        }
        if(cBurger.isSelected()){
            total+=80 ;flag=1;
        }
        if(cFries.isSelected()){
            total+=65;flag=1;
        }
        if(cSoftDrinks.isSelected()){
            total+=55;flag=1;
        }
        if(cTea.isSelected()){
            total+=50;flag=1;
        }
        if(cSundae.isSelected()){
            total+=40;flag=1;
        }
        if(flag==0){
            message.setText("Pick food");
            return;
        }

        String text = ((RadioButton)group1.getSelectedToggle()).getText();
        if(text.equals("5% Off")){
            total*= 0.95;
        }
        if(text.equals("10% Off")){
            total*= 0.90;
        }
        if(text.equals("15% Off")){
            total*= 0.85;
        }

        message.setText(String.format("The total price is Php %.2f",total));
        total=0;
    }

}