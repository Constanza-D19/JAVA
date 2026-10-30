module cl.duoc.nora.cony {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens cl.duoc.nora.cony to javafx.fxml;
    exports cl.duoc.nora.cony;
}