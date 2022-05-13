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

//public class App {
//
//
//public static void main(String[] args) {
//
//EntityManagerFactory factory = Persistence.createEntityManagerFactory("CompanyDB_Unit");
// 
// EntityManager entityManager = factory.createEntityManager();
// 
// try {
//	 
//       entityManager.getTransaction().begin();
//       
//       Employee alice = new Employee("Alice");
//       Employee ben = new Employee("Ben");
//       Employee cora = new Employee("Cora");
//       Employee dennis = new Employee("Dennis");
//       
//       Department tech = new Department("Tech");
//       tech.addEmployee(alice);
//       tech.addEmployee(ben);
//       
//       Department operations = new Department("Operations");
//       operations.addEmployee(cora);
//       operations.addEmployee(dennis);
//       
//       entityManager.persist(tech);
//       entityManager.persist(operations);
//       
//	 
// 
// }catch(Exception ex) {
//	   System.out.println("An exception occured "+ ex);
//	   
// }finally {
//	   entityManager.getTransaction().commit();
// 
//	   entityManager.close();
//	   factory.close();
// }
//}
//}



/*working with load callbacks*/


public class App {


public static void main(String[] args) {

EntityManagerFactory factory = Persistence.createEntityManagerFactory("CompanyDB_Unit");
 
 EntityManager entityManager = factory.createEntityManager();
 
 try {
	 
//      Department tech = entityManager.find(Department.class, 1);
//      
//      System.out.println(tech);
//      
//      
//      Department operations = entityManager.find(Department.class, 2);
//      
//      System.out.println(operations);
	 
	 
	 
	 /*using typed query*/
	 
//	 TypedQuery<Department> deptQuery = entityManager.createQuery(
//			 "select d from departments d",Department.class);
//	 
//	 List<Department> deptList = deptQuery.getResultList();
//	 
//	 System.out.println(deptList);
	 
	 
//	 
//	 TypedQuery<Employee> empQuery = entityManager.createQuery(
//			 "select e from employees e",Employee.class);
//	 
//	 List<Employee> empList = empQuery.getResultList();
//	 
//	 System.out.println(empList);
	 
	 
	 /*update callback*/
	 
//	 entityManager.getTransaction().begin();
//	 
//	 Department tech = entityManager.find(Department.class, 1);
//	 
//	 tech.setName("Engineering");
//	 
//	 entityManager.merge(tech);
	 
	 
	 //2nd
	 
	 
//     entityManager.getTransaction().begin();
//	 
//	 Department operations = entityManager.find(Department.class, 2);
//	 
//	 operations.setName("Ops");
//	 
//	 entityManager.merge(operations);
	 
	 
	 //3rd
	 
	 
//     entityManager.getTransaction().begin();
//	 
//	 Department operations = entityManager.find(Department.class, 2);
//	 
//	 operations.setName("Operations");
//	 
//	 Employee elise = new Employee("Elise");
//	 operations.addEmployee(elise);
//	 
//	 entityManager.merge(operations);
//	 
	 
	 
	 //4th
	 
	 
//      entityManager.getTransaction().begin();
//	 
//	 Employee employee = entityManager.find(Employee.class, 2);
//	 
//	 employee.setName("Zoe");
//	 
//	 entityManager.merge(employee);
	 
	 
	 /*deletion*/
	 
	 
	 
//	 entityManager.getTransaction().begin();
//	 
//	 Employee employee = entityManager.find(Employee.class, 3);
//	 
//	 entityManager.remove(employee);
	 
	 
	 //2nd
	 
     entityManager.getTransaction().begin();
	 
     Department dept = entityManager.find(Department.class, 1);
	 
	 entityManager.remove(dept);

 
 }catch(Exception ex) {
	   System.out.println("An exception occured "+ ex);
	   
 }finally {
	   entityManager.getTransaction().commit();
	   
	   entityManager.close();
	   factory.close();
 }
}
}

