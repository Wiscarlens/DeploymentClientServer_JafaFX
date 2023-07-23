module com.example.deployment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deployment to javafx.fxml;
    exports com.example.deployment;
}