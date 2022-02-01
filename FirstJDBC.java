package com.jdbc;
import java.sql.*;
public class FirstJDBC {
public static void main(String[] args) {
	try
	{
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//creating a connection
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="root";
		 

		Connection con=DriverManager.getConnection(url,username,password);
		if(con.isClosed())
		{
			System.out.println("onnection is closed");
		}else
		{
			System.out.println("connection is ready");
		}
	} 
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
