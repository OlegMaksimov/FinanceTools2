package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button btn1;

    @FXML
    private void click() {
        System.out.println("send hello");
    }
}
