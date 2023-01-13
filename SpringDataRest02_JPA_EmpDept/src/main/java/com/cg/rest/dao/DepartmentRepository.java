package com.cg.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
