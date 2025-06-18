package com.model;

public class Task {
	private int id;
	private String title;
	private String dueDate;
	private String status;

	// Getters and Setters
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public String getDueDate() { return dueDate; }
	public void setDueDate(String dueDate) { this.dueDate = dueDate; }

	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }
}
