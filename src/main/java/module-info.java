module com.example.fxrandommatrix {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxrandommatrix to javafx.fxml;
    exports com.example.fxrandommatrix;
}