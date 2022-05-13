package com.skillsoft.jpa;



import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


/*using named queries*/

public class App {


public static void main(String[] args) {

EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
 
 EntityManager entityManager = factory.createEntityManager();
 
 try {
	 
	 /*using named query*/

//	 
//		Query categoryQuery = entityManager.createNamedQuery("selectSpecificCategory");
//		
//		categoryQuery.setParameter("categoryName", "Fashion");
//		
//		System.out.println(categoryQuery.getResultList());
		 
		  
	 
	 /*invoke named query using typed query*/
	 
//	 TypedQuery<Category> categoryQuery = entityManager.createNamedQuery(
//			 Category.SELECT_SPECIFIC_CATEGORY, Category.class);
//	 
//	 categoryQuery.setParameter("categoryName", "Fashion");
//	 
//	 System.out.println(categoryQuery.getSingleResult());
	 
	 //2nd
	 
	 
	 TypedQuery<Product> productQuery1 = entityManager.createNamedQuery(
			 Product.SELECT_PRODUCTS_IN_CATEGORY, Product.class);
	 
	 productQuery1.setParameter("categoryId", 231);
	 
	 System.out.println(productQuery1.getResultList());
	 
	 TypedQuery<Product> productQuery2 = entityManager.createNamedQuery(
			 Product.SELECT_PRODUCTS_IN_PRICE_RANGE, Product.class);
	 
	 productQuery2.setParameter("low", 100f);
	 productQuery2.setParameter("high", 1000f);
	 
	 System.out.println(productQuery2.getResultList());
	 
 
 }catch(Exception ex) {
	   System.out.println("An exception occured "+ ex);
	   
 }finally {
	   
 
	   entityManager.close();
	   factory.close();
 }
}
}


