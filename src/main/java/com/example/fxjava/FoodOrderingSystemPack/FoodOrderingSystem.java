package com.example.fxjava.FoodOrderingSystemPack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodOrderingSystem extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(FoodOrderingSystem.class.getResource("food-ordering-system.fxml"));
        Scene scene = new Scene(loader.load(),520,400);
        stage.setTitle("Food Ordering System");
        stage.setScene(scene);
        stage.show();
    }
}