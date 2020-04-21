
package com.meghana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ArrayList<Student> Stdlist = new ArrayList<Student>();
		ArrayList<Course> AvailableCourse = new ArrayList<Course>();
		ArrayList<Course> RegisteredCourses = new ArrayList<Course>();

		Course C1 = new Course();
		C1.Course_id = 1;
		C1.Course_name = "Java";
		AvailableCourse.add(C1);

		Course C2 = new Course();
		C2.Course_id = 2;
		C2.Course_name = "Selenium";
		AvailableCourse.add(C2);

		Course C3 = new Course();
		C3.Course_id = 3;
		C3.Course_name = "python";
		AvailableCourse.add(C3);

		int NoOfStudent = readCountOfStudent();

		for (int i = 0; i < NoOfStudent; i++) {
			System.out.println("Enter the details of the student number " + (i + 1));
			Student st = new Student();
			st.readStudentId();
			st.readStudentName();

			Stdlist.add(st);

			System.out.println("Available Courses are:");
			// for (int j = 0; j < AvailableCourse.size(); j++) {
			// Course C = AvailableCourse.get(j);
			// System.out.println("Course id is " + C.Course_id);
			// System.out.println("Course name is " + C.Course_name);

			for (Course c : AvailableCourse) {
				System.out.println("CourseId " + c.Course_id);
				System.out.println("CourseName " + c.Course_name);
			}
			System.out.println("------------------------");

			Course cr = new Course();
			int CountOfCourse = cr.GetRequiredCourseFromUser();

			for (int z = 0; z < CountOfCourse; z++) {
				Course crc = new Course();
				crc.readCourseId();
				crc.readCourseName();
				st.RegisteredCourses.add(crc);
			}

			System.out.println("-------------------------- ");

			detailsOftheStudents(Stdlist);

		}
	}

	public static int readCountOfStudent() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of  students");
		int NoOfStudent = s.nextInt();
		return NoOfStudent;
	}

	public static void detailsOftheStudents(ArrayList<Student> Stdlist) {
		for (int i = 0; i < Stdlist.size(); i++) {
			Student s = Stdlist.get(i);
			System.out.println("Student " + (i + 1) + " details are as below:");
			System.out.println("Student id is " + s.Student_id);
			System.out.println("Student name is " + s.Student_name);
			System.out.println("Student Registerd Courses are:");
			
			
			for (Course C : s.RegisteredCourses) {				
				System.out.println("CourseId " + C.Course_id);
				System.out.println("CourseName " + C.Course_name);
				
			}
			System.out.println("-------------------------- ");

		}
	}
}
