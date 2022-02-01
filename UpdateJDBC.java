package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	Connection connection=ConnectionProvider.getConeection();
    	String q="update table1 set tName=?,tCity=? where tid=?";
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter your name:");
    	String name=br.readLine();
    	System.out.println("Enter your city:");
    	String city=br.readLine();
    	System.out.println("Enter your id:");
    	int id=Integer.parseInt(br.readLine());
    	PreparedStatement pstmt = connection.prepareStatement(q);
    	pstmt.setString(1, name);
    	pstmt.setString(2, city);
    	pstmt.setInt(3, id);
    	pstmt.executeUpdate();
    	System.out.println("updated succesessfully");
    	connection.close();
    	
      }catch(Exception e)
      {
    	  e.printStackTrace();      }
	}
	}


