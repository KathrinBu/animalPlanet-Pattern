package com.example.animalplanetpattern;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HelloController {
    @FXML
    TextField fileName;

    @FXML
    HBox animalsBox;
    @FXML
    TextArea txtLines;
    @FXML
    Button start;

    Zoo zoo=new Zoo();

    public void loadText() {
        TextField txtFileName;
        String fname = fileName.getText();
        txtLines.clear();
        animalsBox.getChildren().clear();
        try {
            List<String> lines = Files.readAllLines(Path.of(fname), StandardCharsets.UTF_8);
           zoo.get(lines);

        } catch (IOException e) {
            System.out.println(":(");
        }
    }
}