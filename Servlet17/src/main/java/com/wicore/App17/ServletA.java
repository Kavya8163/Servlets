package com.wicore.App17;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletA extends GenericServlet {
	@Override
	public void service(ServletRequest request,ServletResponse response)throws IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Map m = request.getParameterMap();
		String a[] =(String[])m.get("x");
		String b[] =(String[])m.get("y");
		pw.println("<h1>");
		pw.println("<br><u>x</u>");
		for(int i =0;i<a.length;i++)
			
		pw.println("<br>"+a[i]);
		
		pw.println("<br><u>y</u>");
		for(int i =0;i<b.length;i++)
			
			pw.println("<br>"+b[i]);
		pw.flush();
		pw.close();
	}
}
			
		