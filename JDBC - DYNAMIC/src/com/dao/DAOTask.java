package com.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Task;

import java.sql.Connection;

public class DAOTask {

	public Connection dbConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");
		return c;
	}

	public int addTask(Task task) throws Exception {

		Connection cn = dbConnection();

		PreparedStatement ps = cn.prepareStatement("INSERT INTO ToDolist (id ,title,dueDate,status)VALUES(?,?,?,?)");

		ps.setInt(1, task.getId());
		ps.setString(2, task.getTitle());
		ps.setString(3, task.getDueDate());
		ps.setString(4, task.getStatus());

		

		return ps.executeUpdate();

	}

	public int updateTask(Task task) throws Exception {

		Connection cn = dbConnection();
		PreparedStatement ps = cn
				.prepareStatement("UPDATE ToDolist SET  title = ?,dueDate = ?, status = ? WHERE id = ?");

		ps.setString(1, task.getTitle());
		ps.setString(2, task.getDueDate());
		ps.setString(3, task.getStatus());
		ps.setInt(4, task.getId());

		return ps.executeUpdate();
	}

	public int deleteTask(int id) throws Exception {
		Connection cn = dbConnection();
		PreparedStatement ps = cn.prepareStatement("Delete FROM ToDolist where id = ?");
		ps.setInt(1, id);

		return ps.executeUpdate();
	}

	public ResultSet showTask() throws Exception {

		Connection cn = dbConnection();

		PreparedStatement ps = cn.prepareStatement("SELECT * FROM ToDolist");

		return ps.executeQuery();

	}

}
