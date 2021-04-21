package com.uday;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Statement statement = null;
	private Connection conn;

	public EmployeeDaoImpl() throws SQLException {
		conn = ConnectionFactory.getConnection();
		statement = conn.createStatement();
	}

	@Override
	public void insertEmployee(Employee employee) throws SQLException {
		String insert = "insert into employee values (" + employee.getEmpId() + ", '" + employee.getName() + "', '"
				+ employee.getEmail() + "')";
		int count = 0;
		count = statement.executeUpdate(insert);

		if (count > 0) {
			System.out.println("Employee saved");
		} else {
			System.out.println("Not completed");
		}
	}

	@Override
	public void updateEmployee(Employee employee) throws SQLException {
		// write code for update
		String update = "update employee set name='" + employee.getName() + "', email='" + employee.getEmail()
				+ "' where empid=" + employee.getEmpId();
		int count = 0;
		try {
			count = statement.executeUpdate(update);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (count > 0) {
			System.out.println("Employee updated");
		} else {
			System.out.println("Updation incomplete!");
		}
	}

	@Override
	public void deleteEmployee(int id) {
		// write code for delete
		String delete = "delete from employee where id= "+ id;
		int c = 0;
		try {
			c = statement.executeUpdate(delete);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (c > 0) {
			System.out.println("Employee deleted!");
		} else {
			System.out.println("No action taken!");
		}
	}

	@Override
	public Employee getEmployeeById(int id) throws SQLException {
		// write code for employee by id
		Employee employee = null;
		String get = "select * from employee where empId = " + id;
		ResultSet rs = statement.executeQuery(get);
		if (rs.next()) {
			int empId = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			employee = new Employee(empId, name, email);
		}
		return employee;
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		// write code to get all employees
		List<Employee> list = new ArrayList<>();
		String getEmp = "select * from employee";
		ResultSet rs = statement.executeQuery(getEmp);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			Employee employee = new Employee(id, name, email);
			list.add(employee);
		}
		return list;
	}
}