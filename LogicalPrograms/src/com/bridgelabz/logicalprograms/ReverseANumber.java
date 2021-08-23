package com.bridgelabz.logicalprograms;

public class ReverseANumber {
	public static void Reverse(int numberToReverse) {
		if(numberToReverse < 10) {
			System.out.println(numberToReverse);
			return;
		}
		else {
			System.out.print(numberToReverse % 10);
			Reverse(numberToReverse / 10);
		}
	}
	public static void main(String[] args) {
		int numberToReverse = 984562;
		System.out.println("Reversed number:");
		Reverse(numberToReverse);

	}

}
