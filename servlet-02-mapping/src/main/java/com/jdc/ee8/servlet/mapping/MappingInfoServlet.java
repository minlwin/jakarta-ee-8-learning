package com.jdc.ee8.servlet.mapping;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({
	"/path/*",
	"/*.ext"
})
public class MappingInfoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpServletMapping mapping = req.getHttpServletMapping();
		req.setAttribute("mapping", mapping);
		getServletContext().getRequestDispatcher("/result.jsp").forward(req, resp);
	}

}
