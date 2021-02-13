package com.h2.pack.com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2.pack.com.entity.StudentModel;
import com.h2.pack.com.entity.StudentModel2;
import com.h2.pack.com.service.AddressService;
import com.h2.pack.com.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	private StudentService stu;
	@Autowired
	private AddressService addr;
	@RequestMapping("/home")
	
	public String disply(){
		System.out.println("Hello");
		return "Welcome";
		
	}
	 //b.Using Get request  method retrieve all employee details
	@GetMapping("/stu")
	@ResponseBody
	
	 public  List<StudentModel> retriveAllStudents()
	  {
		 return this.stu.findEmpList();
	  }
 @DeleteMapping("/delete/{id}")
 public StudentModel deleteStudent(@PathVariable Integer id)
 {
	 return  this.stu.deleteStudent(id);
 }
	 //Based on the id getting employee details
	/* @GetMapping("//{id}")
	 public  StudentModel retriveStudent(@PathVariable Integer id)
	 {
		 return this.stu.dispalyemployee(id);
	 }*/
	 
	  @ResponseBody   
	 @GetMapping("/address")
	 public  List<StudentModel2> retriveAllStudentWithAddress()
	 {
		 return this.stu.Addaddres(addr.findAllAddress());
	 }
	 @GetMapping("/address{id}")
		
	 public  StudentModel2 studentAddress(@PathVariable Integer id) {
		 
		 return this.stu.displayAddress(id);
		 
	    
	      }

}
