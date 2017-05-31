package com.cesi.example.javafx.scene;

import com.cesi.example.javafx.controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public abstract class AbstractScene {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractScene.class);
    protected final String PATH;
    protected final String TITLE;
    protected final Stage stage;
    protected final FXMLLoader loader;
//    private Scene scene;
    private javafx.scene.Parent rootNode;

    protected AbstractScene(Stage stage, String scenePath, String title) {
        this.PATH = scenePath;
        this.TITLE = title;
        this.stage = stage;
        this.loader = new FXMLLoader();

        try {
            rootNode = loader.load(getClass().getResourceAsStream(PATH));
            this.getController().setStage(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        LOG.debug("Showing JFX scenes");
        Scene scene = new Scene(rootNode, 800, 600);
        stage.setTitle(TITLE);
        stage.setScene(scene);
        stage.show();
    }

    public Controller getController() {
        return loader.getController();
    }

}
