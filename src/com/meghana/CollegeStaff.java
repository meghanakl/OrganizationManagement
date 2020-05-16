package com.meghana;

import java.util.Scanner;

public abstract  class CollegeStaff implements Print {

	int Staff_id;
	String Staff_Name;
	String Staff_Role;
	int Staff_ExperienceInYear;
	String Staff_Department;
	String Staff_Address;                      
	double Staff_Salary;
	

	public double IncrementSalary()
	{
		 Staff_Salary=(Staff_Salary)+(Staff_Salary)*(0.1);
		 return Staff_Salary;
	}
	
	public abstract float getWorkingHours();
		
	
  
}    


  
   
