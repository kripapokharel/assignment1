package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import View.SignUpJavaFXView;
import Model.UserDB;

import javafx.fxml.FXML;

public class LoginController {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;

    public void Authenticate() {
        for (int i = 0; i < UserDB.getUsers().size(); i++) {
            if (uname.getText().equals(UserDB.getUsers().get(i).getUserName())) {
                System.out.println("Welcome  " + uname.getText());
            } else {
                System.out.println("Fail Authentication");
            }
        }

/*<stylesheet>
* <URL */

    }

    public void openSignUpView() throws Exception {
        new SignUpJavaFXView();
    }
}
