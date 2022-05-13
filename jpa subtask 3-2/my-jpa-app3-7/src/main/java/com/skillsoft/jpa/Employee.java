package com.skillsoft.jpa;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

@Entity(name="employees")
public class Employee {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public Employee() {
		
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	@PrePersist
	public void onPrePersist() {
		System.out.println("\n********Before Persisting Employee: "+ name);
	}
	

	@PostPersist
	public void onPostPersist() {
		System.out.println("\n********After Persisting Employee: "+ name);
	}

	@PostLoad
	public void onPostLoad() {
		System.out.println("\n********After Loading Employee Object: "+ name);
	}
	
	@PreUpdate
	public void onPreUpdate() {
		System.out.println("\n***********Before Updating Employee Object: "+ name);
	}
	
	@PostUpdate
	public void onPostUpdate() {
		System.out.println("\n*********After Updating Employee Object: "+ name);
	}
	
	@PreRemove
	public void onPreRemove() {
		System.out.println("\n********Before removing Employee Object: " + name);
	}
	
	@PostRemove
	public void onPostRemove() {
		System.out.println("\n********After removing Employee Object: " + name);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
}
