package sampleJava2;

public class TemperatureCalculator {
	double celsius, fahrenheit;
	
	public double celsiusToFahrenheit() {
		double temperatureFahrenheit = (celsius * 1.8)+ 32;
		return temperatureFahrenheit;
	}
	public double fahrenheitToCelsius() {
		double temperatureCelsius = ((fahrenheit -32)*5) / 9 ;
		return temperatureCelsius;
	}
	
}
