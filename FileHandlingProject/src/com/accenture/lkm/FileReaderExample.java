package com.accenture.lkm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderExample {

	public static void main(String[] args) throws IOException 
	{		
			BufferedReader reader=new BufferedReader(new FileReader("record.txt"));
			String st;
			ArrayList<Employee> EmpDetails = new ArrayList<Employee>();
			while((st=reader.readLine())!=null)
			{
				String[] str=st.split(",", 0);
				Employee emp=new Employee(str[0],str[1],str[2]);
				EmpDetails.add(emp);
			}
			for(Employee item:EmpDetails)
		System.out.println(item.empId+" "+ item.empName+" "+item.salary);
		
		
	}

}
