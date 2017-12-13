package tp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.entities.Book;
import tp.repository.BookDAO;

@Service
@Transactional
public class BookService {
	@Autowired
	private BookDAO dao;
	
	public BookService () {}
	
	public int rowsNumber () {
		return dao.rowsNumber();
	}
	
	public List<Book> allBooks () {
		return dao.allBooks();
	}
	
	public void insert3 (Book book1, Book book2, Book book3) {
		book1.setId(dao.nextSeq());
		dao.insert(book1);
		book2.setId(dao.nextSeq());
		dao.insert(book2);
		book3.setId(dao.nextSeq());
		dao.insert(book3);
	}
	
	public void insert3SameId (Book book1, Book book2, Book book3) {
		try {
			book1.setId(dao.nextSeq());
			dao.insert(book1);
			book2.setId(book1.getId());
			dao.insert(book2);
			book3.setId(book2.getId());
			dao.insert(book3);
		} catch (Exception e) {}		
	}
	
	public void insert3Sleep (Book book1, Book book2, Book book3) {
		book1.setId(dao.nextSeq());
		dao.insert(book1);
		book2.setId(dao.nextSeq());
		dao.insert(book2);
		book3.setId(dao.nextSeq());
		dao.insert(book3);
		try {Thread.sleep(10000);} catch (InterruptedException e) {}
	}
	
	public void insert(Book book) {
		book.setId(dao.nextSeq());
		dao.insert(book);
	}
	
	public void update(Book book) {
		dao.update(book);
	}
	
	public void delete(Book book) {
		dao.delete(book);
	}
}
