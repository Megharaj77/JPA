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
import javax.persistence.OrderBy;

@Entity(name="Orders")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@OneToMany
	@JoinColumn(name="order_id")
	@OrderBy("name ASC")
	private List<Product>products;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;

	public Order() {
		
	}

	public Order(List<Product> products, Date orderDate) {
		super();
		this.products = products;
		this.orderDate = orderDate;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [Id=" + Id + ", products=" + products + ", orderDate=" + orderDate + "]";
	}

	
	
	
}
