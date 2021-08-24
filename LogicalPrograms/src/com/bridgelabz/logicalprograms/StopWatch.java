package com.bridgelabz.logicalprograms;

import java.util.*;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		long startTime = 0;
		long stopTime,timeElapsed;	
		while(true) {
			System.out.println("Enter your option 1.start 2.stop");
			userInput = sc.nextInt();
			switch(userInput) {
			case 1:
			{
				startTime = System.currentTimeMillis();
				System.out.println("Start time: "+startTime+" ms");
				break;
			}
			case 2:
			{
				stopTime = System.currentTimeMillis();
				System.out.println("Stop time: "+stopTime+" ms");
				timeElapsed = stopTime - startTime;
				System.out.println("Elapsed time: "+timeElapsed+" ms");
				System.exit(0);
			}
			default:
				System.exit(0);
		}

	}

}
}
