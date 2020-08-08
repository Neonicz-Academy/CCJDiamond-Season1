package com.codingchallenge.hrms.login.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginRepository {
	
	public boolean findUser(Long loginUserName,String loginPassword,String loginUserRole) {
	
		System.out.println("inside findUser");
		System.out.println(loginUserName);
		System.out.println(loginPassword);
		System.out.println(loginUserRole);
		
		Connection con = null;
		boolean successful = false;
		
		try {
			System.out.println("inside try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hrms";
			con = DriverManager.getConnection(url,"root","123456789");
			System.out.println("inside database");
			System.out.println(loginUserName);
			System.out.println(loginPassword);
			System.out.println(loginUserRole);
			
			String selectQuery = "SELECT userName FROM login  WHERE userName=? AND password=? AND userRole=? ";
			
			
			PreparedStatement stmt = con.prepareStatement(selectQuery);
			System.out.println(loginUserRole);
			stmt.setLong(1,loginUserName);
			stmt.setString(2,loginPassword);
			stmt.setString(3,loginUserRole);
			
			
			int size = 0;
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("userName"));
//				rs.last();
				size = rs.getRow();
//				size++;
				if(rs.getString("userName") != null) {
					successful = true;
//					System.out.println("UseName" + rs.getString("userName"));
				}
				
			}
			
			
			if(successful == true)  {
				System.out.println("There is a user");
			}
			else {
				System.out.println("No user found.");
				successful = false;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return successful;
		
			}
	

}
