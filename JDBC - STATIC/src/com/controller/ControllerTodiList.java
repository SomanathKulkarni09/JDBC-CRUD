package com.controller;

import com.service.ServiceTodiList;

public class ControllerTodiList {
	
	
	public static void main(String[] args) throws Exception {
		ServiceTodiList st =new ServiceTodiList();
		
		st.insertTask();
		st.updateTask();
		st.deletetTask();
		st.ShowTask();
		
	}

}
