package dk.easv.designpatternworkshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void btnReload(ActionEvent actionEvent) {
    }

    public void btnConnect(ActionEvent actionEvent) {
    }

    public void btnDisconnect(ActionEvent actionEvent) {
    }

    public void btnSendConfig(ActionEvent actionEvent) {
    }

    public void btnReadResult(ActionEvent actionEvent) {
    }

    public void btnResetResult(ActionEvent actionEvent) {
    }

    public void btnLoadTemplate(ActionEvent actionEvent) {
    }
}
