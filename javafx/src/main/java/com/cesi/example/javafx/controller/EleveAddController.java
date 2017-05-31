package com.cesi.example.javafx.controller;

import com.cesi.example.javafx.model.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

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
    private Student student;
    private Scene scene;

    @Override
    public void setData(Object o) {
        this.student = (Student) o;
        this.nameField.setText(this.student.getName());
        this.firstNameField.setText(this.student.getFirstName());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
