package tp.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;

import tp.entities.Book;

public class BookRowCallBackHandler implements RowCallbackHandler{
	private List<Book> books;
	private List<String> authors;
	
	public BookRowCallBackHandler() {
		books = new ArrayList<Book>();
		authors = new ArrayList<String>();
	}

	@Override
	public void processRow(ResultSet rs) throws SQLException {
		int rowNum = 1;
		do {
			Book b = RowToBook.mapRow(rs, rowNum);
			books.add(b);
			if (!authorIn(b)) {
				authors.add(b.getAuthor());
			}
			rowNum++;
		} while (rs.next());
	}
	
	private boolean authorIn(Book b) {
		boolean inside = false;
		if (b != null) {
			inside = authors.contains(b.getAuthor());
		}
		return inside;
	}
	
	public List<Book> booksByAuthor(String... authors){
		List<Book> result = new ArrayList<Book>();
		for (String a : authors) {
			if (this.authors.contains(a)) {
				result.addAll(booksFrom(a));
			}
		}
		return result;
	}
	
	private List<Book> booksFrom (String author) {
		List<Book> list = new ArrayList<Book>();
		for (Book b : books) {
			if (b.getAuthor().equals(author)) {
				list.add(b);
			}
		}
		return list;
	}
	
	public List<Book> getAllBooks () { return books; }
	public List<String> getAllAuthors () { return authors; }

}
