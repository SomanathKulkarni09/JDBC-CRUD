package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetch_data_from_sql {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		
		Statement s = c.createStatement();
		
		ResultSet rs=  s.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"    "+ rs.getString(2)+"     "+rs.getString(3));
		}
		
		
		c.close();
	}

}
