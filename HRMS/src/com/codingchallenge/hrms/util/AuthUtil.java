package com.codingchallenge.hrms.util;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthUtil {

	public static boolean isAuthenticated(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		System.out.println("inside auth 1 ");
		Boolean authorized = (Boolean) session.getAttribute("isauthorized");
		System.out.println("inside auth 2");
		return (authorized != null && authorized);
		
	}

}
