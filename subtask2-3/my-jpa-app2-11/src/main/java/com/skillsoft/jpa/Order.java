package com.skillsoft.jpa;


import java.io.Serializable;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OrderColumn;

@Entity(name="Orders")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@OneToMany(mappedBy="order")
	private List<Product>products;

	public Order() {
		
	}

	public Order(Date orderDate) {
		
		this.orderDate = orderDate;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [Id=" + Id + ", orderDate=" + orderDate + "]";
	}

	
	
	
	
}
