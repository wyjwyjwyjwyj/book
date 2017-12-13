package com.oracle.book.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private	int id;
	private String bookname;
	private String author;
	private String classname;
	private float price;
	private String discount;
	private int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Book() {
		super();

	}
	public Book(int id, String bookname, String author, String classname, float price, String discount, int num) {
	
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.classname = classname;
		this.price = price;
		this.discount = discount;
		this.num = num;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Book(String bookname, String author, String classname, float price, String discount, int num) {
		this.bookname = bookname;
		this.author = author;
		this.classname = classname;
		this.price = price;
		this.discount = discount;
		this.num = num;
	}
	public Book(int id, String bookname, String author, float price, String discount, int num) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.discount = discount;
		this.num = num;
	}
	public Book(String bookname, String author, float price, String discount, int num) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.discount = discount;
		this.num = num;
	}

	
	
	
}
