package com.skillsoft.jpa;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.GregorianCalendar;

@Entity
public class Book {

	
	private Integer id;
	private String title;
	private String author;
	
	private Float price;

	public Book() {
		
	}

	public Book( String title, String author, Float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Id
	//@GeneratedValue
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name="bookstore_seq", sequenceName="BOOK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator="bookstore_seq")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
