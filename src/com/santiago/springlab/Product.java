package com.santiago.springlab;

public class Product {

	int pid;
	String pname;
	String pdescription;
	
	public Product (){
		
	}
	// source generate constructor from fields
	public Product(int pid, String pname, String pdescription) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
	}
	
	// source generate setters and getters
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdescription=" + pdescription + "]";
	}
	
	
}
