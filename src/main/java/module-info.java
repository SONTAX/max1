module com.example.max1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.max1 to javafx.fxml;
    exports com.example.max1;
}