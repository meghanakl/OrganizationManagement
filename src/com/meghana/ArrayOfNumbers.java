package com.meghana;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfNumbers {

	public static void main(String[] args) {

		ArrayList<Number> NUM = new ArrayList<Number>();
		int values = GiveArrayOfNumbers();
		NUM.add(values);
	}

	public static int GiveArrayOfNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of  students");
		int Array = s.nextInt();
		return Array;
	}
}