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
//			   Product productIphone= new Product("iPhone 6S", 1);
//			   Product productNike= new Product("Nike Sneakers",2);
//			   
//			   List<Product>listOne = new ArrayList<>();
//			   listOne.add(productIphone);
//			   listOne.add(productNike);
//			   
//			   Order orderOne = new Order(listOne, new GregorianCalendar(2020, 1, 3).getTime());
//			   
//			   Product productSamsung = new Product("Samsung Galaxy", 1);
//			   Product productCrocs = new Product("Crocs", 1);
//			   Product productBenq = new Product("BenQ Monitors", 4);
//			   
//			   List<Product> listTwo = new ArrayList<>();
//			   listTwo.add(productSamsung);
//			   listTwo.add(productCrocs);
//			   listTwo.add(productBenq);
//			   
//			   Order orderTwo = new Order(listTwo, new GregorianCalendar(2020, 2, 5).getTime());
//			   
//			   entityManager.persist(orderOne);
//			   entityManager.persist(orderTwo);
//			   
//			   entityManager.persist(productIphone);
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
			  System.out.println(productOne.getOrder());
			  
			  Product productFive = entityManager.find(Product.class, 5);
			   
			  System.out.println(productFive);
			  System.out.println(productFive.getOrder());
			   
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
//
//	public static void main(String[] args) {
//		
//		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
//		   
//		   EntityManager entityManager = factory.createEntityManager();
//		   
//		   try {
//			  Order orderOne = entityManager.find(Order.class, 1);
//			  
//			  System.out.println(orderOne);
//			  System.out.println(orderOne.getProducts());
//			  
//              Order orderTwo = entityManager.find(Order.class, 2);
//			  
//			  System.out.println(orderTwo);
//			  System.out.println(orderTwo.getProducts());
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



