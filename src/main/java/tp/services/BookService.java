package tp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.entities.Book;
import tp.repository.BookRepository;
import tp.utils.BookListResultSet;
import tp.utils.BookToCSV;

@Service
@Transactional
public class BookService {
	@Autowired
	private BookRepository dao;
	
	public BookService () {}
	
	public long rowsNumber () {
		return dao.rowsNumber();
	}
	
	public List<Book> allBooks () {
		return dao.getAll();
	}
	
	public List<Book> booksFromAuthor(String... authors) {
		return dao.booksFromAuthor(authors);
	}
	
	public List<String> getAuthors() {
		return dao.getAuthors();
	}
	
	public void insert3 (Book book1, Book book2, Book book3) {
		dao.add(book1);
		dao.add(book2);
		dao.add(book3);
	}
	
	public void insert3Sleep (Book book1, Book book2, Book book3) {
		dao.add(book1);
		dao.add(book2);
		dao.add(book3);
		try {Thread.sleep(10000);} catch (InterruptedException e) {}
	}
	
	public void allBooksToCSV () {
		BookListResultSet bookList = new BookListResultSet();
		BookToCSV.booksToCSV(dao.allBooksSet(bookList));
	}
	
	public void insert(Book book) {
		book.setId(dao.nextSeq());
		dao.add(book);
	}
	
	public void update(Book book) {
		dao.update(book);
	}
	
	public void delete(Book book) {
		dao.delete(book);
	}
	
	public Book getById (Long id) {
		return dao.findById(id);
	}
}
