package com.network;
import java.net.*;
public class ServerD{

public static void main(String[] args) throws Exception
{
boolean condition=true;
ServerSocket s = new ServerSocket(22);
while(condition)
{
System.out.printf("/n Server D is Waiting For Client Request@22Port Number");
Socket ss = s.accept();
System.out.printf("/n Receieved Request From Client");
ss.close();
}
}
}
