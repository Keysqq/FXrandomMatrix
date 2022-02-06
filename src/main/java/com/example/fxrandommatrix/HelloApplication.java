package com.example.fxrandommatrix;
//Dev:Justin Fredericks
//Date: 2/6/2022
//Class: 171
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gPane = new GridPane();

        for(int j=0;j<10;j++) {// nested for loop used to emulate rows and columns
            for (int i = 0; i < 10; i++) {
                int rand = (int)(Math.random()*2);
                String s = String.valueOf(rand);
                gPane.add(new TextField(s),i,j);
            }
        }

        Scene scene = new Scene(gPane, 320, 250);
        stage.setTitle("Random Matrix Values 0-1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}