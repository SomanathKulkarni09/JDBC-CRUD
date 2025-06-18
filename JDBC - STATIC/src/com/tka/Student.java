package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws Exception  {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		System.out.println("connection ok");
		
		Statement s = c.createStatement();
		
		int result = s.executeUpdate("insert into student(rollNo,name,city,DOB)values(103,'Amit','Akola','2003-02-22')");
		
		
		if (result>0)
			System.out.println("data inserted");
		else
			System.out.println("data is not inserted");
		
		
		c.close();
		
	}

}
