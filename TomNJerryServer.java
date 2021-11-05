package com.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TomNJerryServer {
	public  static void main(String[] args)throws Exception
	{
		ServerSocket s = new ServerSocket(9091);
		boolean b = true;
		while(b)
		{
			System.out.printf("\nTomNJerryServer waiting for client Request at port Num:9091");
			Socket ss =s.accept();
			System.out.printf("\n received http request And Sending http Respnse");
			InputStream in =ss.getInputStream();
			Scanner sc = new Scanner(in);
			String reqLine = sc.nextLine();
			StringTokenizer st = new StringTokenizer(reqLine);
			String reqType = st.nextToken();
			String uri = st.nextToken();
			String protocol =st.nextToken();
			uri ="c:\\tomnjerry\\webapps"+uri;
			String mimeType ="";
			if(uri.endsWith("jpeg")||uri.endsWith("jpg"))
			{
				mimeType ="image/jpeg";
				System.out.println(mimeType);
			}
			String htmlDoc="";
			try
			{
				File f = new File(uri);
				FileInputStream fin = new FileInputStream(uri);
				int ch =0;
				ch = fin.read();
				while(ch!=-1)
				{
					htmlDoc+=(char)ch;
					ch = fin.read();
					
				}
				
			}
			catch(FileNotFoundException e)
			{
				htmlDoc ="<h1>ResorceNot Found";
				
			}
			
			
		//prepare PrintStream to give Resoponse
			OutputStream out =ss.getOutputStream();
			PrintStream ps = new PrintStream(out);
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
		}

}
