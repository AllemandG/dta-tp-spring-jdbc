//package tp.repository;
//
//import java.util.List;
//
//import org.springframework.jdbc.core.ResultSetExtractor;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import tp.entities.Book;
//import tp.utils.BookRowCallBackHandler;
//
//@Repository
//@Transactional
//public class BookDAO extends GenericDAO<Book> {
//
//	public BookDAO() {
//		super(Book.class);
//	}
//
//	public int rowsNumber() {
//		return this.jdbcTemplate.queryForObject("select count(*) from books", Integer.class);
//	}
//	
//	public String allBooksSet (ResultSetExtractor<String> rse) {
//		return this.jdbcTemplate.query("select * from books", rse);
//	}
//
//	public List<Book> allBooks() {
//		BookRowCallBackHandler callback = new BookRowCallBackHandler();
//		this.jdbcTemplate.query("select * from books", callback);
//		return callback.getAllBooks();
//	}
//	
//	public List<Book> booksFromAuthor(String... authors) {
//		BookRowCallBackHandler callback = new BookRowCallBackHandler();
//		this.jdbcTemplate.query("select * from books", callback);
//		return callback.booksByAuthor(authors);
//	}
//	
//	public List<String> getAuthors() {
//		BookRowCallBackHandler callback = new BookRowCallBackHandler();
//		this.jdbcTemplate.query("select * from books", callback);
//		return callback.getAllAuthors();
//	}
//
//	public void insert(Book book) {
//		this.jdbcTemplate.update("insert into books values (?, ?, ?, ?, ?)", book.getTitle(),
//				book.getNbPages(), book.getAuthor(), book.getPublicationDate(), book.getId());
//	}
//	
//	public int nextSeq() {
//		return this.jdbcTemplate.queryForObject("select nextval('books_id_seq')", Integer.class);
//	}
//
//	public void update(Book book) {
//		this.jdbcTemplate.update(
//				"update books set title = ?, nb_pages = ?, author = ?, publication_date = ? where id = ?",
//				book.getTitle(), book.getNbPages(), book.getAuthor(), book.getPublicationDate(), book.getId());
//	}
//
//	public void delete(Book book) {
//		this.jdbcTemplate.update("delete from books where id = ?", book.getId());
//	}
//
//}
