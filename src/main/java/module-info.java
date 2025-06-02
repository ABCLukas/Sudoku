module com.mycompany.sudokugui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.sudokugui to javafx.fxml;
    exports com.mycompany.sudokugui;
}
