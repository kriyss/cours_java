package com.cesi.example.javafx.controller;

import com.cesi.example.javafx.model.Student;
import com.cesi.example.javafx.scene.MainScene;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by kriyss on 31/05/17.
 */
public class EleveAddController implements Initializable, Controller {
    @FXML
    public TextField nameField;
    @FXML
    public TextField firstNameField;
    @FXML
    public Button back;
    private Student student;
    private Stage stage;

    @Override
    public void setData(Object o) {
        this.student = (Student) o;
        this.nameField.setText(this.student.getName());
        this.firstNameField.setText(this.student.getFirstName());
    }

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        back.setOnAction(event -> new MainScene(stage).show());
    }
}
