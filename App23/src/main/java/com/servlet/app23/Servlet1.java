package com.servlet.app23;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="serv1",value="s1")
public class Servlet1 extends GenericServlet {
	public void service(ServletRequest request,ServletResponse response)throws IOException,ServletException{
		response.setContentType("text/HTML");
		PrintWriter pw=response.getWriter();
		System.out.println("Servlet1 service begin");
		pw.println("<h1>Servlet1 response begin");
		RequestDispatcher rd=request.getRequestDispatcher("view.html");
		rd.include(request,response);
		pw.println("<h1>Servlet1 response end");
		System.out.println("Servlet1 service end");
		pw.flush();
		pw.close();
	}

}
