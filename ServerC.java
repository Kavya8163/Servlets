package com.network;
import java.net.*;
public class ServerC{

public static void main(String[] args) throws Exception
{
boolean condition=true;
ServerSocket s = new ServerSocket(444);
while(condition)
{
System.out.printf("/n Server C is Waiting For Client Request@444Port Number");
Socket ss = s.accept();
System.out.printf("/n Receieved Request From Client");
ss.close();
}
}
}
