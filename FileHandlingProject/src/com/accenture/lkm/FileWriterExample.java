package com.accenture.lkm;



import java.io.BufferedWriter;;

public class FileWriterExample{
	public static void main(String[] args) throws IOException 
	{
	BufferedWriter writer=new BufferedWriter("record.txt", true);
	Employee e1=new Employee("1001","Amit","45000");
	writer.write(e1);
	writer.flush();
	System.out.println("End of program");
	}
}
