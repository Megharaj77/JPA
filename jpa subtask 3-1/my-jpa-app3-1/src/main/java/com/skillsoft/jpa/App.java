package com.skillsoft.jpa;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/* Native Query*/

//public class App {
//      
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) {
//		
//		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
//		   
//		   EntityManager entityManager = factory.createEntityManager();
//		   
//		   try {
//			  Query query = entityManager.createNativeQuery("select * from categories", Category.class);
//			  List<Category> categories = (List<Category>) query.getResultList();
//			  
//			  categories.forEach(System.out::println);
//			  
//			  query = entityManager.createNativeQuery("select * from products",Product.class);
//			  
//			  List<Product> products = (List<Product>) query.getResultList();
//			  
//			  products.forEach(System.out::println);
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



/*using JPQL queries*/


//public class App {
//
//
//public static void main(String[] args) {
//
// EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
//   
//   EntityManager entityManager = factory.createEntityManager();
//   
//   try {
//	  Query categoryQuery = entityManager.createQuery("select c  from Categories c");
//	  
//	  List<?> categories = categoryQuery.getResultList();
//	  
//	  categories.forEach(System.out::println);
//	  
//	  Query productQuery = entityManager.createQuery("select p from Products p");
//	  
//	  List<?> products =  productQuery.getResultList();
//	  
//	  products.forEach(System.out::println);
//	   
//   }catch(Exception ex) {
//	   System.out.println("An exception occured "+ ex);
//	   
//   }finally {
//	   
//   
//	   entityManager.close();
//	   factory.close();
//   }
//}
//}



//public class App {
//
//
//public static void main(String[] args) {
//
// EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
//   
//   EntityManager entityManager = factory.createEntityManager();
//   
//   try {
//	  Query categoryQuery = entityManager.createQuery("select c  from Categories c");
//	  
//	  categoryQuery.setFirstResult(1);
//	  categoryQuery.setMaxResults(2);
//	  
//	  System.out.println("Position of first result "+   categoryQuery.setFirstResult(1));
//	  System.out.println("Max result "+ categoryQuery.setMaxResults(2));
//	  
//	  @SuppressWarnings("unchecked")
//	  List<Category> categoryList = (List<Category>)categoryQuery.getResultList();
//	  
//	  System.out.println(categoryList);
//	   
//   }catch(Exception ex) {
//	   System.out.println("An exception occured "+ ex);
//	   
//   }finally {
//	   
//   
//	   entityManager.close();
//	   factory.close();
//   }
//}
//}



/*typed query*/


//public class App {
//
//
//public static void main(String[] args) {
//
// EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
//   
//   EntityManager entityManager = factory.createEntityManager();
//   
//   try {
//	  TypedQuery<Product> productQuery = entityManager.createQuery(
//			  "select p from Products p", Product.class);
//	  List<Product> productList = productQuery.getResultList();
//	  System.out.println(productList);
//	   
//   }catch(Exception ex) {
//	   System.out.println("An exception occured "+ ex);
//	   
//   }finally {
//	   
//   
//	   entityManager.close();
//	   factory.close();
//   }
//}
//}



/*parameterized queries*/

public class App {


public static void main(String[] args) {

EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
 
 EntityManager entityManager = factory.createEntityManager();
 
 try {
	 
	 
//	  TypedQuery<Product> productQuery = entityManager.createQuery(
//			  "select p from Products p where p.id=:pid", Product.class);
//	  
//	  productQuery.setParameter("pid",1003);
//	  
//	  Product product = productQuery.getSingleResult();
//	  
//	  System.out.println(product);
	 
	 
	 /*positional parameter*/
	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(
//			  "select p from Products p where p.id= ?1", Product.class);
//	  
//	  productQuery.setParameter(1,1003);
//	  
//	  Product product = productQuery.getSingleResult();
//	  
//	  System.out.println(product);
	   
	 /*list of product*/
	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(
//			  "select p from Products p where p.id < :pid order by price desc", Product.class);
//	 
//	    productQuery.setParameter("pid",1005);
//	 
//	  List<Product> productList = productQuery.getResultList();
//	  
//	  System.out.println(productList);
	 
	 /*name filter*/
	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(
//			  "select p from Products p where p.name like :nameStartsWith", Product.class);
//	 
//	    productQuery.setParameter("nameStartsWith","iPh");
//	 
//	  List<Product> productList = productQuery.getResultList();
//	  
//	  System.out.println(productList);
	 
	 /*multiple condition*/
	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(
//			  "select p from Products p where p.name not like :nameStartsWith and p.price > :priceParameter", Product.class);
//	 
//	    productQuery.setParameter("nameStartsWith","iPh");
//	    productQuery.setParameter("priceParameter",10f);
//	    
//	  List<Product> productList = productQuery.getResultList();
//	  
//	  System.out.println(productList);
	 
	 /*referncing Foreign key */
	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(
//			  "select p from Products p where p.category.id = :category_id", Product.class);
//	 
//	    productQuery.setParameter("category_id", 231);
//	   
//	  List<Product> productList = productQuery.getResultList();
//	  
//	  System.out.println(productList);
	 
	 
	 /* performing joins */
	 
//	 TypedQuery<Category> categoryQuery = entityManager.createQuery(
//			  "select c from Categories c "
//			  + "inner join c.products ", Category.class);
//	 
//	   
//	  List<Category> categories = categoryQuery.getResultList();
//	  
//	  System.out.println(categories);
	 
	 
	 //2nd
	 
//	 TypedQuery<Category> categoryQuery = entityManager.createQuery(
//			  "select c from Categories c "
//			  + "inner join c.products p "
//			  + "where p.price > ?1", Category.class);
//	 
//	      categoryQuery.setParameter(1, 80f);
//	 
//	  List<Category> categories = categoryQuery.getResultList();
//	  
//	  System.out.println(categories);
	  
	 //3rd
	 
//	 TypedQuery<Category> categoryQuery = entityManager.createQuery(
//			  "select c from Categories c "
//			  + "inner join c.products p "
//			  + "where c.name = ?1 "
//			  + "and p.price > ?2", Category.class);
//	 
//	      categoryQuery.setParameter(1, "Fashion");
//	      categoryQuery.setParameter(2, 60f);
//	 
//	  List<Category> categories = categoryQuery.getResultList();
//	  
//	  System.out.println(categories);
	 
	 /*Fetch joins*/
	 
//	 TypedQuery<Category> categoryQuery = entityManager.createQuery(
//			  "select c from Categories c "
//			  + "inner join fetch c.products p "
//			  + "where c.name = ?1 "
//			  + "and p.price > ?2", Category.class);
//	 
//	      categoryQuery.setParameter(1, "Fashion");
//	      categoryQuery.setParameter(2, 60f);
//	 
//	  List<Category> categories = categoryQuery.getResultList();
//	  
//	  System.out.println(categories);
	 
	 
	 //2nd
	 
	 
	 TypedQuery<Category> categoryQuery = entityManager.createQuery(
			  "select c from Categories c "
			  + "inner join fetch c.products p "
			  + "where p.name in (?1, ?2, ?3) ", Category.class);
	 
	      categoryQuery.setParameter(1, "Samsung Galaxy");
	      categoryQuery.setParameter(2, "Jeans");
	      categoryQuery.setParameter(3, "Notebook");
	 
	  List<Category> categories = categoryQuery.getResultList();
	  
	  System.out.println(categories);
	 
 
 }catch(Exception ex) {
	   System.out.println("An exception occured "+ ex);
	   
 }finally {
	   
 
	   entityManager.close();
	   factory.close();
 }
}
}

