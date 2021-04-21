package com.uday;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
		System.out.println("Please select any one options");
		System.out.println("******");
		System.out.println("Press 1: Insert");
		System.out.println("Press 2: Update");
		System.out.println("Press 3: Delete");
		System.out.println("Press 4: Get");
		System.out.println("******");

		int option = sc.nextInt();
		switch (option) {
		case 1: {
			insert();
			break;
		}
		case 2: {
			update();
			break;
		}
		case 3: {
			delete();
			break;
		}
		case 4: {
			get();
			break;
		}
		default: {
			System.out.println("Incorrect options");
		}
		}

		

		
		
	}

	private static void insert() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EmpId: ");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name: ");
		String name = sc.next();
		System.out.print("Enter Employee Email: ");
		String email = sc.next();

		Employee employee = new Employee(id, name, email);
		EmployeeDao dao1 = EmployeeDaoFactory.getEmployeeDao();
		dao1.insertEmployee(employee);

	}

	private static void update() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EmpId: ");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name: ");
		String name = sc.next();
		System.out.print("Enter Employee Email: ");
		String email = sc.next();

		Employee employee = new Employee(id, name, email);
		EmployeeDao dao1 = EmployeeDaoFactory.getEmployeeDao();
		dao1.insertEmployee(employee);
	}

	private static void delete() throws SQLException {
		EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id to delete record");
		int id = sc.nextInt();
		dao.deleteEmployee(id);
	}

	private static void get() throws SQLException {

		EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
		List<Employee> list = dao.getEmployees();
		for (Employee emp : list) {
			System.out.println(emp.toString());
		}
	}
}