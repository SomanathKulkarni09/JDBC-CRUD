package com.service;

import java.sql.ResultSet;
import com.dao.DAOTask;
import com.model.Task;

public class ServiceTask {

	DAOTask dt = new DAOTask();

	// Add Task
	public void addTask(Task task) throws Exception {
		int result = dt.addTask(task);
		if (result > 0) {
			System.out.println("Task Added");
		} else {
			System.out.println("Something Went Wrong");
		}
	}

	// Update Task
	public void updateTask(Task task) throws Exception {
		int result = dt.updateTask(task);
		if (result > 0) {
			System.out.println("Task Updated");
		} else {
			System.out.println("Something Went Wrong");
		}
	}

	// Delete Task
	public void deleteTask(int id) throws Exception {
		int result = dt.deleteTask(id);
		if (result > 0) {
			System.out.println("Task Deleted");
		} else {
			System.out.println("Something Went Wrong");
		}
	}

	// Show all tasks
	public void showTasks() throws Exception {
		ResultSet rs = dt.showTask();
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " : " + rs.getString("title") + " : " + rs.getString("dueDate") + " : "
					+ rs.getString("status"));
		}
		System.out.println();
	}
}
