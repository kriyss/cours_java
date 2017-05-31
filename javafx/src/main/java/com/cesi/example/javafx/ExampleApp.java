package com.cesi.example.javafx;

import com.cesi.example.javafx.scene.MainScene;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleApp extends Application {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleApp.class);

    public void start(Stage primaryStage) throws Exception {
        LOG.info("Starting Example javafx application");
        MainScene scene = new MainScene(primaryStage);
        scene.show();

    }
}
