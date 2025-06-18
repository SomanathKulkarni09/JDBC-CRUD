package com.controller;



import java.util.Scanner;

import com.model.Task;
import com.service.ServiceTask;

public class ControllerTask {
	
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		Task task = new Task();
		ServiceTask service = new ServiceTask();

		while (true) {
			System.out.println("------CRUD MENU-------");
			System.out.println("1. Insert Task \n2. Update Task\n3. Delete Task \n4. Show Tasks\n0. exit");
			System.out.println("----------------------");
			
			
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			
			

			switch (ch) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("-------Enter Task--------");

				System.out.println("Enter TaskID");
				task.setId(sc.nextInt());
				sc.nextLine();

				System.out.println("Enter Task title ");
				task.setTitle(sc.nextLine());

				System.out.println("Enter Due Date");
				task.setDueDate(sc.nextLine());

				System.out.println("what is current status");
				task.setStatus(sc.nextLine());

				service.addTask(task);
				break;
			case 2:
				System.out.println("Enter ID of Task to update Task");
				task.setId(sc.nextInt());
				sc.nextLine();

				System.out.println("Enter Task title to update ");
				task.setTitle(sc.nextLine());

				System.out.println("Enter Due Date to update");
				task.setDueDate(sc.nextLine());

				System.out.println("what is current status to update");
				task.setStatus(sc.nextLine());

				service.updateTask(task);
				break;
			case 3:
				System.out.println("Enter ID to delete Task");
				int id = sc.nextInt();

				service.deleteTask(id);
				break;
			case 4:
				service.showTasks();
				break;
			default:
				System.out.println("Invalid Input");
			}
		}

	}

}
