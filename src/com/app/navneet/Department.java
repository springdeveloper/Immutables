package com.app.navneet;

public class Department {
	private int ids;
	private String depName;

	public void setIds(int ids) {
		this.ids = ids;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Department(int ids, String depName) {
		super();
		this.ids = ids;
		this.depName = depName;
	}

	public int getIds() {
		return ids;
	}

	public String getDepName() {
		return depName;
	}

	
	@Override
	public String toString() {
		return "Department [ids=" + ids + ", depName=" + depName + "]";
	}

}
