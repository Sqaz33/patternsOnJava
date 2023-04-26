package Main;

import Displays.*;
import Subject.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        float temperature;
        float humidity;
        float pressure;
        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            temperature = scan.nextFloat();
            pressure = scan.nextFloat();
            humidity = scan.nextFloat();
            weatherData.setMeasurements(temperature, pressure, humidity);
        }

    }
}
