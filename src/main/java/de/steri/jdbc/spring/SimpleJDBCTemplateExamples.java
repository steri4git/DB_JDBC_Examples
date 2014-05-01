package de.steri.jdbc.spring;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import de.steri.jdbc.domain.Person;

@Transactional
public class SimpleJDBCTemplateExamples {

	private JdbcTemplate jdbcTemplate;
	private HashMap<String, String> queries;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public HashMap<String, String> getQueries() {
		return queries;
	}

	public void setQueries(HashMap<String, String> queries) {
		this.queries = queries;
	}

	@Transactional
	@Rollback(false) 
	public int readDataInt() {
		return jdbcTemplate.queryForInt(queries.get("COUNT"));
	}
	
	@Transactional
	@Rollback(false) 
	public void readDataList() {
		System.out.println(jdbcTemplate.queryForList(queries.get("SELECT_ALL")));
	}
	
	public void readDataWithRowMapper (){
		System.out.println("START QUERY");
		System.out.println(jdbcTemplate.queryForObject("SELECT_WITH_ID", new PersonRowMapper()));
	}
	
	
	
}

