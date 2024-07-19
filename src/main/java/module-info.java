module com.example.designlec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.designlec to javafx.fxml;
    exports com.example.designlec;
}