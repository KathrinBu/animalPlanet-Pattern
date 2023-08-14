module com.example.animalplanetpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animalplanetpattern to javafx.fxml;
    exports com.example.animalplanetpattern;
}