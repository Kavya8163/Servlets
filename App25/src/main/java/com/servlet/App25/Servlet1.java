package com.servlet.App25;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="serv1",value="/s1")
public class Servlet1 extends GenericServlet {
	public void service(ServletRequest request,ServletResponse response)throws IOException,ServletException{
		response.setContentType("text/HTML");
		PrintWriter pw=response.getWriter();
		System.out.println("Servlet1 service begin");
		pw.println("<h1>Servlet1 res begin");
		RequestDispatcher rd=request.getRequestDispatcher("/s2");
		rd.include(request,response);
		pw.println("<h1>Servlet1 res end");
		System.out.println("Servlet1 service end");
		pw.flush();
		pw.close();
	}

}
