package fr.amu.iut.exercice16;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConvertisseurTemperatures extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox panneauCelsius = new VBox(10);
        VBox panneauFahrenheit = new VBox(10);

        HBox root = new HBox(30, panneauCelsius, panneauFahrenheit);
        root.setPadding(new Insets(20));

        Slider celsiusSlider = new Slider(0, 100, 0);
        celsiusSlider.setOrientation(Orientation.VERTICAL);
        celsiusSlider.setShowTickLabels(true);
        celsiusSlider.setShowTickMarks(true);

        Slider fahrenheitSlider = new Slider(32, 212, 32);
        fahrenheitSlider.setOrientation(Orientation.VERTICAL);
        fahrenheitSlider.setShowTickLabels(true);
        fahrenheitSlider.setShowTickMarks(true);

        TextField celsiusField = new TextField();
        TextField fahrenheitField = new TextField();

        Label celsiusLabel = new Label("°C");
        Label fahrenheitLabel = new Label("°F");

        celsiusLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        fahrenheitLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");

        Label labelCelsiusUnit = new Label("(degrés Celsius)");
        Label labelFahrenheitUnit = new Label("(degrés Fahrenheit)");

        labelCelsiusUnit.setStyle("-fx-font-style: italic;");
        labelFahrenheitUnit.setStyle("-fx-font-style: italic;");

        bindSliderToTextField(celsiusSlider, celsiusField);
        bindSliderToTextField(fahrenheitSlider, fahrenheitField);

        celsiusSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            double celsius = newValue.doubleValue();
            double fahrenheit = FormuleConvertirTemperatures.relationCelsiusFahrenheit(celsius);
            fahrenheitSlider.setValue(fahrenheit);
        });

        fahrenheitSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            double fahrenheit = newValue.doubleValue();
            double celsius = FormuleConvertirTemperatures.relationFahrenheitCelsius(fahrenheit);
            celsiusSlider.setValue(celsius);
        });

        panneauCelsius.getChildren().addAll(celsiusLabel, labelCelsiusUnit, celsiusSlider, celsiusField);
        panneauFahrenheit.getChildren().addAll(fahrenheitLabel, labelFahrenheitUnit, fahrenheitSlider, fahrenheitField);

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Convertisseur de Températures");
        primaryStage.show();
    }

    private void bindSliderToTextField(Slider slider, TextField textField) {
        // Update TextField when Slider changes
        slider.valueProperty().addListener((obs, oldVal, newVal) ->
                textField.setText(String.format("%.2f", newVal.doubleValue()))
        );

        // Update Slider when TextField changes
        textField.textProperty().addListener((obs, oldVal, newVal) -> {
            try {
                slider.setValue(Double.parseDouble(newVal));
            } catch (NumberFormatException e) {
                // Handle the case where the input is not a valid number
                textField.setText(oldVal); // Revert to old value
            }
        });
    }
}
