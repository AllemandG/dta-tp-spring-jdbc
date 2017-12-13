package tp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tp.entities.Book;
import tp.entities.BookMapper;

@Repository
@Transactional
public class BookDAO extends GenericDAO<Book> {

	public BookDAO() {
		super(Book.class);
	}

	public int rowsNumber() {
		return this.jdbcTemplate.queryForObject("select count(*) from books", Integer.class);
	}

	public List<Book> allBooks() {
		return this.jdbcTemplate.query("select * from books", new BookMapper());
	}

	public void insert(Book book) {
		this.jdbcTemplate.update("insert into books values (?, ?, ?, ?, ?)", book.getTitle(),
				book.getNbPages(), book.getAuthor(), book.getPublicationDate(), book.getId());
	}
	
	public int nextSeq() {
		return this.jdbcTemplate.queryForObject("select nextval('books_id_seq')", Integer.class);
	}

	public void update(Book book) {
		this.jdbcTemplate.update(
				"update books set title = ?, nb_pages = ?, author = ?, publication_date = ? where id = ?",
				book.getTitle(), book.getNbPages(), book.getAuthor(), book.getPublicationDate(), book.getId());
	}

	public void delete(Book book) {
		this.jdbcTemplate.update("delete from books where id = ?", book.getId());
	}

}
