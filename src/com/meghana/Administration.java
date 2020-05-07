package com.meghana;

public class Administration extends CollegeStaff{
	
	public Administration() {
		 int count = 0 ;
		   count= count+1;  
		  
		
	   }
	
	
	int Administrater_work_timimgs;
	Double Administrater_Salary;
	@Override
	public float getWorkingHours() {
		// TODO Auto-generated method stub
		return 8 ;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("There is print method in Administration method");
	} 

}
   