package com.skillsoft.jpa;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/*oneToMany*/

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
//			   Product productOne= new Product("iPhone 6S", 1);
//			   Product productTwo= new Product("Nike Sneakers",2);
//			   
//			   List<Product>listOne = new ArrayList<>();
//			   listOne.add(productOne);
//			   listOne.add(productTwo);
//			   
//			   Order orderOne = new Order(listOne, new GregorianCalendar(2020, 1, 3).getTime());
//			   
//			   Product productThree = new Product("Samsung Galaxy", 1);
//			   Product productFour = new Product("Crocs", 1);
//			   Product productFive = new Product("BenQ Monitors", 4);
//			   
//			   List<Product> listTwo = new ArrayList<>();
//			   listTwo.add(productThree);
//			   listTwo.add(productFour);
//			   listTwo.add(productFive);
//			   
//			   Order orderTwo = new Order(listTwo, new GregorianCalendar(2020, 2, 5).getTime());
//			   
//			   entityManager.persist(orderOne);
//			   entityManager.persist(orderTwo);
//			   
//			   entityManager.persist(productOne);
//			   entityManager.persist(productTwo);
//			   entityManager.persist(productThree);
//			   entityManager.persist(productFour);
//			   entityManager.persist(productFive);
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


/*retriveing*/

public class App {

	public static void main(String[] args) {
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
		   
		   EntityManager entityManager = factory.createEntityManager();
		   
		   try {
			   Order orderOne = entityManager.find(Order.class,1);
			   
			   System.out.println(orderOne);
			   
			   Order orderTwo = entityManager.find(Order.class,2);
			   
			   System.out.println(orderTwo);
			   
			   
		   }catch(Exception ex) {
			   System.out.println("An exception occured "+ ex);
			   
		   }finally {
			   
		   
			   entityManager.close();
			   factory.close();
		   }
	}
}

