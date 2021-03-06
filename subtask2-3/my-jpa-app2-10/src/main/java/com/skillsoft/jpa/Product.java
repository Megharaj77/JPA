package com.skillsoft.jpa;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity(name="Products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Integer quantity;
	
    @ManyToOne
    @JoinTable(name="products_orders",
    joinColumns={@JoinColumn(name="product_id",referencedColumnName="id")},
    inverseJoinColumns={@JoinColumn(name="order_id", referencedColumnName="id")}
    )
	private Order order;

	public Product() {
		
	}

	public Product(Order order,String name, Integer quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
