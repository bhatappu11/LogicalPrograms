package com.bridgelabz.logicalprograms;

public class PerfectNumber {

	public static void main(String[] args) {
		int numberToCheck = 496;
		int sumOfDivisors = 0;
		for (int index = 1; index < numberToCheck; index++) {
			if(numberToCheck % index == 0) {
				sumOfDivisors = sumOfDivisors + index;
			}
		}
		if(sumOfDivisors == numberToCheck)
			System.out.println("Given number is a perfect number");
		else
			System.out.println("Given number is NOT a perfect number");

	}

}
