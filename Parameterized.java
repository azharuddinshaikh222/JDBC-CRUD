package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Parameterized {
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
				//creating a parameterized query
				String q="insert into table1(tName,tCity) values (?,?)";
				       PreparedStatement pstmt=con.prepareStatement(q);
				       //set the values by query
				       pstmt.setString(1, "azhar shaikh");
				       pstmt.setString(2, "Mumbai");
				       pstmt.executeUpdate();
				       System.out.println("inserted");
				       con.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
