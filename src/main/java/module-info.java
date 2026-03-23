module dk.easv.designpatternworkshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.designpatternworkshop to javafx.fxml;
    exports dk.easv.designpatternworkshop;
}