package com.skillsoft.jpa;

import javax.persistence.Entity;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import javax.persistence.IdClass;


//@Entity
//public class Book {
//
////	@Id
//	@EmbeddedId
//	private BookKey bookKey;
//	
//	private String author;
//	private String title;
//	
//	
//	public Book() {
//	
//	}
//
//
//	public Book( String title ,String author, Float price) {
//		
//		this.bookKey = new BookKey(title,price);
//		this.author = author;
//		this.title = title;
//	}
//
//
//	public BookKey getBookKey() {
//		return bookKey;
//	}
//
//
//	public void setBookKey(BookKey bookKey) {
//		this.bookKey = bookKey;
//	}
//
//
//	public String getAuthor() {
//		return author;
//	}
//
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//
//	public String getTitle() {
//		return title;
//	}
//
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	
//	
//	
//}



/*using Id class*/

@Entity
@IdClass(value=BookKey.class)
public class Book{
	
	@Id
	private Integer titleHash;
	@Id
	private Float price;
	
	private String author;
	private String title;
	
	
	public Book() {
	
	}
	
	public Book(String title, String author, Float price) {
		this.author=author;
		this.title=title;
		
		this.titleHash=Objects.hash(title);
		this.price=price;
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
	
	
}
