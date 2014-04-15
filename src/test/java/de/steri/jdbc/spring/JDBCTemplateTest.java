package de.steri.jdbc.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "/application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class JDBCTemplateTest {

	@Autowired
	private SimpleJDBCTemplateExamples simpleJDBCTemplateExamples;

	@Test
	public void readDataIntTest() {
		simpleJDBCTemplateExamples.readDataInt();

	}
	@Test
	public void readDataListTest() {
		simpleJDBCTemplateExamples.readDataList();

	}
}
