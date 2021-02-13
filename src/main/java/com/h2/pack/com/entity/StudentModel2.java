package com.h2.pack.com.entity;

public class StudentModel2 {
	private Address a;
		private int empId;
		private String name;
		public StudentModel2(int empId, String name) {
			super();
			this.empId = empId;
			this.name = name;
		}
		
		public StudentModel2() {
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

		public Address getA() {
			return a;
		}
		public void setA(Address a) {
			// TODO Auto-generated method stub
	this.a= a;
		}

		}


