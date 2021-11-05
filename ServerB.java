package com.network;
import java.net.*;
public class ServerB{

public static void main(String[] args) throws Exception
{
boolean condition=true;
ServerSocket s = new ServerSocket(82);
while(condition)
{
System.out.printf("/n Server B is Waiting For Client Request@82Port Number");
Socket ss = s.accept();
System.out.printf("/n Receieved Request From Client");
ss.close();
}
}
}
