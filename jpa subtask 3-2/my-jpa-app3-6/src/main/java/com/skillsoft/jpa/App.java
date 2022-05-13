package com.skillsoft.jpa;



import java.util.Arrays;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.*;


/*Criteria API advanced queries*/

public class App {


public static void main(String[] args) {

EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
 
 EntityManager entityManager = factory.createEntityManager();
 
 try {
	 
//     CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//	 
//	 CriteriaQuery<String> productCQ = cb.createQuery(String.class);
//	 
//	 Root<Product> rootProduct = productCQ.from(Product.class);
//	 
//	
//	 productCQ.select(rootProduct.get("name"));
//	 
//	 TypedQuery<String> productQuery = entityManager.createQuery(productCQ);
//	 
//	 productQuery.getResultList().forEach(System.out::println);
	 
	 //select multiple field values
	 
	 
//     CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//	 
//	 CriteriaQuery<Object[]> productCQ = cb.createQuery(Object[].class);
//	 
//	 Root<Product> rootProduct = productCQ.from(Product.class);
//	 
//	
////	 productCQ.select(cb.array(rootProduct.get("name"), rootProduct.get("price")));
//	 
//	 productCQ.multiselect(rootProduct.get("name"), rootProduct.get("price"));
//	 
//	 TypedQuery<Object[]> productQuery = entityManager.createQuery(productCQ);
//	 
//	 productQuery.getResultList().forEach(r -> System.out.println(Arrays.toString(r)));
	 
	 
	 //groupby
	 
	 
 CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	 
	 CriteriaQuery<Object[]> productCQ = cb.createQuery(Object[].class);
	 
	 Root<Product> rootProduct = productCQ.from(Product.class);
	 
	 productCQ.multiselect(rootProduct.get("category"), cb.count(rootProduct))
	 .groupBy(rootProduct.get("category"));
	 
	 
	 TypedQuery<Object[]> productQuery = entityManager.createQuery(productCQ);
	 
	 productQuery.getResultList().forEach(r -> System.out.println(Arrays.toString(r)));
	 
 
 }catch(Exception ex) {
	   System.out.println("An exception occured "+ ex);
	   
 }finally {
	   
 
	   entityManager.close();
	   factory.close();
 }
}
}


