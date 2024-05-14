package edu.miracosta.cs112.capstoneproject.view;

import javafx.application.Application;
import javafx.stage.Stage;

public class View extends Application {
    public void start(Stage primaryStage) throws Exception {
        ViewNavigator.setStage(primaryStage);
        ViewNavigator.loadScene();
    }
}
