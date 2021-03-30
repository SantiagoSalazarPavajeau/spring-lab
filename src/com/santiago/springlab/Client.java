package com.santiago.springlab;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object created by developer
		Product pRef = new Product();
		pRef.setPid(1);
		pRef.setPname("cake");
		pRef.setPdescription("chocolate ");
		
		System.out.println("The product is: " + pRef);
		
		// Inversion of Control (Spring) XML
		
	}

}
