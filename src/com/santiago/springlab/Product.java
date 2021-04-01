package com.santiago.springlab;

public class Product {

	int pid;
	String pname;
	Store store;
	
	public Product (){
		System.out.println("PRODUCT CONSTRUCTED");
	}
	
	public Product(Store store) {
		this.store = store; // injection 
	}
	// source generate constructor from fields
	public Product(int pid, String pname, Store store) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.store = store;
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

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		System.out.println("setter");
		this.store = store; // setter injection
	}

	public void customInit() {
		System.out.println("Custom initialized");
	}

	public void customDestroy() {
		System.out.println("Custom destroyed");
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", store=" + store + "]";
	}
	
	
}
