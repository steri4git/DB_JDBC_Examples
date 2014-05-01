package de.steri.jdbc.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.steri.jdbc.domain.Person;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person pers = new Person();
		pers.setAlter(rs.getString("Alter"));
		pers.setId(rs.getInt("Id"));
		pers.setAlter(rs.getString("NameE"));
		pers.setVorname(rs.getString("Vorname"));
		return pers;
	}
}
