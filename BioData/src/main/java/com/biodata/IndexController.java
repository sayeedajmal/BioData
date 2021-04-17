package com.biodata;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class IndexController implements Initializable {
    /* <=====================================> */
    public JFXComboBox<String> nation;
    public JFXComboBox<Integer> totalbrothers;
    public JFXComboBox<Integer> totalsisters;
    public JFXDatePicker dateofbirth = new JFXDatePicker();
    public JFXTextField name = new JFXTextField();
    public JFXTextField address = new JFXTextField();
    public JFXTextField phone = new JFXTextField();
    public JFXTextField email = new JFXTextField();
    public JFXTextField occupation = new JFXTextField();
    public JFXTextField father = new JFXTextField();
    public JFXTextField mother = new JFXTextField();
    public JFXTextField brother = new JFXTextField();
    public JFXTextField sister = new JFXTextField();

    /* Nation Data */
    ObservableList<String> listnation = FXCollections.observableArrayList("India", "Pakistan", "Bangladesh", "Nepal",
            "Mayanmar", "U.S", "UK");

    /* totalBrothers */
    ObservableList<Integer> listbrothers = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
            14, 15, 16);

    /* TotalSisters */
    ObservableList<Integer> listsiters = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
            14, 15, 16);

    @FXML
    public void create() throws IOException {
        FileWriter fWriter = new FileWriter(name.getText().toString() + ".txt");
    }

    @FXML
    public void clear() {
        name.setText(null);
        address.setText(null);
        phone.setText(null);
        email.setText(null);
        occupation.setText(null);
        father.setText(null);
        mother.setText(null);
        brother.setText(null);
        sister.setText(null);
        nation.setValue(null);
        dateofbirth.setValue(null);
        totalbrothers.setValue(null);
        totalsisters.setValue(null);
    }

    @FXML
    public void close(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nation.setItems(listnation);
        totalbrothers.setItems(listbrothers);
        totalsisters.setItems(listsiters);
    }

}
