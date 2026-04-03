package com.example.fxjava.CharacterRemoverPack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public  class CharacterRemover extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CharacterRemover.class.getResource("character-remover.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 380);
        stage.setTitle("Character Remover");
        stage.setScene(scene);
        stage.show();
    }


}