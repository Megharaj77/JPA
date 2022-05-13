package com.skillsoft.jpa;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;

@Entity(name="departments")
public class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id")
	private Set<Employee> employees;

	public Department() {
		super();
	}

	public Department(String name) {
		super();
		this.name = name;
	}
	
	@PrePersist
	public void onPrePersist() {
		System.out.println("\n********Before Persisting Department Object: "+ name);
	}
	

	@PostPersist
	public void onPostPersist() {
		System.out.println("\n********After Persisting Department Object: "+ name);
	}
	
	//2nd 
	
	@PostLoad
	public void onPostLoad() {
		System.out.println("\n********After Loading Department Object: "+ name);
	}
	
	@PreUpdate
	public void onPreUpdate() {
		System.out.println("\n***********Before Updating Department Object: "+ name);
	}
	
	@PostUpdate
	public void onPostUpdate() {
		System.out.println("\n*********After Updating Department Object: "+ name);
	}
	
	@PreRemove
	public void onPreRemove() {
		System.out.println("\n********Before removing Department Object: " + name);
	}
	
	@PostRemove
	public void onPostRemove() {
		System.out.println("\n********After removing Department Object: " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

    public void addEmployee(Employee employee) {
		
		if(employees == null) {
			employees=new HashSet<>();
		}
		employees.add(employee);
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", employees=" + employees + "]";
	}


}
