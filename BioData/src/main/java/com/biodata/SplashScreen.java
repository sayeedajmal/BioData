package com.biodata;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SplashScreen implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new Screen().start();
    }

    public class Screen extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);

                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                       
                        try {
                            Stage stage = new Stage();
                            stage.setTitle("BioData");
                            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Index.fxml"));
                            Scene scene = new Scene(root);
                            scene.getStylesheets().add("/Style/style.css");
                            stage.setScene(scene);
                            stage.initStyle(StageStyle.TRANSPARENT);
                            stage.show();
                                                        
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                });

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
