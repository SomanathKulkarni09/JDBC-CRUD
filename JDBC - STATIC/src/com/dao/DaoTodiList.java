package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DaoTodiList {

	public int insertTask() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");

		Statement s = c.createStatement();

		int result = s.executeUpdate(
				"INSERT INTO ToDolist (id ,title,dueDate,status)VALUES(2,'Home Work','2026-06-15','Complete')");

		c.close();
		return result;
	}

	public int updateTask() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");

		Statement s = c.createStatement();

		int result = s.executeUpdate("update ToDoList set title = 'Codeing' where id = 2 ");

		c.close();
		return result;

	}

	public int deletetTask() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");

		Statement s = c.createStatement();

		int result = s.executeUpdate("DELETE from ToDoList where id = 2");

		c.close();

		return result;
	}

	public ResultSet showTask() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");

		Statement s = c.createStatement();

		ResultSet rs = s.executeQuery("Select * from ToDoList");
		
		
		return rs;

	}

}
