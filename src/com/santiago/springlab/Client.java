package com.santiago.springlab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object created by developer
//		Product pRef = new Product();
//		pRef.setPid(1);
//		pRef.setPname("cake");
//		pRef.setPdescription("chocolate ");
//		
//		System.out.println("The product is: " + pRef);
		
		// Inversion of Control (Spring) XML
//		Resource resource = new ClassPathResource("productbean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Product p1F = (Product)factory.getBean("prod1");
//		Product p2F = factory.getBean("prod2", Product.class);
////		OBJECTS ONLY CREATED WHEN REQUESTED BY XML BEAN
////		BEAN CLASS -> XML FILE 
//		System.out.println(p1F);
//		System.out.println(p2F);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("productbean.xml");
//		OBJECTS CREATED BY CONTEXT EVEN WHEN NOT REQUESTED
//		BUILT ON TOP OF BEAN FACTORY
//		
		Product p1C = (Product)context.getBean("prod1");
		
//		Product p2C = context.getBean("prod2", Product.class);
		System.out.println(p1C);
//		System.out.println(p2C);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		cxt.close();
		// custom destroy the bean
		
		// spring initializes and destroys automatically
	}

}
