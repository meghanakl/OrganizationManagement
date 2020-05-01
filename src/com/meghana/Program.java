
package com.meghana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		TimeDisplay d = new Student();
		d.printTime();
		Print p = new Student();
		Student s = new Student();

		display(p);

		// p.print();
		Teacher t = new Teacher();
		CollegeStaff y = new Teacher();
		Print r = new Teacher();
		display(r);

		t.PrintTeacherAge();
		y.IncrementSalary();
		Helper e = new Helper();
		e.IncrementSalary();

		ArrayList<CollegeStaff> ClgStf = new ArrayList<CollegeStaff>();
		CollegeStaff t1 = new Teacher();
		t1.Staff_id = 1;
		t1.Staff_Name = "Megha";
		t1.Staff_Salary = 1000;
		ClgStf.add(t1);

		CollegeStaff t2 = new Teacher();
		t2.Staff_id = 3;
		t2.Staff_Name = "Geetha";
		t2.Staff_Salary = 9000;
		ClgStf.add(t2);

		CollegeStaff h1 = new Helper();
		h1.Staff_id = 4;
		h1.Staff_Name = "Raja";
		h1.Staff_Salary = 8000;
		ClgStf.add(h1);

		CollegeStaff h2 = new Helper();
		h2.Staff_id = 5;
		h2.Staff_Name = "Baju";
		h2.Staff_Salary = 7000;
		ClgStf.add(h2);

		CollegeStaff a1 = new Administration();
		a1.Staff_id = 8;
		a1.Staff_Name = "Faru";
		a1.Staff_Salary = 2000;
		ClgStf.add(a1);

		CollegeStaff a2 = new Administration();
		a2.Staff_id = 9;
		a2.Staff_Name = "Hari";
		a2.Staff_Salary = 5000;
		ClgStf.add(a2);

		for (CollegeStaff C : ClgStf) {
			C.IncrementSalary();
			System.out.println("StaffId " + C.Staff_id);
			System.out.println("StaffName " + C.Staff_Name);
			System.out.println("StaffSalary" + C.Staff_Salary);
			System.out.println("--------------------------");
		}
	}

	public static void display(Print pr) {
		pr.print();
		
		
	}

	// ArrayList<Student> stdlist = new ArrayList<Student>();
	// ArrayList<Course> availableCourse = new ArrayList<Course>();

	// Course c1 = new Course();
	// c1.Course_id = 1;
	// c1.Course_name = "Java";
	// availableCourse.add(c1);

	// Course c2 = new Course();
	// c2.Course_id = 2;
	// c2.Course_name = "Selenium";
	// availableCourse.add(c2);

	// Course c3 = new Course();
	// c3.Course_id = 3;
	// c3.Course_name = "python";
	// availableCourse.add(c3);

	// int noOfStudent = Student.readCountOfStudent();

	// for (int i = 0; i < noOfStudent; i++)
	// {
	// System.out.println("Enter the details of the student number" + (i + 1));
	// Student st = new Student();
	// st.readStudentId();
	// st.readStudentName();

	// stdlist.add(st	);

	// System.out.println("Available Courses are:");
	// for (int j = 0; j < AvailableCourse.size(); j++) {
	// Course C = AvailableCourse.get(j);
	// System.out.println("Course id is " + C.Course_id);
	// System.out.println("Course name is " + C.Course_name);

	// for (Course c : availableCourse)
	// {
	// System.out.println("CourseId " + c.Course_id);
	// System.out.println("CourseName " + c.Course_name);
	// }
	// System.out.println("--------------------------");

	// Course cr = new Course();
	// int CountOfCourse = cr.GetRequiredCourseFromUser();

	// for (int z = 0; z < CountOfCourse; z++)
	// {
	// Course cs = new Course();
	// int courseId = cs.readCourseId();

	// for (Course c : availableCourse)
	// {
	// if (c.Course_id == courseId)
	// {
	// st.RegisteredCourses.add(c);
	// }
	// }
	// }

	// Student.DisplayStudentsDetails(stdlist);
	// }
	// }
}
