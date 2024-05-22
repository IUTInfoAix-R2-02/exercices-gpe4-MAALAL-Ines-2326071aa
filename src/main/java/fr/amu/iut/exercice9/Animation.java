package fr.amu.iut.exercice9;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        CustomButton customButton = new CustomButton();
        root.setCenter(customButton);
        Scene scene = new Scene(root, 400, 400);

        Duration duration = Duration.millis(1500);
        TranslateTransition transition1 = new TranslateTransition(duration, customButton);
        TranslateTransition transition2 = new TranslateTransition(duration, customButton);
        TranslateTransition transition3 = new TranslateTransition(duration, customButton);
        TranslateTransition transition4 = new TranslateTransition(duration, customButton);

        transition1.setByX(150);
        transition1.setByY(-150);
        transition1.setAutoReverse(true);
        transition1.setCycleCount(2);
        transition2.setByX(150);
        transition2.setByY(150);
        transition2.setAutoReverse(true);
        transition2.setCycleCount(2);
        transition3.setByX(-150);
        transition3.setByY(150);
        transition3.setAutoReverse(true);
        transition3.setCycleCount(2);
        transition4.setByX(-150);
        transition4.setByY(-150);
        transition4.setAutoReverse(true);
        transition4.setCycleCount(2);

        SequentialTransition st = new SequentialTransition(transition1, transition2, transition3, transition4);

        customButton.setOnMousePressed(mouseEvent -> st.play());


        primaryStage.setTitle("Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}