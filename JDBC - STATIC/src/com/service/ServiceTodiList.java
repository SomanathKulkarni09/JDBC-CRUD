package com.service;


import java.sql.ResultSet;


import com.dao.DaoTodiList;

public class ServiceTodiList {

	public void insertTask() throws Exception {

		DaoTodiList dt = new DaoTodiList();

		int result = dt.insertTask();
		if (result > 0)
			System.out.println("Task inserted");
		else
			System.out.println("Task is not inserted");

	}

	public void  updateTask() throws Exception {
		DaoTodiList dt = new DaoTodiList();
		int result =dt.updateTask();
		if (result>0)
			System.out.println("Task Updated");
		else
			System.out.println("Task is not Updates");
		

	}

	public void deletetTask() throws Exception  {
		DaoTodiList dt = new DaoTodiList();
		int result =dt.deletetTask();
		if (result>0)
			System.out.println("Task Deleted");
		else
			System.out.println("Task is not Deleted");
		

	}

	public void  ShowTask() throws Exception {
		DaoTodiList dt=new DaoTodiList();
		ResultSet rs =dt.showTask();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"     "+rs.getString(3)+"    "+rs.getString(4));
		}

	}

}
