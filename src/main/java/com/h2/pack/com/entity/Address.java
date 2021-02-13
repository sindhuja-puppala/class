package com.h2.pack.com.entity;

import org.springframework.stereotype.Component;

@Component("addressbean")
public class Address {
	
	  private int id;
	  private String city;
	  private String state;
	  private String country;
	 


	/*public AddressBean(int id, String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.id = id;
	}*/

	/*public AddressBean(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}*/

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address(int id, String city, String state, String country) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [ id=" + id +" city=" + city + ", state=" + state + ", country=" + country +  "]";
	}
	
	
	  
	}



