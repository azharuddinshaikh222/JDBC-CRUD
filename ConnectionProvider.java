package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
     
	private static Connection con;
	

	public static Connection getConeection() {
		try
		{
			if (con==null) {
				
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating a connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="root";
			 
			con=DriverManager.getConnection(url,username,password);
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return con;
	}
}


