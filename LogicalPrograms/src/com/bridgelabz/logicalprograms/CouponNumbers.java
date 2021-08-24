package com.bridgelabz.logicalprograms;

import java.util.*;

public class CouponNumbers {	
	
	public static int generateRandomNumber(int numberOfCoupons) {
		return (int) Math.floor(Math.random() * numberOfCoupons);
	}
	
	public static void generateDistinctCoupons(int numberOfCoupons) {
		HashSet<Integer> generatedCouponNumbers = new HashSet<>();
		int totalRandomNumbers = 0;
		while(generatedCouponNumbers.size() != numberOfCoupons) {
			int randomNumber = generateRandomNumber(numberOfCoupons);
			totalRandomNumbers++;
			generatedCouponNumbers.add(randomNumber);
			
		}
		System.out.println("The total number of random numbers generated "+totalRandomNumbers);
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int numberOfCoupons;
		System.out.println("Enter the number of distinct coupon numbers needed");
		numberOfCoupons = sc.nextInt();
		sc.close();
		generateDistinctCoupons(numberOfCoupons);

	}

}
