package com.skillsoft.jpa;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class EmployeeListener {

	@PrePersist
	public void onPrePersist(Employee employee) {
		System.out.println("\n********Before Persisting Employee: "+ employee.getName());
	}
	

	@PostPersist
	public void onPostPersist(Employee employee) {
		System.out.println("\n********After Persisting Employee: "+ employee.getName());
	}

	@PostLoad
	 void onPostLoad(Employee employee) {
		System.out.println("\n********After Loading Employee Object: "+ employee.getName());
	}
	
	@PreUpdate
	 void onPreUpdate(Employee employee) {
		System.out.println("\n***********Before Updating Employee Object: "+ employee.getName());
	}
	
	@PostUpdate
	void onPostUpdate(Employee employee) {
		System.out.println("\n*********After Updating Employee Object: "+ employee.getName());
	}
	
	@PreRemove
	void onPreRemove(Employee employee) {
		System.out.println("\n********Before removing Employee Object: " + employee.getName());
	}
	
	@PostRemove
	void onPostRemove(Employee employee) {
		System.out.println("\n********After removing Employee Object: " + employee.getName());
	}

}
