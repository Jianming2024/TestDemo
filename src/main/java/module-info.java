module easv.dk.testdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens easv.dk.testdemo to javafx.fxml;
    exports easv.dk.testdemo;
}