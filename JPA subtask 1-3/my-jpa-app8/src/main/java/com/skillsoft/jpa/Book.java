package com.skillsoft.jpa;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Transient;


@Entity
public class Book{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String author;
	
	@Column(unique=true, nullable=false, length=55)
	private String title;
	
	@Column(precision=7, scale=4)
	private Float price;
	
	@Transient
	private boolean inStock;

	public Book() {
		
	}
	
	public Book( String title,String author, Float price) {
		super();
		this.author = author;
		this.title = title;
		this.price = price;
		
		this.inStock=true;
	}
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	
}