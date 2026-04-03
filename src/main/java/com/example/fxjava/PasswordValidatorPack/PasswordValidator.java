

package com.example.fxjava.PasswordValidatorPack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PasswordValidator extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(PasswordValidator.class.getResource("password-validator.fxml"));
        Scene scene = new Scene(loader.load(),520,240);
        stage.setTitle("Password Validator");
        stage.setScene(scene);
        stage.show();
    }
}
