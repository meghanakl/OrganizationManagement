
package com.meghana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		ArrayList<Student> stdlist = new ArrayList<Student>();
		ArrayList<Course> availableCourse = new ArrayList<Course>();
		
		Course c1 = new Course();
		c1.Course_id = 1;
		c1.Course_name = "Java";
		availableCourse.add(c1);

		Course c2 = new Course();
		c2.Course_id = 2;
		c2.Course_name = "Selenium";
		availableCourse.add(c2);

		Course c3 = new Course();
		c3.Course_id = 3;
		c3.Course_name = "python";
		availableCourse.add(c3);

		int noOfStudent = readCountOfStudent();

		for (int i = 0; i < noOfStudent; i++) 
		{
			System.out.println("Enter the details of the student number" + (i + 1));
			Student st = new Student();
			st.readStudentId();
			st.readStudentName();

			stdlist.add(st);

			System.out.println("Available Courses are:");
			// for (int j = 0; j < AvailableCourse.size(); j++) {
			// Course C = AvailableCourse.get(j);
			// System.out.println("Course id is " + C.Course_id);
			// System.out.println("Course name is " + C.Course_name);

			for (Course c : availableCourse) 
			{
				System.out.println("CourseId " + c.Course_id);
				System.out.println("CourseName " + c.Course_name);
			}
			System.out.println("------------------------");

			Course cr = new Course();
			int CountOfCourse = cr.GetRequiredCourseFromUser();

			for (int z = 0; z < CountOfCourse; z++) 
			{
				Course cs = new Course();
				int courseId = cs.readCourseId();

				for (Course c : availableCourse) 
				{
					if (c.Course_id == courseId) 
					{
						st.RegisteredCourses.add(c);
					}
				}
			}
			
			DisplayStudentsDetails(stdlist);
		}
	}

	public static int readCountOfStudent() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of  students");
		int NoOfStudent = s.nextInt();
		return NoOfStudent;
	}

	public static void DisplayStudentsDetails(ArrayList<Student> Stdlist) 
	{
		for (int i = 0; i < Stdlist.size(); i++) 
		{
			Student s = Stdlist.get(i);
			System.out.println("Student " + (i + 1) + " details are as below: ");
			System.out.println("Student id is " + s.Student_id);
			System.out.println("Student name is " + s.Student_name);
			System.out.println("Student Registerd Courses are:");

			for (Course crs : s.RegisteredCourses) 
			{
				System.out.println("CourseId " + crs.Course_id);
				System.out.println("CourseName " + crs.Course_name);

			}
		}
	}
	
}
