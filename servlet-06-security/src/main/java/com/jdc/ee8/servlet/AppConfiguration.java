package com.jdc.ee8.servlet;

import javax.annotation.sql.DataSourceDefinition;
import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;

@DataSourceDefinition(
		name = "java:app/securityDS",
		className = "org.hsqldb.jdbc.JDBCDataSource",
		url = "jdbc:hsqldb:mem:securityDB",
		user = "sa", password = "sa"
)
@DatabaseIdentityStoreDefinition(
		dataSourceLookup = "java:app/securityDS",
		callerQuery = "select password from USER where login = ?",
		groupsQuery = "select role from USER where login = ?"
)
@FormAuthenticationMechanismDefinition(
		loginToContinue = @LoginToContinue(
				loginPage = "/login.jsp",
				errorPage = "/login-error.jsp"
		)
)
@ApplicationScoped
public class AppConfiguration {

}
