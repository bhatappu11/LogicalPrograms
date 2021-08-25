package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class TemperatureConversion {
	
	public static void conversionToFahrenheit(double temperature) {
			double fahrenheit = (temperature*9/5)+32;
			System.out.println("Temperature in fahrenheit : "+fahrenheit);
	}
	private static void conversionToCelsius(double temperature) {
			double celsius = (((temperature -32)*5)/9);
			System.out.println("Temperature in celsius : "+celsius);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option: 1.Celsius to Fahrenheit\t2.Fahrenheit to Celsius");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Enter the temperature in celsius : ");
			double celsius = sc.nextDouble();
			conversionToFahrenheit(celsius);
			break;
		case 2:
			System.out.println("Enter the temperature in fahrenheit : ");
			double fahrenheit = sc.nextDouble();
			conversionToCelsius(fahrenheit);
			break;
		default :
			System.out.println("Invalid Option");
		}
		sc.close();

	}

}
