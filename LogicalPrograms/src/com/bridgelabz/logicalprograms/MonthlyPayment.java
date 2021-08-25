package com.bridgelabz.logicalprograms;

public class MonthlyPayment {
	public static void monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12*100);
		double payment = (P*r)/(1-(Math.pow(1+r,-n)));
		System.out.println("The monthly payment is : "+ payment);
	}
	
	public static void main(String[] args) {
		double principal  = Double.parseDouble(args[0]);
		double years  = Double.parseDouble(args[1]);
		double rate  = Double.parseDouble(args[2]);
		monthlyPayment(principal, years, rate);
	}

}
