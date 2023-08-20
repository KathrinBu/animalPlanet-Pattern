package com.example.animalplanetpattern;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class HelloController {
    @FXML
    TableView<ObservableAnimals> table;
    @FXML
    Button start;

    ObservableList<ObservableAnimals> animals = FXCollections.observableArrayList();

    public void initialize() throws IOException {
        readFromFile();
        initTable();
        Zoo.getMove(animals);

    }

    public void initTable() {
        table.getColumns().clear();
        TableColumn<ObservableAnimals, String> aColumn=new TableColumn<>("NAME");
        aColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        aColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        table.getColumns().add(aColumn);
        TableColumn<ObservableAnimals, String> bColumn=new TableColumn<>("doing");
        bColumn.setCellValueFactory(new PropertyValueFactory<>("getMove"));
        table.setItems(animals);
        table.setEditable(true);
    }

    public List<String> readFromFile() throws IOException {
        List<String> list = readAllLines(new File("1.txt").toPath(), Charset.forName("UTF-8"));
        loadAnimals(list);
        return list;
    }

    public void loadAnimals(List<String> list) {
        for (String str : list) {
            ObservableAnimals beasts = new ObservableAnimals(str);
            animals.add(beasts);
        }


    }
}