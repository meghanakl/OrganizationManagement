package com.meghana;

import java.util.Scanner;

public class Course {
	public Course() {
		 int count = 0 ;
		   count= count+1;  
		  
		
	   }
 int Course_id;
String Course_name;

private  int readCourseId() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Course_Id");
  return Course_id  = s.nextInt();
	
	}

public void readCourseName() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Course_name");
	Course_name = s.nextLine();
}
public static int GetRequiredCourseFromUser() {
	Scanner s = new Scanner(System.in);
	System.out.println("Select the Number of Course ");
	int c = s.nextInt();
	return c;
}

protected int  setId() {
return this.readCourseId();  
	
}

}

