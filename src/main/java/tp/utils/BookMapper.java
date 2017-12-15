package tp.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tp.entities.Book;

public final class BookMapper implements RowMapper<Book>{
	public BookMapper() {}

	public Book mapRow (ResultSet rs, int rowNum) throws SQLException {
		return RowToBook.mapRow(rs, rowNum);
	}
	
}
