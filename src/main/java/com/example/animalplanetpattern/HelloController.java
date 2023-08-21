package com.example.animalplanetpattern;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class HelloController {
    @FXML
    TableView<ObservableAnimal> table;
    @FXML
    Button start;

    Zoo zoo = new Zoo("Кронверкский, 4");

    public void initialize() throws IOException {

        zoo.setAnimals(new AnimalReader().readAnimals("1.txt"));
        initTable();
        //Zoo.getMove(animals);

    }

    public void initTable() {
        table.getColumns().clear();
        TableColumn<ObservableAnimal, String> aColumn=new TableColumn<>("NAME");
        aColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        aColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        table.getColumns().add(aColumn);
        TableColumn<ObservableAnimal, String> bColumn=new TableColumn<>("doing");
        bColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableAnimal, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableAnimal, String> x) {
                return new SimpleStringProperty(x.getValue().move());
            }
        });
        table.getColumns().add(bColumn);
        table.setItems(zoo.animals);
        table.setEditable(true);
    }
}