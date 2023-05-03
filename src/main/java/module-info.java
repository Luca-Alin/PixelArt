module com.pixelart.pixelart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pixelart.pixelart to javafx.fxml;
    exports com.pixelart.pixelart;
}