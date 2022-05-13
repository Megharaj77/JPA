package com.skillsoft.jpa;

import javax.persistence.EntityManager;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.GregorianCalendar;

//public class App {
//
//	   public static void main(String[] args) {
//		   
//		   EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookstoreDB_Unit");
//		   
//		   EntityManager entityManager = factory.createEntityManager();
//		   
//		   try {
//			    Book bookOne = entityManager.find(Book.class, 221);
//			    System.out.println(bookOne);
//			    
//			    Book bookTwo = entityManager.find(Book.class, 251);
//			    System.out.println(bookTwo);
//			    
//			    Book bookThree = entityManager.find(Book.class, 281);
//			    System.out.println(bookThree);
//			   
//			  
//			   
//		   }catch(Exception ex) {
//			   System.out.println("An exception occured: " + ex);
//		   }finally {
//			   
//			   
//			   entityManager.close();
//			   factory.close();
//			   
//		   }
//	   }
//}


/*  read using create query*/
//public class App{
//	
//	public static void main(String[] args) {
//		EntityManagerFactory factory= Persistence.createEntityManagerFactory("BookstoreDB_Unit");
//		
//		EntityManager entityManager= factory.createEntityManager();
//		
//		try {
//			List<Book> books = entityManager.createQuery("SELECT b from Book b", Book.class).getResultList();
//			System.out.println(books);
//		} 
//		catch(Exception ex) {
//		   System.out.println("An exception occured: " + ex);
//		   }finally {
//			   
//			   
//			   entityManager.close();
//			   factory.close();
//			   
//		   }
//	}
//}




/*update records*/


//public class App{
//	
//	public static void main(String[] args) {
//		EntityManagerFactory factory= Persistence.createEntityManagerFactory("BookstoreDB_Unit");
//		
//		EntityManager entityManager= factory.createEntityManager();
//		
//		try {
//			Book bookOne = entityManager.find(Book.class, 221);
//			Book bookTwo = entityManager.find(Book.class, 251);
//			
//			System.out.println(bookOne);
//			System.out.println(bookTwo);
//			
//			entityManager.getTransaction().begin();
//			
//			bookOne.setPrice(25.22f);
//			bookTwo.setTitle("Core Java Volume I - Fundamentals");
//			
//			entityManager.merge(bookOne);
//			entityManager.merge(bookTwo);
//		} 
//		catch(Exception ex) {
//		   System.out.println("An exception occured: " + ex);
//		   }finally {
//			   entityManager.getTransaction().commit();
//			   
//			   entityManager.close();
//			   factory.close();
//			   
//		   }
//	}
//}


/*deleting records*/


public class App{
	
	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("BookstoreDB_Unit");
		
		EntityManager entityManager= factory.createEntityManager();
		
		try {
			Book bookOne = entityManager.find(Book.class, 221);
			Book bookTwo = entityManager.find(Book.class, 251);
			
			System.out.println(bookOne);
			System.out.println(bookTwo);
			
			entityManager.getTransaction().begin();
			
			if(bookOne !=null) {
				entityManager.remove(bookOne);
			}
			if(bookTwo !=null) {
				entityManager.remove(bookTwo);
			}
		} 
		catch(Exception ex) {
		   System.out.println("An exception occured: " + ex);
		   }finally {
			   entityManager.getTransaction().commit();
			   
			   entityManager.close();
			   factory.close();
			   
		   }
	}
}