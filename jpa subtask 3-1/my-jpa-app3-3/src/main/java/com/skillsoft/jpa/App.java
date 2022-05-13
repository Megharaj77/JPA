package com.skillsoft.jpa;



import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


/*Constructing object in queries*/

//public class App {
//
//
//public static void main(String[] args) {
//
//EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
// 
// EntityManager entityManager = factory.createEntityManager();
// 
// try {
//
//	 
//		 TypedQuery<CategoryPrice> aggQuery = entityManager.createQuery(
//				"select new com.skillsoft.jpa.CategoryPrice(c.name, avg(p.price)) "
//				+ "from Categories c "
//				+ "inner join c.products p group by c.name", CategoryPrice.class);
//	 
//	      
//				 
//		 List<CategoryPrice> resultList = aggQuery.getResultList();
//		 
//		 System.out.println();
//		 resultList.forEach(r->System.out.println((r)));
//		 
//		  
// 
// }catch(Exception ex) {
//	   System.out.println("An exception occured "+ ex);
//	   
// }finally {
//	   
// 
//	   entityManager.close();
//	   factory.close();
// }
//}
//}


/*update and delete*/



public class App {


public static void main(String[] args) {

EntityManagerFactory factory = Persistence.createEntityManagerFactory("ShopingDB_Unit");
 
 EntityManager entityManager = factory.createEntityManager();
 
 try {

//	 entityManager.getTransaction().begin();
//	 
//	 Query updateQuery = entityManager.createQuery(
//			 "update Products p set p.name = 'Gel Pens' where p.name = :name");
//	 
//	 updateQuery.setParameter("name", "Pen");
//	 
//	 int rowsUpdated = updateQuery.executeUpdate();
//	 
//	 System.out.println("\n\nNumber of rows updated: " + rowsUpdated);
	 
	 
	 //2nd
	 
	 
//entityManager.getTransaction().begin();
//	 
//	 Query updateQuery = entityManager.createQuery(
//			 "update Categories c set c.name = "
//			 + "case "
//			 + "when c.id = 221 then 'Mobiles and Accessories' "
//			 +"when c.id = 241 then 'Home and Kitchen' "
//			 + "else c.name "
//			 + "end");
//	 
//	 int rowsUpdated = updateQuery.executeUpdate();
//	 
//	 System.out.println("\n\nNumber of rows updated: " + rowsUpdated);
	 
	 /*delete*/
	 
	 
	 entityManager.getTransaction().begin();
	 
	 Query updateQuery = entityManager.createQuery(
			 "delete Products p where p.id > :id");
	 
	 updateQuery.setParameter("id", 1007);
	 
	 int rowsDeleted = updateQuery.executeUpdate();
	 
	 System.out.println("\n\nNumber of rows updated: " + rowsDeleted);
		
 
 }catch(Exception ex) {
	   System.out.println("An exception occured "+ ex);
	   
 }finally {
	   
     entityManager.getTransaction().commit();
	   entityManager.close();
	   factory.close();
 }
}
}
