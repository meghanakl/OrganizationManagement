package com.meghana;

public class Teacher extends CollegeStaff {
	String Teaching_Subject;
	int Teaching_hours;
	
	{
	super.IncrementSalary();
	}
	public double IncrementSalary()
	{
		 Staff_Salary=(Staff_Salary)+(1000);
		 return Staff_Salary;
	}
	@Override
	public int getworkingHours() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	
	
	
	
		
}

 