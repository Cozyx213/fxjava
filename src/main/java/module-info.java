module com.example.fxjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;


    exports com.example.fxjava.FoodOrderingSystemPack;
    opens com.example.fxjava.FoodOrderingSystemPack to javafx.fxml;
    exports com.example.fxjava.CharacterRemoverPack;
    opens com.example.fxjava.CharacterRemoverPack to javafx.fxml;
    exports com.example.fxjava.PasswordValidatorPack;
    opens com.example.fxjava.PasswordValidatorPack to javafx.fxml;
}