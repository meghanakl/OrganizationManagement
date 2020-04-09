package com.meghana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ArrayList<Student> Stdlist = new ArrayList<Student>();

		int NoOfStudent = readCountOfStudent();
		for (int i = 0; i < NoOfStudent; i++) {
			System.out.println("Enter the details of " + (i + 1) + "th Student");
			Student st = new Student();

			st.readStudentId();
			st.readStudentName();
			Stdlist.add(st);
		}
		detailsOftheStudents(Stdlist);
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
			System.out.println("Student "+(i+1)+ " details are as below:");
			System.out.println("Student id is " + s.Student_id);
			System.out.println("Student name is " + s.Student_name);
			System.out.println("--------------------- ");
		}
	}

}
