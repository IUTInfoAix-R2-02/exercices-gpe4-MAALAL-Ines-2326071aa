package fr.amu.iut.exercice16;

public class FormuleConvertirTemperatures {
    public static double relationCelsiusFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }
    public static double relationFahrenheitCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}
