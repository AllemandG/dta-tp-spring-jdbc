package tp.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tp.entities.Book;

@SuppressWarnings("rawtypes")
@Repository
@Transactional
public class BookRepository extends GenericRepository<Book>{
	@SuppressWarnings("unchecked")
	public BookRepository () {
		super(Book.class);
	}
	
	public Long rowsNumber() {
		return ((BigInteger)em.createNativeQuery("select count(*) from books").getSingleResult()).longValue();
	}
	
	public String allBooksSet (ResultSetExtractor<String> rse) {
		return null;
	}
	
	public List<Book> booksFromAuthor(String... authors) {
		return null;
	}
	
	public List<String> getAuthors() {
		return null;
	}
	
	public Long nextSeq() {
		return ((BigInteger) em.createNativeQuery("select nextval('books_id_seq')").getSingleResult()).longValue();
	}
	
}
