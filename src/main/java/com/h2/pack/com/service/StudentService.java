package com.h2.pack.com.service;

import java.util.List;

import com.h2.pack.com.entity.Address;
import com.h2.pack.com.entity.StudentModel;
import com.h2.pack.com.entity.StudentModel2;

public interface StudentService {

	



	List<StudentModel> findEmpList();


	List<StudentModel2> Addaddres(List<Address> findAllAddress);

	

	

	
	StudentModel addStudentModel(StudentModel e);

	
	StudentModel deleteStudent(Integer id);


	StudentModel2 displayAddress(Integer id);

	

}
