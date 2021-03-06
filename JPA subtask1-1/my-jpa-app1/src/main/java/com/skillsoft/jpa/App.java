package com.skillsoft.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	   public static void main(String[] args) {
		   
		   EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookstoreDB_Unit");
		   
		   EntityManager entityManager = factory.createEntityManager();
		   
		   try {
			   entityManager.getTransaction().begin();
			   
			   Book firstBook = new Book(1234,"The Java Language Specification","Gilad Bracha",99f);
			   Book secondBook= new Book(2222, "The Java Language Specification Second Edition", "Gilad Bracha, James Gosling",119f);
			   Book thirdBook=new Book();
			   thirdBook.setId(3331);
			   entityManager.persist(firstBook);
			   entityManager.persist(secondBook);
			   entityManager.persist(thirdBook);
		   }catch(Exception ex) {
			   System.out.println("An exception occured: " + ex);
		   }finally {
			   entityManager.getTransaction().commit();
			   
			   entityManager.close();
			   factory.close();
			   
		   }
	   }
}
