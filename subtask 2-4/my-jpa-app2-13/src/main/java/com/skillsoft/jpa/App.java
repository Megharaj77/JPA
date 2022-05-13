package com.skillsoft.jpa;


import java.util.ArrayList;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/*Bidirectional OneToMany and ManyToOne*/

//public class App {
//
//	public static void main(String[] args) {
//		
//		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
//		   
//		   EntityManager entityManager = factory.createEntityManager();
//		   
//		   try {
//			   entityManager.getTransaction().begin();
//			   
//			   Product productIPhone= new Product("iPhone 6S");
//			   Product productNike= new Product("Nike Sneakers");
//			   Product productCrocs = new Product("Crocs");
//			   Product productBenq = new Product("BenQ Monitors");
//			   Product productSamsung = new Product("Samsung Galaxy");
//			   
//			   List<Product>listJhon = new ArrayList<>();
//			   List<Product>listJulie = new ArrayList<>();
//			   List<Product>listBen = new ArrayList<>();
//			   
//			   listJhon.add(productIPhone);
//			   listJhon.add(productNike);
//			   listJhon.add(productCrocs);
//			   
//			   Customer customerJhon = new Customer("Jhon",listJhon);
//			   
//			   listJulie.add(productIPhone);
//			   listJulie.add(productSamsung);
//			   
//			   Customer customerJulie = new Customer("Julie",listJulie);
//			   
//			   listBen.add(productIPhone);
//			   listBen.add(productBenq);
//			   listBen.add(productCrocs);
//			   
//			   Customer customerBen = new Customer("Ben", listBen);
//			   
//			   entityManager.persist(customerJhon);
//			   entityManager.persist(customerJulie);
//			   entityManager.persist(customerBen);
//			   
//			   entityManager.persist(productIPhone);
//			   entityManager.persist(productNike);
//			   entityManager.persist(productSamsung);
//			   entityManager.persist(productCrocs);
//			   entityManager.persist(productBenq);
//			   
//			   
//			   
//		   }catch(Exception ex) {
//			   System.out.println("An exception occured "+ ex);
//			   
//		   }finally {
//			   entityManager.getTransaction().commit();
//		   
//			   entityManager.close();
//			   factory.close();
//		   }
//	}
//}



/*retrieving products*/



public class App {

	public static void main(String[] args) {
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
		   
		   EntityManager entityManager = factory.createEntityManager();
		   
		   try {
			  Product productOne = entityManager.find(Product.class, 1);
			   
			  System.out.println(productOne);
			  System.out.println(productOne.getCustomers());
			  
			  Product productFive = entityManager.find(Product.class, 5);
			   
			  System.out.println(productFive);
			  System.out.println(productFive.getCustomers());
			   
		   }catch(Exception ex) {
			   System.out.println("An exception occured "+ ex);
			   
		   }finally {
			   
		   
			   entityManager.close();
			   factory.close();
		   }
	}
}

/* retrieving orders*/

//public class App {
////
//	public static void main(String[] args) {
//		
//		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
//		   
//		   EntityManager entityManager = factory.createEntityManager();
//		   
//		   try {
//			  Customer customerOne = entityManager.find(Customer.class,1);
//			  
//			  System.out.println(customerOne);
//			  System.out.println(customerOne.getProducts());
//			  
//              Customer customerThree = entityManager.find(Customer.class,3);
//			  
//			  System.out.println(customerThree);
//			  System.out.println(customerThree.getProducts());
//			   
//		   }catch(Exception ex) {
//			   System.out.println("An exception occured "+ ex);
//			   
//		   }finally {
//			   
//		   
//			   entityManager.close();
//			   factory.close();
//		   }
//	}
//}
