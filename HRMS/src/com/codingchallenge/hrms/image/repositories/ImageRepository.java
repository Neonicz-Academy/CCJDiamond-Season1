package com.codingchallenge.hrms.image.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageRepository {

	public String getImagePath(Long empId) {
		Connection con = null;
		String image = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hrms";
			con = DriverManager.getConnection(url,"root","123456789");
			String viewemployee = "SELECT image FROM employee WHERE empId=? ";				
			PreparedStatement stmt = con.prepareStatement(viewemployee);
			stmt.setLong(1, empId);
			ResultSet rs = stmt.executeQuery();
			
			
			System.out.println("before while loop" );
			while(rs.next()) {
			
				 image = rs.getString("image");
				
		}
			con.close();
//			System.out.println("after" + row.size());
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
		
		return image;
	}

}
