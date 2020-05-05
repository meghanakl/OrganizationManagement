package com.meghana;

public class Helper extends CollegeStaff
{
	int No_Of_leaves;
	double Helper_Salary;
	 public Helper(int id,String name,Double salary) {
		 Staff_id =id;
		 Staff_Name=name;
		 Staff_Salary=salary;
		   
		 }
	 public  Helper() {};
	@Override
	public float getWorkingHours() {
		// TODO Auto-generated method stub
		return 5;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("There is print method in helper method");
		
	}
	
}
 