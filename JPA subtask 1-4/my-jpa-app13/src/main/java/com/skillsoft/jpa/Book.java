package com.skillsoft.jpa;

public class Book{
	
	private Integer id;
	
	private String author;
	
	private String title;
	
	private Float price;

	public Book() {
		super();
	}

	public Book( String title,String author, Float price) {
		super();
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
	
}