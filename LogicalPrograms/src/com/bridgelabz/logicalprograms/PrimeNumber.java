package com.bridgelabz.logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int numberToCheck = 6;
		boolean isPrime = false;
		if(numberToCheck <= 1)
			isPrime = false;
		else if(numberToCheck == 2)
			isPrime = true;
		else if(numberToCheck % 2 == 0)
			isPrime = false;
		else {
		for(int index=3; index <= Math.sqrt(numberToCheck); index += 2) {
			if(numberToCheck % index == 0)
				isPrime = false;
			}
		isPrime = true;
		}
		if(isPrime == true)
			System.out.println("It is a prime number");
		else
			System.out.println("It is NOT a prime number");
	}
}
