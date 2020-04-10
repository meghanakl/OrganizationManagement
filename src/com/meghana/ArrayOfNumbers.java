package com.meghana;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfNumbers {

	public static void main(String[] args) {

		ArrayList<Number> numbers = new ArrayList<Number>();
		int NoOfValues = readCountOfValuesFromUser();
		
		
		for (int i = 0; i < NoOfValues; i++) {
			
		}

		int b = readIntergerKey();

		if (numbers.contains(b)) {
			System.out.println("The number " + b + " is present");
		} else {
			System.out.println("The number " + b + " is not present");
		}

	}

	public static int readCountOfValuesFromUser() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of  values");
		int Count = s.nextInt();
		return Count;
	}

	public static void GiveCountOfValuesFromUser(ArrayList<Number> numbers) {
		for(int i=0;i<NoOfValues;i++) {
			
		}

	}

	public static int readIntergerKey() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = s.nextInt();
		return a;
	}
}