package com.qa.temperatureConverter;

public class TemperatureConverter {
	
	
	public float convertFahrenheitToCelsius(int fahrenheit) {
		return ((fahrenheit - 32) * 5/9);
	}

	public float convertCelsiusToFahrenheit(int celsius) {
		return (celsius * 9/5) + 32;
		
	}

	public float convertKelvinToCelsius(int kelvin) {
		return (kelvin - 273);
	}

	public float convertCelsiusToKelvin(int celsius) {
		return (celsius + 273);
	}

	public float convertKelvinToFahrenheit(int kelvin) {
		return ((kelvin - 273) * 9/5) + 32;
	}

	public float convertFahrenheitToKelvin(int fahrenheit) {
		return ((fahrenheit - 32) * 5/9) + 273;
	}

}
