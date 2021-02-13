package com.h2.pack.com.entity;

import org.springframework.stereotype.Component;

@Component("stuBean")
public class StudentModel {
	private int empId;
	private String name;
	public StudentModel(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	public StudentModel() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", name=" + name + "]";
	}

	}


