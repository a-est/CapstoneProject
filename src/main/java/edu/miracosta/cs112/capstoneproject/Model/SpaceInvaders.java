package edu.miracosta.cs112.capstoneproject.Model;


import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;




public class SpaceInvaders extends Application {
    private static final Object SPACE = 0;
    private Pane root = new Pane();
    private Sprite player = new Sprite(300, 750, 40, 40, "player", Color.BLUE);


    private Parent createContent(){
        root.setPrefSize(600, 800);
        root.getChildren().add(player);
        return root;
    }


    private void shoot() {


    }


    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createContent());
        scene.setOnKeyPressed(e -> {
            switch(e.getCode()) {
                case A:
                    player.moveLeft();
                    break;
                case D:
                    player.moveRight();
                    break;
                case SPACE:
                    shoot();
                    break;
            }
        });


        stage.setScene(scene);
        stage.show();
    }


    private static class Sprite extends Rectangle {
        boolean dead = false;
        final String type;


        //  Come back to sprite and add the spaceShip(or whatever it is)
        Sprite(int x, int y, int w, int h, String type, Color color){
            super(w, h, color);


            this.type = type;
            setTranslateX(x);
            setTranslateY(y);
        }
        void moveLeft(){
            setTranslateX(getTranslateX() - 5);
        }
        void moveRight(){
            setTranslateX(getTranslateX() + 5);
        }
        void moveUp(){
            setTranslateY(getTranslateY() -5);
        }


        void moveDown(){
            setTranslateY(getTranslateY() +5);
        }


    }


    public static void main(String[] args){
        launch((args));
    }
}

