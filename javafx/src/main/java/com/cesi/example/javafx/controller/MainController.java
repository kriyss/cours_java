package com.cesi.example.javafx.controller;

import com.cesi.example.javafx.model.Student;
import com.cesi.example.javafx.repository.Repository;
import com.cesi.example.javafx.repository.impl.EleveRepository;
import com.cesi.example.javafx.scene.EleveAddScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Controller {

    private final Repository<Student, String> studentRepo;
    @FXML
    private TableView<Student> content;
    @FXML
    private TableColumn<Student, String> nameCol;
    @FXML
    private TableColumn<Student, String> firstNameCol;
    @FXML
    private TableColumn<Student, Button> actionCol;

    public MainController() {
        this.studentRepo = new EleveRepository();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // create some students
        studentRepo.create(new Student("Doe", "John", 10.3));
        studentRepo.create(new Student("Mouse", "Mickey", 10.3));
        studentRepo.create(new Student("Carpenter", "John", 10.3));

        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        content.getItems().addAll(studentRepo.getAll());


        actionCol.setCellFactory(tableColumn -> new TableCell<Student, Button>() {

            Button btn = new Button("Modify");

            @Override
            public void updateItem(Button item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                    setText(null);
                } else {
                    btn.setOnAction(event -> {
                        Student student = getTableView().getItems().get(getIndex());
                        System.out.println(student.getFirstName() + "   " + student.getId());
                        EleveAddScene scene = new EleveAddScene((Stage) this.getScene().getWindow());
                        scene.getController().setData(student);
                        scene.show();
                    });
                    setGraphic(btn);
                    setText(null);
                }
            }
        });

    }

    @Override
    public void setData(Object o) {

    }
}
