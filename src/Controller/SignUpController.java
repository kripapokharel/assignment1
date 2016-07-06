package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import Model.User;
import Model.UserDB;
import Model.UserIO;

import java.io.IOException;

import View.WelcomeJavaFXView;
import javafx.scene.control.*;
import javafx.stage.Stage;
import Model.*;
import javafx.stage.FileChooser;

import java.io.File;

import View.SignUpJavaFXView;
import javafx.stage.FileChooser.*;


/**
 * Created by kp26842 on 6/29/2016.
 */
public class SignUpController {
    @FXML
    TextField fname;
    @FXML
    TextField lname;
    @FXML
    TextField SSN;
    @FXML
    DatePicker date;
    @FXML
    TextField email;
    @FXML
    Label emptyFieldError;
    @FXML
    Button ClearButton;

    @FXML
    PasswordField pw;
    @FXML
    PasswordField cpw;
    @FXML
    Label pwformatError;
    @FXML
    Label validationError;
    @FXML
    Label emailFormatError;
    @FXML
    Label emailReuseError;

    public void signUp() throws EmailException, PasswordException {
        EmailValidator emV = new EmailValidator();
        PasswordValidator pwV = new PasswordValidator();

        /*Validating email for its required format and letting user use only the unique email address*/
        for (int i = 0; i < UserDB.getUsers().size(); i++) {
            if (email.getText().equals(UserDB.getUsers().get(i).getUserName())) {
                emailReuseError.setVisible(true);
                email.setId("button");
            }
        }
        if (emV.validate(email.getText())) {
            emailFormatError.setVisible(false);
        } else {
            emailFormatError.setVisible(true);
            email.setId("button");
        }
        if (fname.getText() == null && lname.getText() == null && email.getText() == null && SSN.getText() == null && date.getAccessibleText() == null &&
                pw.getText() == null && cpw.getText() == null) {
            emptyFieldError.setVisible(true);
            email.setId("button");


        }


        if (pwV.validate(pw.getText())) {
            if (pw.getText().equals(cpw.getText())) {
                User user = new User(email.getText(), pw.getText());
                UserDB.getUsers().add(user);
                try {
                    UserIO.writeUsers(UserDB.getUsers());
                } catch (IOException e) {


                    System.err.println(UserDB.getUsers());
                    e.printStackTrace();

                }
            } else {
            /*Password and Confirm Password do not match*/
                validationError.setVisible(true);
                /*Stylesheet Identifier #button is used*/
                pw.setId("button");

            }
        } else {
            pwformatError.setVisible(true);
            pw.setId("button");
        }
    }

    public void clearText() {
        ClearButton.setId("button");
        email.clear();
        pw.clear();
        cpw.clear();
        validationError.setVisible(false);
        emailFormatError.setVisible(false);
        pwformatError.setVisible(false);
        emailReuseError.setVisible(false);
        emptyFieldError.setVisible(false);
        pw.setId("clearbutton");
        email.setId("clearbutton");
        ClearButton.setId("clearbutton");

    }

    public void openWelcomePage() throws Exception {

        new WelcomeJavaFXView();
    }

    public void createFileBrowser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Browse picture");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("TextFiles", "*.text"),
                new ExtensionFilter("Image Files", "*.jpg", "*.png"));
        File selectFile = fileChooser.showOpenDialog(SignUpJavaFXView.getSignUpStage());


    }
}
