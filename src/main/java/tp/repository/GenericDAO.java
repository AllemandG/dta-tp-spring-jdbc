//package tp.repository;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//
//public class GenericDAO<T> {
//	private Class<T> klass;
//	protected JdbcTemplate jdbcTemplate;
//	
//	public GenericDAO(Class<T> t) {
//		this.klass = t;
//	}
//
//	@Autowired
//	public void setDataSource(DataSource ds) {
//		this.jdbcTemplate = new JdbcTemplate(ds);
//	}
//
//	
//}
