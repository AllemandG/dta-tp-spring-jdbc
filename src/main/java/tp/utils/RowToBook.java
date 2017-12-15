package tp.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import tp.entities.Book;

public class RowToBook {
	private RowToBook () {}
	
	public static Book mapRow (ResultSet rs, int rowNum) throws SQLException {
		Book b = new Book();
		b.setId(rs.getLong("id"));
		b.setTitle(rs.getString("title"));
		b.setNbPages(rs.getInt("nb_pages"));
		b.setAuthor(rs.getString("author"));
		b.setPublicationDate(rs.getDate("publication_date"));
		return b;
	}
}
