package Lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public TextArea textAreaInput;

    public void clickBtn1(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }

    public void textAreaInputSendText(KeyEvent keyEvent) {
        if(keyEvent.isShiftDown() && keyEvent.getCode().equals(KeyCode.ENTER)){
            textArea.appendText(textAreaInput.getText());
            textAreaInput.clear();
            textAreaInput.requestFocus();
        }
    }
}
