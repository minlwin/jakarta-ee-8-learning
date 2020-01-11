package com.jdc.ee8.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@ServletSecurity(
		@HttpConstraint(
				transportGuarantee = TransportGuarantee.CONFIDENTIAL,
				rolesAllowed = "ADMIN"
		)
)
@WebServlet(urlPatterns = "/admin", loadOnStartup = 1)
public class AdminServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Resource(lookup = "java:app/securityDS")
	private DataSource ds;
	
	@Inject
	private Pbkdf2PasswordHash hash;
	
	@Override
	public void init() throws ServletException {
		
		String createTable = "create table USER ("
				+ "login VARCHAR(30) PRIMARY KEY, "
				+ "password VARCHAR(255), "
				+ "role VARCHAR(20)"
				+ ");";
		
		String insert = "insert into USER values (?, ?, ?)";
		
		try(Connection conn = ds.getConnection()) {
			
			try(PreparedStatement stmt = conn.prepareStatement(createTable)) {
				stmt.executeUpdate();
			}
			
			try(PreparedStatement stmt = conn.prepareStatement(insert)) {
				stmt.setString(1, "admin");
				stmt.setString(2, hash.generate("admin".toCharArray()));
				stmt.setString(3, "ADMIN");
				stmt.executeUpdate();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
