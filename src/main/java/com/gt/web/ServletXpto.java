package com.gt.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletXpto extends HttpServlet {

	public void init() throws ServletException {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println(this.getClass().getName() + " doGet() ");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>page A</title></title>");
		out.println("<body>");
		out.println("<h1>Title 1</h1>");
		out.println("bla bla bla");
		out.println("</body></html>");

	}

	public void destroy() {
	}

}