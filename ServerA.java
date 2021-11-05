package com.network;
import java.net.*;
public class ServerA{

public static void main(String[] args) throws Exception
{
boolean condition=true;
ServerSocket s = new ServerSocket(9092);
while(condition)
{
System.out.printf("/n Server A is Waiting For Client Request@9092Port Number");
Socket ss = s.accept();
System.out.printf("/n Receieved Request From Client");
ss.close();
}
}
}
