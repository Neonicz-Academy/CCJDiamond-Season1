package com.codingchallenge.hrms.employee.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
	
	public List<Map<String,String>> getEmployeeProfile(Long empId){
		
 		Connection con = null;
		List<Map<String,String>> employeeProfile = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hrms";
			con = DriverManager.getConnection(url,"root","123456789");
			String employee = "SELECT * FROM employee  WHERE empId = ?";				
			PreparedStatement stmt = con.prepareStatement(employee);
			stmt.setLong(1,empId);
			ResultSet rs = stmt.executeQuery();
			
			employeeProfile = new ArrayList<Map<String,String>>();
			System.out.println("before while loop" );
			while(rs.next()) {
				System.out.println("after select employe:" + rs.getString("firstName") );
				Map<String,String> row = new HashMap<String,String>();
				row.put("empId",rs.getString("empId"));
				row.put("firstName",rs.getString("firstName"));
				row.put("lastName",rs.getString("lastName"));
				row.put("email",rs.getString("email"));
				row.put("phone",rs.getString("phone"));
				row.put("gender",rs.getString("gender"));
				row.put("dateOfJoining",rs.getString("dateOfJoining"));
				row.put("dateOfBirth",rs.getString("dateOfBirth"));
				row.put("jobTitle",rs.getString("jobTitle"));
				row.put("department",rs.getString("department"));
				row.put("address",rs.getString("address"));
				employeeProfile.add(row);
			}
			con.close();
			System.out.println("after" + employeeProfile.size());
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
		
		return employeeProfile;
		
	}
}
