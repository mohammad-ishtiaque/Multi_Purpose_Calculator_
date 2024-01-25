package sampleJava2;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub..
		GeneralCalcuator generalObj = new GeneralCalcuator();
		GeomatryCalculator geomatryObj = new GeomatryCalculator();
		TrigonomatryCalculator trygonomatryObj = new TrigonomatryCalculator();
		TemperatureCalculator temperatureObj = new TemperatureCalculator();
		
		
		System.out.println("Please Choose Your Calculator: \n 1.General Calculator \n 2.Geomatry Calculator \n 3.Temperature Calculator \n 4.Trygonomatry Calculator");
		
		Scanner input = new Scanner(System.in);
		int chooseingNumber = input.nextInt();
		if(chooseingNumber == 1) {
			System.out.println("Please Choose Operation Your Want: \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
			int chooseingOperation = input.nextInt();
			if(chooseingOperation == 1) {
				System.out.println("Enter the two number: " );
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				generalObj.a = num1;
				generalObj.b = num2;
				int result = generalObj.addition();
				System.out.println("The result is: " + result);
				
			}else if(chooseingOperation == 2) {
				System.out.println("Enter the two number: " );
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				generalObj.a = num1;
				generalObj.b = num2;
				int result = generalObj.substract();
				System.out.println("The result is: " + result);
			}else if(chooseingOperation == 3) {
				System.out.println("Enter the two number: " );
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				generalObj.a = num1;
				generalObj.b = num2;
				int result = generalObj.multiplication();
				System.out.println("The result is: " + result);
			}else if(chooseingOperation == 4) {
				System.out.println("Enter the two number: " );
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				generalObj.a = num1;
				generalObj.b = num2;
				double result = generalObj.division();
				System.out.println("The result is: " + result);
			}
			
		}else if(chooseingNumber == 2) {
			System.out.println("Please Choose Operation Your Want: \n 1.Area of triangle \n 2.Area of rectangle \n 3.Area of circle |n 4.Area of square ");

			int chooseingOperation = input.nextInt();
			if(chooseingOperation == 1) {
				System.out.println("Please enter the width: ");
				double num1 = input.nextDouble();
				System.out.println("Please enter the height: ");
				double num2 = input.nextDouble();
				double area = geomatryObj.triangle(num1, num2);
				System.out.println("Area of the triangle is: " +area);
			}else if(chooseingOperation == 2) {
				System.out.println("Please enter the length: ");
				double num1 = input.nextDouble();
				System.out.println("Please enter the width: ");
				double num2 = input.nextDouble();
				double area = geomatryObj.rectangle(num1, num2);
				System.out.println("Area of the rectangle is: " +area);
			}else if(chooseingOperation == 3) {
				System.out.println("Please enter the redius: ");
				double num1 = input.nextDouble();
				double area = geomatryObj.circle(num1);
				System.out.println("Area of the circle is: " +area);
			}else if(chooseingOperation == 4) {
				System.out.println("Please enter the length: ");
				double num1 = input.nextDouble();
				double area = geomatryObj.square(num1);
				System.out.println("Area of the square is: " +area);
			}
		}else if(chooseingNumber == 3) {
			System.out.println("Please Choose Operation Your Want: \n 1.fahrenheit to celsius \n 2.celsius to fahrenheit ");
			int chooseingOperation = input.nextInt();
			if(chooseingOperation == 1) {
				System.out.println("Please enter the temperature in fahrenheit.");
				double temperature = input.nextDouble();
				temperatureObj.fahrenheit = temperature;
				double result = temperatureObj.fahrenheitToCelsius();
				System.out.println("the temperature in celsius.:" +result);
			}else {
				System.out.println("Please enter the temperature in celsius.");
				double temperature = input.nextDouble();
				temperatureObj.celsius  = temperature;
				double result = temperatureObj.celsiusToFahrenheit();
				System.out.println("the temperature in fahrenheit.:" +result);
			}
		}else if(chooseingNumber == 4) {
			System.out.println("Coming Soon!");
		}

	
//		System.out.println("Area of the Tringle is: " + area);
//		Scanner scan = new Scanner(System.in);
	}

}
