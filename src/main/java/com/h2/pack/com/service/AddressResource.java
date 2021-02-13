package com.h2.pack.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.h2.pack.com.entity.Address;
import com.h2.pack.com.entity.StudentModel2;

@Component
public class AddressResource implements AddressService {
	public static List<Address > a=new ArrayList<Address>();
	static {
	a.add(new Address(1,"Hyd","TS","India"));
	a.add(new Address(2,"Ban","KA","India"));
	a.add(new Address(3,"Chen","TN","India"));
	a.add(new Address(4,"Hyd","TS","India"));
	a.add(new Address(5,"Vzg","AP","India"));
	a.add(new Address(6,"Hyd","TS","India"));
	
	}
	@Override
	public List<Address> findAllAddress() {
		// TODO Auto-generated method stub
		return a;
	}
	
	
	}
