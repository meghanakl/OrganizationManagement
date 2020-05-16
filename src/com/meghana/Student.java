
package com.meghana;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Print, TimeDisplay{
	
	public Student() {
		 int count = 0 ;
		   count= count+1;  
		    }
	int Student_id;
	String Student_name;

	public void readStudentId() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter id of the student");
		Student_id = s1.nextInt();
	}

	public void readStudentName() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter name of the student");
		Student_name = s2.nextLine();
	}
   
	public static int readCountOfStudent() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of  students"); 
		int noOfStudent = s.nextInt();
		return noOfStudent;
	}

	public static void DisplayStudentsDetails(ArrayList<Student> Stdlist)
	{
		for (int i = 0; i < Stdlist.size(); i++) {
			Student s = Stdlist.get(i);
			System.out.println("Student " + (i + 1) + " details are as below:");
			System.out.println("Student id is " + s.Student_id);
			System.out.println("Student name is " + s.Student_name);
			System.out.println("Student Registerd Courses are:");

			for (Course crs : s.RegisteredCourses) {
				System.out.println("CourseId " + crs.Course_id);
				System.out.println("CourseName " + crs.Course_name);

			}
		}
	}

	public ArrayList<Course> RegisteredCourses = new ArrayList<Course>();

	public void print(){
		
		System.out.println("This is student class");
	}

	@Override
	public void printTime() {
		// TODO Auto-generated method stub
		System.out.println("this is student method");
	}
	}


