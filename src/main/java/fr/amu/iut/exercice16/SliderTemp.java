package fr.amu.iut.exercice16;

import javafx.application.Application;
import javafx.stage.Stage;

public class SliderTemp extends Application {

    @Override
    public void start(Stage primaryStage){
        SliderTemp slid = new SliderTemp();
        slid.start(primaryStage);

    }
    public static void main(String[] args){
        launch(args);
    }
}