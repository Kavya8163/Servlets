package com.network;


import java.io.*;
import java.net.*;
public class HttpResponse{
public static void main(String[] args)throws Exception{
ServerSocket s = new ServerSocket(9090);

boolean b=true;
while(b)
{
	
System.out.printf("\nwaiting for Client At port Num:9090");
Socket ss =s.accept();
System.out.printf("\nReceived http Request And Sending Http Response");
OutputStream out =ss.getOutputStream();
PrintStream ps = new PrintStream(out);
String htmlDoc="";
htmlDoc="<html>\n"
+"<body bgcolor =RED\n"
		+"<h1>hii,Welcome to MyServer\n"
		+"<body>\n"
		+"<html>\n";
String rMsg ="";
rMsg ="HTTP/1.1 200 OK\n"
+"Date:Fri,24Jun 2011 07:58:58GMT\n"
		+"Server:HttpResponse/1.0.0\n"
+"AcceptRanges:bytes\n"
		+"\n"
+htmlDoc;
ps.print(rMsg);
ps.close();
ss.close();
}
}}
