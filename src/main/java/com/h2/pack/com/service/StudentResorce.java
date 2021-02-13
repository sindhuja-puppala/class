package com.h2.pack.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.h2.pack.com.entity.Address;
import com.h2.pack.com.entity.StudentModel;
import com.h2.pack.com.entity.StudentModel2;

@Component("resBean")
public class StudentResorce implements StudentService {

	private static List<StudentModel> stu =new ArrayList<>();
	private static List<StudentModel2> stu2 =new ArrayList<>();
	static{
		stu.add(new StudentModel(1,"sindhu"));
		stu.add(new StudentModel(2,"nandu"));
		stu.add(new StudentModel(3,"ravi"));
		stu.add(new StudentModel(4,"prasanth"));
		
		stu2.add(new StudentModel2(1,"sindu"));
		stu2.add(new StudentModel2(2,"nandu"));
		stu2.add(new StudentModel2(3,"ravi"));
		stu2.add(new StudentModel2(4,"prasanth"));
	}
	
	@Override
	public List<StudentModel> findEmpList(){
		return stu;
	}
	//@Override
	
  public StudentModel addStudentModel(StudentModel e) {
		// TODO Auto-generated method stub
		stu.add(e);
		return e;
	}
	
	@Override
	public StudentModel deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		StudentModel employee = null;
		for(StudentModel e:stu)
		{ 
			if(e.getEmpId()==id)
			{  
				stu.remove(e);
				employee =e;
				break;
			
			}
		}
		return employee;
	}
	
	@Override
	public List<StudentModel2> Addaddres(List<Address> findAllAddress) {
		// TODO Auto-generated method stub
		for(Address a:findAllAddress)
			
			for(StudentModel2 e:stu2)
			{ 
				if(e.getEmpId()==a.getId())
				{  
					e.setA(a);
				}
			}
		return stu2;
	}
	@Override
	public StudentModel2 displayAddress(Integer id) {
		// TODO Auto-generated method stub
		StudentModel2 s=null;
		for(StudentModel2 e:stu2)
		{ 
			if(e.getEmpId()==id)
			{  
				s=e;
			}
		}
		return s;
	}

		
	}


