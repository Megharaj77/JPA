package com.skillsoft.jpa;

import java.io.Serializable;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class DepartmentListener {

	@PrePersist
	public void onPrePersist(Department department) {
		System.out.println("\n********Before Persisting Department Object: "+ department.getName());
	}
	

	@PostPersist
	public void onPostPersist(Department department) {
		System.out.println("\n********After Persisting Department Object: "+ department.getName());
	}
	
	
	
	@PostLoad
	void onPostLoad(Department department) {
		System.out.println("\n********After Loading Department Object: "+ department.getName());
	}
	
	@PreUpdate
	void onPreUpdate(Department department) {
		System.out.println("\n***********Before Updating Department Object: "+ department.getName());
	}
	
	@PostUpdate
	void onPostUpdate(Department department) {
		System.out.println("\n*********After Updating Department Object: "+ department.getName());
	}
	
	@PreRemove
	void onPreRemove(Department department) {
		System.out.println("\n********Before removing Department Object: " + department.getName());
	}
	
	@PostRemove
	void onPostRemove(Department department) {
		System.out.println("\n********After removing Department Object: " + department.getName());
	}
}
