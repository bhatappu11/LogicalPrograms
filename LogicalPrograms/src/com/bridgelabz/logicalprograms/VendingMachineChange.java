package com.bridgelabz.logicalprograms;

import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachineChange {
	private static ArrayList<Integer> notes = new ArrayList<Integer>();
	private static int [] availableNotes = {1000,500,100,50,10,5,2,1};
	private static void getMinimumNotes(int amount, int pointer)
	{
		if(amount == 0) return;
		if(amount - availableNotes[pointer] >= 0)
		{
			notes.add(availableNotes[pointer]);
			amount -= availableNotes[pointer];
		}
		else
		{
			++pointer;
		}
		getMinimumNotes(amount,pointer);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Change to be returned");
		int amount = sc.nextInt();
		getMinimumNotes(amount,0);
		System.out.println("the minimum notes required to be returned : "+ notes.size());
		System.out.println("the notes are : "+notes);
		sc.close();


	}

}
