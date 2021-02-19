package Lesson4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent r = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Welcome to chat!");
        primaryStage.setScene(new Scene(r, 740, 480));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
