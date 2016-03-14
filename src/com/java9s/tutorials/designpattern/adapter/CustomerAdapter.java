package com.java9s.tutorials.designpattern.adapter;

public class CustomerAdapter extends NewCustomer implements Customer{
	private OldCustomer oldCustomer;
	
	public CustomerAdapter(OldCustomer oldCustomer){
		this.oldCustomer = oldCustomer;
		this.adaptData();
	}
	
	private void adaptData(){
		this.setName(oldCustomer.getName());
		this.setAge(Integer.valueOf(oldCustomer.getAge()));
		Address address = new Address();
		String[] oldAddress = oldCustomer.getAddress().split(",");
		
		address.setStreetName(oldAddress[0]);
		address.setHouseNumber(Integer.valueOf(oldAddress[1]));
		address.setPostalCode(Integer.valueOf(oldAddress[2]));
		address.setCity(oldAddress[3]);
		this.setAddress(address);
	}
	
	
}
