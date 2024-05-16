package edu.miracosta.cs112.capstoneproject.view;


import javafx.scene.Scene;
import javafx.stage.Stage;




public class ViewNavigator {


    private static Stage mainStage;


    /**
     * Sets the main stage (window) when the application first loads (in the View class)
     * @param stage The main stage
     */
    public static void setStage(Stage stage) {
        mainStage = stage;
    }


    /**
     * Navigates from one scene to another, e.g. from the MainScene to the AddScene.
     */
    public static void loadScene() {
        mainStage.setTitle(Title);
        mainStage.setScene(Scene);
        mainStage.show();
    }


}
