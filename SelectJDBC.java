package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Connection con=ConnectionProvider.getConeection();
	String query="select * from table1";
	Statement stmt=con.createStatement();
	 ResultSet set=stmt.executeQuery(query);
	 
	 while(set.next())
	 {
		 int id=set.getInt(1);
		 String name=set.getString(2);
		 String city=set.getString(3);
		 System.out.println(name + ","+id+","+city); 
	 }
	 con.close();
}catch(Exception e)
{
	e.printStackTrace();
}
	}

}
