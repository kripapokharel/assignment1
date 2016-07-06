package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Model.UserIO;

import java.io.IOException;

import Model.*;

import java.util.*;

public class LogInJavaFXView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }

    public static void loadUserDB() {

        try {
            UserDB.setUsers((ArrayList<User>) UserIO.readUsers());

        } catch (IOException e) {
            System.out.println("Fail to open");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception");
        }
    }

    public static void main(String[] args) {
        loadUserDB();
        launch(args);

    }
}
