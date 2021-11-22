package ru.geekbrains.java_core2.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AppController {

    @FXML
    public Label label;
    public Button button;

    public void click(ActionEvent actionEvent) {
        System.out.println("button clicked");
        label.setText("Hello");

        button.setScaleY(5.0);
        button.setScaleX(5.0);

        button.setText("Presed");

    }
}
