package org.example.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureHelper {

    public static double fahrenheitToCelsius(double fahrenheit) {
        BigDecimal celsius = BigDecimal.valueOf((fahrenheit - 32) * 5.0/9.0);
        double celsiusRounded = celsius.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return celsiusRounded;
    }

    public static double fahrenheitToKelvin(int fahrenheit) {
        BigDecimal celsius = BigDecimal.valueOf((fahrenheit - 32) * 5.0/9.0 + 273.15);
        double celsiusRounded = celsius.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return celsiusRounded;
    }

    public static double celsiusToFahrenheit(int celsius) {
        BigDecimal fahrenheit = BigDecimal.valueOf((celsius * 9.0/5.0) + 32);
        double fahrenheitRounded = fahrenheit.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return fahrenheitRounded;
    }

    public static double celsiusToKelvin(double celsius) {
        BigDecimal kelvin = BigDecimal.valueOf(celsius + 273.15);
        double kelvinRounded = kelvin.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return kelvinRounded;
    }

    public static double kelvinToFahrenheit(int kelvin) {
        BigDecimal fahrenheit = BigDecimal.valueOf((kelvin - 273.15) * 9.0 / 5.0 + 32);
        double fahrenheitRounded = fahrenheit.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return fahrenheitRounded;
    }

    public static double kelvinToCelsius(int kelvin) {
        BigDecimal celsius = BigDecimal.valueOf(kelvin - 273.15);
        double celsiusRounded = celsius.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return celsiusRounded;
    }
}
