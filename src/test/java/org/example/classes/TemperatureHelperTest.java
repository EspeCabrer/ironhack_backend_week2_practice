package org.example.classes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureHelperTest {

    //- FahrenheitToCelsius
    @Test
    @DisplayName("Convert Fahrenheit temp to Celsius, works ok")
    public void fahrenheitToCelsius_ConvertFahrenheitToCelsius_WorksOk() {

        assertEquals(0, TemperatureHelper.fahrenheitToCelsius(32));
        assertEquals(-3.88, TemperatureHelper.fahrenheitToCelsius(25));
    }

    //- FahrenheitToKelvin
    @Test
    @DisplayName("Convert Fahrenheit temp to Kelvin, works ok")
    public void fahrenheitToKelvin_ConvertFahrenheitToKelvin_WorksOk() {
        assertEquals(258.15, TemperatureHelper.fahrenheitToKelvin(5));
        assertEquals(273.15, TemperatureHelper.fahrenheitToKelvin(32));
    }
    //- CelsiusToFahrenheit
    @Test
    @DisplayName("Convert Celsius temp to Fahrenheit, works ok")
    public void celsiusToFahrenheit_ConvertCelsiusToFahrenheit_WorksOk() {
        assertEquals(89.6, TemperatureHelper.celsiusToFahrenheit(32));
        assertEquals(210.2, TemperatureHelper.celsiusToFahrenheit(99));
    }

    //- CelsiusToKelvin
    @Test
    @DisplayName("Convert Celsius temp to Kelvin, works ok")
    public void celsiusToKelvin_ConvertCelsiusToKelvin_WorksOk() {
        assertEquals(278.15, TemperatureHelper.celsiusToKelvin(5));
        assertEquals(254.15, TemperatureHelper.celsiusToKelvin(-19));
    }
    //- KelvinToFahrenheit
    @Test
    @DisplayName("Convert Kelvin temp to Fahrenheit, works ok")
    public void kelvinToFahrenheit_ConvertKelvinToFahrenheit_WorksOk() {
        assertEquals(-279.67, TemperatureHelper.kelvinToFahrenheit(100));
        assertEquals(80.33, TemperatureHelper.kelvinToFahrenheit(300));
    }
    //- KelvinToCelsius
    @Test
    @DisplayName("Convert Kelvin temp to Celsius, works ok")
    public void kelvinToCelsius_ConvertKelvinToCelsius_WorksOk() {
        assertEquals(-173.15, TemperatureHelper.kelvinToCelsius(100));
        assertEquals(26.85, TemperatureHelper.kelvinToCelsius(300));
    }





}
