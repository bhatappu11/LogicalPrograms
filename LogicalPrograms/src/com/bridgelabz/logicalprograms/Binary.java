package com.bridgelabz.logicalprograms;

import java.util.*;
public class Binary {
	public static int swapNibbles(int number){
		return ((number & 0x0F) << 4 | ((number & 0xF0) >> 4));
	}
	public static boolean PowerOfTwo(int swappedNumber) {
		if (swappedNumber == 0)
            return false;
         
        while (swappedNumber != 1)
        {
            if (swappedNumber % 2 != 0)
                return false;
            swappedNumber = swappedNumber / 2;
        }
        return true;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int swappedNumber = swapNibbles(number);
		System.out.println("After swapping nibbles the new number is : "+ swappedNumber);
		boolean isPowerOfTwo = PowerOfTwo(swappedNumber);
		if(isPowerOfTwo == true)
			System.out.println("New number is power of 2");
		else
			System.out.println("New number is NOT power of 2");
		sc.close();

	}

}
