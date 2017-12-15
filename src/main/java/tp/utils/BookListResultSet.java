package tp.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class BookListResultSet implements ResultSetExtractor<String> {

	@Override
	public String extractData(ResultSet rs) throws SQLException, DataAccessException {
		StringBuilder builder = new StringBuilder();
		while (rs.next()) {
			builder.append(rs.getInt("id"));
			builder.append(";\"");
			builder.append(rs.getString("title"));
			builder.append("\";");
			builder.append(rs.getInt("nb_pages"));
			builder.append(";\"");
			builder.append(rs.getString("author"));
			builder.append("\";");
			builder.append(rs.getDate("publication_date"));
			builder.append("\n\r");
		}
		
		return builder.toString();
	}

}
