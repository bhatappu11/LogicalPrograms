package com.bridgelabz.logicalprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int prevNumber = 0, presNumber = 1,temp;
		int counter = 0;
		int limitOfFibonacci = 10;
		while(counter < limitOfFibonacci) {
			System.out.print(prevNumber+" ");
			temp = prevNumber+presNumber;
			prevNumber = presNumber;
			presNumber = temp;
			counter++;
		}

	}

}
