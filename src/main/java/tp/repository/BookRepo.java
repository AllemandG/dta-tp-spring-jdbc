//package tp.repository;
//
//import java.math.BigInteger;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//
//import org.hibernate.Session;
//import org.springframework.jdbc.core.ResultSetExtractor;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import tp.entities.Book;
//
//@Repository
//@Transactional
//public class BookRepo {
//	
//	@PersistenceContext
//	protected EntityManager em;
//	
//	public BookRepo () {}
//
//	protected Session getSession() {
//		return em.unwrap(Session.class);
//	}
//
//	public void persist(Object entity) {
//		em.persist(entity);
//	}
//	
//	public long rowsNumber() {
//		return ((BigInteger)em.createNativeQuery("select count(*) from books").getSingleResult()).longValue();
//	}
//	
//	public String allBooksSet (ResultSetExtractor<String> rse) {
//		return null;
//	}
//	
//	public List<Book> booksFromAuthor(String... authors) {
//		return null;
//	}
//	
//	public List<String> getAuthors() {
//		return null;
//	}
//	
//	public Long nextSeq() {
//		return ((BigInteger) em.createNativeQuery("select nextval('books_id_seq')").getSingleResult()).longValue();
//	}
//
//	public void add(Book t) {
//		em.persist(t);
//	}
//
//	public void update(Book t) {
//		em.merge(t);
//	}
//
//	public Book findById(Long id) {
//		return em.find(Book.class, id);
//	}
//
//	public void delete(Book t) {
//		em.remove(t);
//	}
//
//	public List<Book> getAll() {
//		TypedQuery<Book> query = em.createQuery("select b " + "from Book b ", Book.class);
//		return query.getResultList();
//	}
//}
