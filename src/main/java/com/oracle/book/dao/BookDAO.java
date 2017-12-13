package com.oracle.book.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.book.domain.Book;

@Repository
public class BookDAO {
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	//插入数据 
	public void saveBook(final Book book) {
		hibernateTemplate.execute(new HibernateCallback<Book>() {
			@Override
			public Book doInHibernate(Session session) throws HibernateException {
				session.save(book);
				return null;
			}
		});

	}
	
	//根据ID查询数据
	public Book getBook(int id) {
		return hibernateTemplate.get(Book.class, id);

	}
	
	//查询所有信息
	public List<Book> findBook() {
		
		return hibernateTemplate.execute(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				String hql="from Book";
				Query query=session.createQuery(hql);
				List list=query.list();
				return list;
			}
		});
		
	}
	
	//删除信息
	public void deleteBook(final int id){
		hibernateTemplate.execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				String hql="delete from Book where id = ?";
				Query query=session.createQuery(hql);
				query.setInteger(0, id);
				query.executeUpdate();
				return null;
			}
		});
	}
	
	//更新数据
	public void updateBook(final Book book,final int id) {
		hibernateTemplate.execute(new HibernateCallback<Book>() {
			@Override
			public Book doInHibernate(Session session) throws HibernateException {
				String hql="update Book set bookName=?,classname=?,author=?,discount=?,price=?,num=?,id=?";
				Query query=session.createQuery(hql);
				query.setString(0, book.getBookname());
				query.setString(1, book.getClassname());
				query.setString(2,book.getAuthor());
				query.setFloat(3, book.getPrice());
				query.setString(4, book.getDiscount());
				query.setInteger(5, book.getNum());
				query.setInteger(6, book.getId());
				query.executeUpdate();	
				return null;
			}
		});

	}
	
	
	
	

}
