module com.example.contact2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.contact2 to javafx.fxml;
    exports com.example.contact2;
}