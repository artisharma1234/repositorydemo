package com.accenture.lkm;
import java.lang.*;

public class Employee {
	String empId;
	String empName;
	String salary;
	String age;
	
	public Employee() {
		this.empId=null;
		this.empName=null;
		this.salary=null;
		this.age=null;
		
	}
	
	public Employee(String empId,String empName,String salary,String age) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.age=age;
	}
	
	public boolean validateID(String empId) {
		int x =Integer.parseInt(empId);
		if(x>1001) {
			return true;
		}
		else
			return false;
	}

	public boolean validatesalary(String salary) {
		int x =Integer.parseInt(salary);
		if(x>=25000) {
			return true;
		}
		else
			return false;
	}
	

}

