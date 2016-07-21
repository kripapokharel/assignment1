package View;

import java.io.IOException;

import javafx.stage.*;
import javafx.scene.*;
import javafx.fxml.*;
import javafx.scene.control.*;


/**
 * Created by kripa on 7/3/2016.
 */
public class WelcomeJavaFXView {
    public WelcomeJavaFXView() throws IOException {
        Stage welcomeStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        welcomeStage.setTitle("Welcome page");
        welcomeStage.setScene(new Scene(root, 500, 600));
        welcomeStage.show();


    }
}
