package com.cg.rest.service;

import java.util.List;

import com.cg.rest.entity.Employee;
import com.cg.rest.exception.NoSuchEmployeeFoundException;

public interface EmployeeService {

	Employee addEmployee(Employee emp);

	List<Employee> findAllEmployee();

	Employee findEmployeeById(int id) throws NoSuchEmployeeFoundException;

	boolean removeEmployee(int id) throws NoSuchEmployeeFoundException;

	List<Employee> findEmpByDept(String departmentName);

	Employee modifyEmployee(Employee emp, int id) throws NoSuchEmployeeFoundException;

}
