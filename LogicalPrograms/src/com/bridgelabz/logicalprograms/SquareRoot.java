package com.bridgelabz.logicalprograms;

import java.util.*;
public class SquareRoot {
	public static final double EPSILON = Math.pow(10, -15);
	public static void sqrt(int c) {
		double t = c;
		while(true) {
			t = 0.5*(t + (c / t));
			if(Math.abs(t-(c/t)) < EPSILON*t) {
				break;
			}
		}
		System.out.println("SquareRoot is : "+t);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int c = sc.nextInt();
		sqrt(c);
		sc.close();
	}

}
