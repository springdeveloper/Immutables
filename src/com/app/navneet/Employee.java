package com.app.navneet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee  {

	private final int id;
	private final String name;
	private final Department department;
    private ArrayList<Address> addList;
	public Employee(int id, String name, Department department,ArrayList<Address> addList) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.addList=addList;
	}

	public List<Address> getAddList() {
        	 
		return addList.stream().map(item ->new  Address(item.getId(), item.getAddress(), item.getCountry())).collect(Collectors.toList());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return new Department(department.getIds(),department.getDepName());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", addList=" + addList + "]";
	}

	


}
