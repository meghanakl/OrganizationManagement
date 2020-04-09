package com.meghana;


	
	import java.util.Scanner;
	public class Student {
		int Student_id;
		String Student_name;

		
		public  int readStudentId() {
			Scanner s1 = new Scanner(System.in);
		    System.out.println("Enter id of the student ");
		    Student_id = s1.nextInt();
			return Student_id;
		
		}
		    
		   public  void readStudentName() {
		    Scanner s2 = new Scanner(System.in);
		    System.out.println("Enter name of the student ");
		    Student_name= s2.nextLine();
			}
	}


}
