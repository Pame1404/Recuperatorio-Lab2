module com.example.recuperatorio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.recuperatorio to javafx.fxml;
    exports com.example.recuperatorio;
}