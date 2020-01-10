package com.jdc.ee8.ds;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.enterprise.context.ApplicationScoped;
import javax.sql.DataSource;

@ApplicationScoped
@DataSourceDefinition(
		name = "java:app/AppDB",
		url = "jdbc:hsqldb:file:database/db",
		user = "sa",
		password = "sa",
		className = "javax.sql.DataSource")
public class DatasourceConfiguration {
	
	@Resource(lookup = "java:app/AppDB")
	private DataSource dataSource;

	@PostConstruct
	private void init() {
		
	}
}
