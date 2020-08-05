package com.codingchallenge.hrms.leave.repositories;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;



public class LeaveRepository {
	public Boolean saveLeaveApplication(Long empId,String leaveType, String reason,String date,Long noOfDays,Long status ) {
		System.out.println("inside saveapplication");
//		System.out.println(empId);
		Connection con = null;
		boolean successful = false;
		try {
			System.out.println("inside try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hrms";
			con = DriverManager.getConnection(url,"root","123456789");
			System.out.println("inside database");
			
			// current date into Created On.
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date created_date = new Date();
			String createdOn = dateFormat.format(created_date);
			System.out.println(createdOn);
			
			String leaveApplication = "INSERT INTO leave_application(empId,leaveType,date,noOfDays,reason,status,createdOn)"
			           +" VALUES(?,?,?,?,?,?,?)";	
			
			PreparedStatement stmt = con.prepareStatement(leaveApplication);
			stmt.setLong(1,empId);
			stmt.setString(2,leaveType);
			stmt.setString(3,date);
			stmt.setLong(4,noOfDays);
			stmt.setString(5,reason);
			stmt.setLong(6,status);
			stmt.setString(7,createdOn);
			
			
			Boolean inserted = stmt.execute();
			System.out.println(inserted);
			if(stmt.getUpdateCount()>0) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("data insertion failed");
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
	
 	public List<Map<String,String>> getAllLeaveApplication(){
 		Connection con = null;
		List<Map<String,String>> leaveRequests = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hrms";
			con = DriverManager.getConnection(url,"root","123456789");
			String leaveApplication = "SELECT * FROM leave_application  WHERE empId = 1";				
			PreparedStatement stmt = con.prepareStatement(leaveApplication);
			
			ResultSet rs = stmt.executeQuery();
			leaveRequests = new ArrayList<Map<String,String>>();
			while(rs.next()) {
				Map<String,String> row = new HashMap<String,String>();
				row.put("leaveType",rs.getString("leaveType"));
				row.put("reason",rs.getString("reason"));
				row.put("date",rs.getString("date"));
				row.put("noOfDays",rs.getString("noOfDays"));
				row.put("status",rs.getString("status"));
				leaveRequests.add(row);
			}
			con.close();
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
		
		return leaveRequests;
		
	}
}
