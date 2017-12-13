package com.oracle.book.controlle;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.oracle.book.domain.Book;
import com.oracle.book.service.BookService;


@Controller
@Namespace("/")
@ParentPackage("struts-default")
@Action("bookUpdateAction")
@Results({
	@Result(name="success",location="BookUpdateSucc.jsp"),
	@Result(name="input",location="BookUpdate.jsp")
})
public class BookUpdateAction extends ActionSupport{
	private int id;
	private String bookname;
	private String classname;
	private String author;
	private String discount;
	private float price;
	private int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@RequiredStringValidator(key="bookname.error.null",trim=true,shortCircuit=true)
    @StringLengthFieldValidator(key="bookname.error.len",trim=true,minLength="2",maxLength="10")

	public String getClassname() {
		return classname;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	 @RequiredStringValidator(key="author.error.null",trim=true)
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
    @DoubleRangeFieldValidator(key="price.error.range",minInclusive="20.00",maxInclusive="50.00")
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@IntRangeFieldValidator(key="booknum.error.range",min="10",max="50")
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	@Resource
	private BookService bookService;
	@Override
	public String execute() throws Exception {
		Book book=new Book(id,bookname,classname, author, price, discount, num);
		bookService.updateBook(book, id);
		return SUCCESS;
	}
}
