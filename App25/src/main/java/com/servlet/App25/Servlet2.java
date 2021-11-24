package com.servlet.App25;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="serv2",value="/s2")
public class Servlet2 extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response)throws IOException{
		response.setContentType("text/HTML");
		PrintWriter pw=response.getWriter();
		System.out.println("Servlet2 service begin");
		pw.println("<h1>Servlet2 res begin");
		pw.println("<h1>Servlet2 res end");
		System.out.println("Servlet2 service end");
	}

}
