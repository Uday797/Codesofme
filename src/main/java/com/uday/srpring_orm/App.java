package com.uday.srpring_orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uday.srpring_orm.dao.EmployeeDao;
import com.uday.srpring_orm.entities.Employee;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args) throws NumberFormatException, IOException 
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       EmployeeDao dao=(EmployeeDao)context.getBean("employeeDao",EmployeeDao.class);
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
		while(true) {
			System.out.println("-------Select any option---------");
			System.out.println(" Press 1:Add");
			System.out.println(" Press 2:List");
			System.out.println(" Press 3:Get Employee by Id");
			System.out.println(" Press 4:Delete");
			System.out.println(" Press 5:Update");
			System.out.println("----------------------------------");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter Id");
				int Id = Integer.parseInt(br.readLine());
				System.out.println("Enter name");
				String name = br.readLine();
				System.out.println("Enter email");
				String email = br.readLine();
				Employee emp = new Employee(Id, name, email);
				dao.addEmployee(emp);
				System.out.println("Record inserted...");
				break;
			}

			case 2: {
				List<Employee> list = dao.getallEmployees();

				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
				System.out.println("Obtained In List...");
				break;
			}

			case 3: {
				System.out.println("Enter employee ID");
				int Id = Integer.parseInt(br.readLine());

				System.out.println(dao.getEmployeebyId(Id));
				break;

			}
			case 4: {
				System.out.println("Enter Employee Id");
				int Id = Integer.parseInt(br.readLine());
				dao.DeleteEmployee(Id);
				System.out.println("Record deleted...");
				break;

			}
			case 5: {
				System.out.println("Enter Id");
				int Id1 = Integer.parseInt(br.readLine());
				System.out.println("Enter name");
				String name1 = br.readLine();
				System.out.println("Enter email");
				String email1 = br.readLine();
				Employee emp = new Employee(Id1, name1, email1);
				dao.UpdateEmployee(emp);
				System.out.println("Record updated...");
				break;

			}
			}
		}

	}
}