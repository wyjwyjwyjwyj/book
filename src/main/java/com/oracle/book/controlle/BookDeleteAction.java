package com.oracle.book.controlle;



import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.book.service.BookService;

@Controller
@Namespace("/")
@ParentPackage("struts-default")
@Action("bookDeleteAction")
@Results({
	@Result(name="success",location="/BookDelete.jsp")
})
public class BookDeleteAction extends ActionSupport{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Resource
	private BookService bookService;
	@Override
	public String execute() throws Exception {
		bookService.deleteBook(id);
		return SUCCESS;
	}
	
}
