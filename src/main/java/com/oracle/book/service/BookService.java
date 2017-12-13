package com.oracle.book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oracle.book.dao.BookDAO;
import com.oracle.book.domain.Book;


@Service
public class BookService {
	@Resource
	private BookDAO bookDAO;
	public void saveBook(Book book) {
		bookDAO.saveBook(book);
	}
	public Book getbook(int id) {
		return bookDAO.getBook(id);

	}
	public List<Book> findbook() {
		return bookDAO.findBook();

	}
	public void deleteBook(int id){
		bookDAO.deleteBook(id);
	}
	public void updateBook(Book book,int id){
		bookDAO.updateBook(book, id);
	}
}
