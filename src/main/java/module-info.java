module com.example.holabuenas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.holabuenas to javafx.fxml;
    exports com.example.holabuenas;
}