package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {
public static void main(String[] args) {
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
String q="insert into image(pic) values(?)";
PreparedStatement pstmt=con.prepareStatement(q);
//pstmt.setString(1,"value");
FileInputStream fis= new FileInputStream("c://mypic.jpg.jpg");
pstmt.setBinaryStream(1, fis,fis.available());
pstmt.executeUpdate();
System.out.println("image inserted succsessfully");
con.close();
}catch(Exception e)
{
	e.printStackTrace();
}
}
}
