package com.biodata;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
       
        stage.setTitle("BioData");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Index.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/Style/style.css");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setFullScreen(false);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}