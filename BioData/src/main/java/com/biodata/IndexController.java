package com.biodata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    public Label output;

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
    public void create() throws IOException, DocumentException, InterruptedException {

        /* CREATING FILE WITH .TXT EXTENSION */
        String path = System.getProperty("user.home") + File.separator + "Desktop";
        path += File.separator + name.getText().toString();
        File file = new File(path + ".txt");
        if (name.getText().isBlank() == false && address.getText().isBlank() == false
                && phone.getText().isBlank() == false && email.getText().isBlank() == false
                && occupation.getText().isBlank() == false && father.getText().isBlank() == false
                && mother.getText().isBlank() == false && brother.getText().isBlank() == false
                && sister.getText().isBlank() == false && nation.getValue().isBlank() == false
                && !dateofbirth.toString().isBlank()) {
            FileWriter fWriter = new FileWriter(file, true);
            fWriter.append("\t\t\t\t PERSONAL INFORMATION" + "\n\n\t\t" + "Name :" + name.getText() + "\n\t\t"
                    + "Date of Birth : " + dateofbirth.getValue() + "\n\t\t" + "Address :" + address.getText() + "\n\t\t"
                    + "Phone : " + phone.getText() + "\n" + "Nationality : " + nation.getValue() + "\n" + "Email : "
                    + email.getText() + "\n\t\t" + "Occupation : " + occupation.getText() + "\n\n\n\n\n"
                    + "\t\t\t\t FAMILY INFORMATION " + "\n\n\t\t" + "Father's Name: " + father.getText() + "\n\t\t"
                    + "Mother's Name : " + mother.getText() + "\n\t\t" + "Married Brother(s) : " + brother.getText() + "\n\t\t"
                    + "Married Sister(s) : " + sister.getText());
            fWriter.close();
            /* CREATING PDF FILE WITH .PDF EXTENSION */
            Document document = new Document(PageSize.A4, 20, 20, 20, 20);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(path + ".pdf"));
            document.open();
            Paragraph para = new Paragraph("\t\t\t\t PERSONAL INFORMATION" + "\n\n" + "Name :" + name.getText() + "\n"
                    + "Date of Birth : " + dateofbirth.getValue() + "\n" + "Address :" + address.getText() + "\n"
                    + "Phone : " + phone.getText() + "\n" + "Nationality" + nation.getValue() + "\n" + "Email : "
                    + email.getText() + "\n" + "Occupation : " + occupation.getText() + "\n\n\n\n\n"
                    + "\t\t\t\t FAMILY INFORMATION " + "\n\n" + "Father's Name: " + father.getText() + "\n"
                    + "Mother's Name" + mother.getText() + "\n" + "Married Brother(s) : " + brother.getText() + "\n"
                    + "Married Sister(s) : " + sister.getText());
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.close();

            pdfWriter.close();
            output.setText("BioData of " + name.getText() + " is Created Sucessfully 💓");
            /* Clearing Filled Text */
            clear();
        } else {
            output.setText("Fill All Fields !!!");
        }

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
