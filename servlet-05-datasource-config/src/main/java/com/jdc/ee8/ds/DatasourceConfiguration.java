package com.jdc.ee8.ds;

import javax.annotation.sql.DataSourceDefinition;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@DataSourceDefinition(
		name = "java:app/AppDB",
		url = "jdbc:hsqldb:file:database/db",
		user = "sa",
		password = "sa",
		className = "javax.sql.DataSource")
public class DatasourceConfiguration {

}
