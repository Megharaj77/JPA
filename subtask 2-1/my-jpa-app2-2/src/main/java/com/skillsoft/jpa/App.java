package com.skillsoft.jpa;


import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
//			   Invoice invoiceOne = new Invoice(699f);
//			   Invoice invoiceTwo = new Invoice(67f);
//			   
//			   Order orderOne = new Order("iPhone 65",1,new GregorianCalendar(2020, 1, 3).getTime());
//			   Order orderTwo = new Order("Nike Sneakers", 2, new GregorianCalendar(2020, 2, 5).getTime());
//			   
//			   orderOne.setInvoice(invoiceOne);
//			   orderTwo.setInvoice(invoiceTwo);
//			   
//			   entityManager.persist(orderOne);
//			   entityManager.persist(orderTwo);
//			   
//			   entityManager.persist(invoiceOne);
//			   entityManager.persist(invoiceTwo);
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
//


/*Read operation*/


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