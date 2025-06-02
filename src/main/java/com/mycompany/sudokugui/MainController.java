/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.sudokugui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author schne
 */
public class MainController implements Initializable {

    Background bg = new Background();
    Gamefield spf = new Gamefield();

    @FXML
    public VBox root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        spf.insertNumber(4, 0, 3);
        spf.insertNumber(8, 0, 7);
        spf.insertNumber(7, 0, 8);
        spf.insertNumber(8, 1, 1);
        spf.insertNumber(7, 1, 3);
        spf.insertNumber(4, 1, 6);
        spf.insertNumber(9, 1, 7);
        spf.insertNumber(3, 2, 0);
        spf.insertNumber(9, 2, 3);
        spf.insertNumber(2, 2, 4);
        spf.insertNumber(1, 2, 7);
        spf.insertNumber(1, 3, 2);
        spf.insertNumber(6, 3, 3);
        spf.insertNumber(7, 3, 4);
        spf.insertNumber(4, 3, 7);
        spf.insertNumber(6, 4, 0);
        spf.insertNumber(4, 4, 1);
        spf.insertNumber(8, 4, 3);
        spf.insertNumber(3, 4, 4);
        spf.insertNumber(2, 4, 6);
        spf.insertNumber(7, 4, 7);
        spf.insertNumber(5, 4, 8);
        spf.insertNumber(2, 5, 1);
        spf.insertNumber(7, 5, 2);
        spf.insertNumber(5, 5, 3);
        spf.insertNumber(4, 5, 4);
        spf.insertNumber(9, 5, 5);
        spf.insertNumber(3, 5, 7);
        spf.insertNumber(6, 6, 2);
        spf.insertNumber(5, 6, 4);
        spf.insertNumber(2, 6, 7);
        spf.insertNumber(2, 7, 0);
        spf.insertNumber(1, 7, 1);
        spf.insertNumber(8, 7, 2);
        spf.insertNumber(7, 7, 6);
        spf.insertNumber(5, 8, 1);
        spf.insertNumber(3, 8, 2);
        spf.insertNumber(4, 8, 5);

        updateList();

    }

    public void iteration() {
        bg.gamefieldScanner(spf);
        bg.findLonelyNumber(spf);
        for (int j = 0; j < 9; j++) {
            System.out.println(j);
            bg.findHorizontalUniqueNumbers(spf, j);
            bg.findVerticalUniqueNumbers(spf, j);
            for (int i = 0; i < 9; i++) {
                bg.findQuadrantUniqueNumbers(spf, i, j);
                i++;
            }
        }
    }

    public void updateList() {
        VBox containter = new VBox();
        for (int i = 0; i < 9; i++) {
            HBox row = new HBox();
            for (int j = 0; j < 9; j++) {
                row.getChildren().add(new Label("" + spf.getValOnField(i, j)));
            }
            containter.getChildren().add(row);
        }
        root.getChildren().clear();
        root.getChildren().add(containter);

        Button nextStepButton = new Button("Next Step");
        nextStepButton.setOnAction(eh -> {
            iteration();
            updateList();
        });
        root.getChildren().add(nextStepButton);
    }
}
