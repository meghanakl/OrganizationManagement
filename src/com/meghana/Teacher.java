package com.meghana; 

public class Teacher extends CollegeStaff implements TimeDisplay{
	String Teaching_Subject;
	int Teaching_hours;
	
   public Teacher(int id,String name,Double salary) {
	 int count = 0 ;
	   count= count+1;  
	   Staff_id =id;
	 Staff_Name=name;
	 Staff_Salary=salary;
	
   }
	  
	{
	super.IncrementSalary();
	}
	public double IncrementSalary()
	{
		 Staff_Salary=(Staff_Salary)+(1000);
		 return Staff_Salary;
	}
	@Override
	public float getWorkingHours() {
		// TODO Auto-generated method stub
		return 7;
	}
	@Override
	public void print() {
		System.out.println("There is print method in teacher method");
		
	}
	@Override
	public void printTime() {
		
		// TODO Auto-generated method stub
	System.out.println("Current time is "+System.currentTimeMillis());	
	}
	
	public void PrintTeacherAge(){
		System.out.println("teacher age is 25");
		
	}
	
	
	
		
}

 