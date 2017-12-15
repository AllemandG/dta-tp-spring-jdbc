package tp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class GenericRepository<T> {
	private Class<T> klass;

	@PersistenceContext
	protected EntityManager em;

	public GenericRepository(Class<T> t) {
		this.klass = t;
	}

	protected Session getSession() {
		return em.unwrap(Session.class);
	}
	
	/*
	 * Ajoute l'objet entity dans la BDD
	 */
	public void persist(Object entity) {
		em.persist(entity);
	}
	
	/*
	 * Ajoute l'objet t dans la BDD
	 */
	public void add(T t) {
		em.persist(t);
	}
	
	/*
	 * Mets à jour l'objet t dans la BDD
	 */
	public void update(T t) {
		em.merge(t);
	}

	/*
	 * Renvoie in objet de type T avec comme id "id"
	 */
	public T findById(Long id) {
		return em.find(klass, id);
	}
	
	/*
	 * Supprime l'objet t de la base de donnée
	 * dans la table correspondant à la classe T
	 */
	public void delete(T t) {
		em.remove(em.merge(t));
	}
	
	/*
	 * Méthode retournant la liste de tous les éléments
	 * dans la table correspondant à la classe gérée T
	 */
	public List<T> getAll() {
		TypedQuery<T> query = em.createQuery("select b " + "from "+ klass.getName() +" b ", klass);
		return query.getResultList();
	}
}
