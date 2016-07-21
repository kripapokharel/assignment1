package Controller;

import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import View.SignUpJavaFXView;
import Model.UserDB;

import javafx.fxml.FXML;

/**
 * Created by Kripa Pokharel
 * on 7/06/2016
 */

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


    }

    public void openSignUpView() throws Exception {
        new SignUpJavaFXView();
    }
}
