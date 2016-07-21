package Controller;

/**
 * Created by usa on 7/10/2016.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import View.SignUpJavaFXView;
import Exception.IndexOutOfBoundException;

import java.io.IOException;

import Model.User;

import javafx.fxml.FXML;
import Model.UserDB_OrderedArray;
import View.WelcomeJavaFXView;
import javafx.stage.Stage;

public class LoginController_OrderedArray {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;

    public void Authenticate() throws IndexOutOfBoundException, IOException {

        for (int i = 0; i < UserDB_OrderedArray.getUsers().size(); i++) {
            if (uname.getText().equals(UserDB_OrderedArray.getUsers().getE(i).getUserName()) && pw.getText().equals(UserDB_OrderedArray.getUsers().getE(i).getPassWord())) {
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
