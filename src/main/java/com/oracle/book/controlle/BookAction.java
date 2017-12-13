package com.oracle.book.controlle;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.HttpServerErrorException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.oracle.book.domain.Book;
import com.oracle.book.service.BookService;


@Controller
@Namespace("/")
@ParentPackage("struts-default")
@Action("bookAction")
@Results({
	@Result(name="success",location="/ListBooks.jsp")
})
public class BookAction extends ActionSupport {
	@Resource
	private BookService bookService;
	private List<Book> books;
	
	public List<Book> getBooks() {
		return books;
	}
	
	@Override
	public String execute() throws Exception {
		books=bookService.findbook();
		return SUCCESS;
	}
	
	
	
	
	
}
