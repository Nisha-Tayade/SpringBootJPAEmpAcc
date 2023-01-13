package com.cg.rest.service;

import java.util.List;

import com.cg.rest.entity.Department;
import com.cg.rest.exception.NoSuchDepartmentFoundException;

public interface DepartmentService {
	Department addDeparment(Department dept);

	Department getDeptById(int id) throws NoSuchDepartmentFoundException;

	List<Department> getAllDepartment();

	Department updateDepartment(Department newDept, int id) throws NoSuchDepartmentFoundException;

	boolean removeDepartment(int id);

}
