package com.qa.temperatureConverterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.temperatureConverter.TemperatureConverter;

public class TemperatureConverterTest {

	private TemperatureConverter temperatureConverter = new TemperatureConverter();

	
	int tempInput1 = 50;

	@Test
	public void convertFahrenheitToCelsiusTest() {
		assertEquals(10, temperatureConverter.convertFahrenheitToCelsius(tempInput1), 0);

	}

	@Test
	public void convertCelsiusToFahrenheitTest() {
		assertEquals(122, temperatureConverter.convertCelsiusToFahrenheit(tempInput1), 0);

	}

	@Test
	public void convertKelvinToCelsiusTest() {
		assertEquals(-223, temperatureConverter.convertKelvinToCelsius(tempInput1), 0);

	}

	@Test
	public void convertCelsiusToKelvinTest() {
		assertEquals(323, temperatureConverter.convertCelsiusToKelvin(tempInput1), 0);

	}

	@Test
	public void convertKelvinToFahrenheitTest() {
		assertEquals(-369, temperatureConverter.convertKelvinToFahrenheit(tempInput1), 0);

	}

	@Test
	public void convertFahrenheitToKelvinTest() {
		assertEquals(283, temperatureConverter.convertFahrenheitToKelvin(tempInput1), 0);

	}

}
