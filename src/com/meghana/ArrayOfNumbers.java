package com.meghana;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfNumbers { 

	public static void main(String[] args) {

		ArrayList<Number> numbers = new ArrayList<Number>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
				
	int a=readIntergerKey();
	if(numbers.contains(a))
	{
	  System.out.println("The number "+a+ " is present");	
}
	else
	{
		System.out.println("The number "+a+ " is not present");
	}
	
	}

	public static int readIntergerKey() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int Array = s.nextInt();
		return Array;
	}
}