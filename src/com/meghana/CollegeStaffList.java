package com.meghana;

import java.util.ArrayList;

public class CollegeStaffList {
	
	ArrayList<CollegeStaff> StaffList; 
	
	
   public CollegeStaffList() {  

	StaffList = new ArrayList<CollegeStaff>() ;
	StaffList.add(new Teacher(1,"om",200.0));
	StaffList.add(new Teacher(2,"gavi",300.0));
	
	
	
	CollegeStaff h1 = new Helper();
	h1.Staff_id = 4;
	h1.Staff_Name = "Raja";
	h1.Staff_Salary = 8000;
	StaffList.add(h1);

	CollegeStaff h2 = new Helper();
	h2.Staff_id = 5;
	h2.Staff_Name = "Baju";
	h2.Staff_Salary = 7000;
	StaffList.add(h2);

	CollegeStaff a1 = new Administration();
	a1.Staff_id = 8;
	a1.Staff_Name = "Faru";
	a1.Staff_Salary = 2000;
	StaffList.add(a1);

	CollegeStaff a2 = new Administration();
	a2.Staff_id = 9;
	a2.Staff_Name = "Hari";
	a2.Staff_Salary = 5000;
	StaffList.add(a2);

	
}
	

public CollegeStaff getBestStaff() {
	return new Teacher(1,"navya",900.0);
}


	
}

