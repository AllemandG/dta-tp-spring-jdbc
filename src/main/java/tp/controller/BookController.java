package tp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tp.entities.Book;
import tp.services.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;
	
	public BookController () {}
	
	public void rowsNumber () {
		System.out.println("Nombre de livres dans la table : " + service.rowsNumber());;
	}
	
	public void allBooks () {
		List<Book> books = service.allBooks();
		System.out.println("Liste des livres : ");
		for (Book b : books) {
			System.out.println(b);
		}
	}
	
	public void insert3 (Book book1, Book book2, Book book3) {
		service.insert3(book1, book2, book3);
	}
	
	public void insert3SameId (Book book1, Book book2, Book book3) {
		service.insert3SameId(book1, book2, book3);
	}
	
	public void insert3Sleep (Book book1, Book book2, Book book3) {
		service.insert3Sleep(book1, book2, book3);
	}
	
	public void insert(Book book) {
		service.insert(book);
	}
	
	public void update(Book book) {
		service.update(book);
	}
	
	public void delete(Book book) {
		service.delete(book);
	}
}
