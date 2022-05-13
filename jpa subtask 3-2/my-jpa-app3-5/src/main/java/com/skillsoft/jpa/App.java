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


/*Criteria API*/

public class App {


public static void main(String[] args) {

EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
 
 EntityManager entityManager = factory.createEntityManager();
 
 try {
	 
//	 CriteriaBuilder cd = entityManager.getCriteriaBuilder();
//	 
//	 CriteriaQuery<Category> categoryCQ = cd.createQuery(Category.class);
//	 
//	 Root<Category> rootCategory = categoryCQ.from(Category.class);
//	 
//	 categoryCQ.select(rootCategory);
//	 
//	 TypedQuery<Category> categoryQuery = entityManager.createQuery(categoryCQ);
//	 
//	 System.out.println(categoryQuery.getResultList());
	 

	 //products
	 
	 
// CriteriaBuilder cd = entityManager.getCriteriaBuilder();
//	 
//	 CriteriaQuery<Product> productCQ = cd.createQuery(Product.class);
//	 
//	 Root<Product> rootProduct = productCQ.from(Product.class);
//	 
//	 productCQ.select(rootProduct);
//	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
//	 
//	 System.out.println(productQuery.getResultList());
	 
	 
	 /*Basic criteria queries*/
	 
//     CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//	 
//	 CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
//	 
//	 Root<Product> rootProduct = productCQ.from(Product.class);
//	 
//	 productCQ.select(rootProduct)
//	 .where(cb.equal(rootProduct.get("id"), 1001));
//	 
//	 productCQ.select(rootProduct);
//	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
//	 
//	 System.out.println(productQuery.getResultList());
	 
	 //2nd
	 
	 
//     CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//	 
//	 CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
//	 
//	 Root<Product> rootProduct = productCQ.from(Product.class);
//	 
//	 productCQ.select(rootProduct)
//	 .where(cb.greaterThan(rootProduct.get("price"), 5));
//	 
//	 productCQ.select(rootProduct);
//	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
//	 
//	 System.out.println(productQuery.getResultList());
	 
	 
	 
	 //3rd
	 
	 
// CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//	 
//	 CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
//	 
//	 Root<Product> rootProduct = productCQ.from(Product.class);
//	 
//	 Predicate equalToPredicate = cb.equal(rootProduct.get("category"),261);
//	 productCQ.select(rootProduct)
//	 .where(equalToPredicate.not());
//	 
//	 productCQ.select(rootProduct);
//	 
//	 TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
//	 
//	 System.out.println(productQuery.getResultList());
//	 
	 
	 
	 //4th
	 
	 
CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	 
	 CriteriaQuery<Product> productCQ = cb.createQuery(Product.class);
	 
	 Root<Product> rootProduct = productCQ.from(Product.class);
	 
	
	 productCQ.select(rootProduct)
	 .orderBy(cb.desc(rootProduct.get("price")));
	 
	 productCQ.select(rootProduct);
	 
	 TypedQuery<Product> productQuery = entityManager.createQuery(productCQ);
	 
	 System.out.println(productQuery.getResultList());
	 
 
 }catch(Exception ex) {
	   System.out.println("An exception occured "+ ex);
	   
 }finally {
	   
 
	   entityManager.close();
	   factory.close();
 }
}
}


