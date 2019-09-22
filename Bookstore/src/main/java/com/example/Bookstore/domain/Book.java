package com.example.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Book {
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private long year;
	private String author;
	private long isbn;
	private long price;
	
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "categoryid")
    private Category category;
	
	public Book() {
		super();
	}
	
	public Book(String title, long year, String author, long isbn, long price, Category category) {
		this.title = title;
		this.year = year;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}

	public void setDepartment(Category category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		if (this.category != null)
			return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + " category =" + this.getCategory() + "]";		
		else
			return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}

}

