module com.example.dushyant_lab1 {

    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;



    opens com.example.dushyant_lab1 to javafx.fxml;
    exports com.example.dushyant_lab1;

}