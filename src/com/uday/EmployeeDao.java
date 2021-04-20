package com.uday;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
	void insertEmployee(Employee employee) throws SQLException;

	void updateEmployee(Employee employee) throws SQLException;

	void deleteEmployee(int id) throws SQLException;

	Employee getEmployeeById(int empId) throws SQLException;

	List<Employee> getEmployees() throws SQLException;
}
