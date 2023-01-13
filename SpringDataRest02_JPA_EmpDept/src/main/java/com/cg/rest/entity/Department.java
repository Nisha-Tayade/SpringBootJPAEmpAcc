package com.cg.rest.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DeptRestTable")
@Scope("prototype")
public class Department {

	@Id
	private int deptId;
	private String deptName;

	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Employee> elist;

	public Department() {
	}

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Department(List<Employee> elist) {
		super();
		this.elist = elist;
		for(Employee e:elist) {
			e.setDept(this);
		}
	}

	public List<Employee> getElist() {
		return elist;
	}

	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", elist=" + elist + "]";
	}

}
