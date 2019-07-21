package com.app.navneet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department dep = new Department(12, "IT");
		List<Address> addList = Arrays.asList(new Address(45, "Klayni Nagr", "India"));
		ArrayList<Address> dfg=new ArrayList<>(addList);
		Employee emp = new Employee(14, "Navneet", dep, dfg);
		emp.getDepartment().setDepName("dd");
		Department df = emp.getDepartment();
		df.setDepName("fucjjj");
		System.out.println(emp.toString());

		Address ads = ((List<Address>) emp.getAddList()).get(0);
		ads.setCountry("Pakistan");
		System.out.println(emp.getAddList().toString());

	}

}
