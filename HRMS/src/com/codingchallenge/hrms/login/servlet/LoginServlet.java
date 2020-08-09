package com.codingchallenge.hrms.login.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingchallenge.hrms.login.repositories.LoginRepository;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		RequestDispatcher serve = null;
		Boolean autherized = (Boolean) session.getAttribute("isauthorized");
		
		if(autherized != null && autherized) {
			System.out.println("Emp id in session" + session.getAttribute("empId"));			
			
			System.out.println("autherized");
			String emprole = (String) session.getAttribute("empRole");
			System.out.println("Role in session" + emprole);
			if(emprole.equals("Admin") ) {
				response.sendRedirect("PendingLeave");
			}else {
				response.sendRedirect("EmployeeProfile");
			}
			
		}else {
			serve =  request.getRequestDispatcher("login.jsp");
			serve.forward(request, response);

		}
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long loginUserName= Long.valueOf(request.getParameter("username"));
		String loginPassword = request.getParameter("password");
		String loginUserRole = request.getParameter("userRole");
		RequestDispatcher serve = null;
		boolean authenticationFailed = true;
		
		if((loginUserName==null) ||(loginPassword!=null && loginPassword.isEmpty()) || 
				(loginUserRole!=null && loginUserRole.isEmpty())) {
			System.err.println("Null values");
		}
		else {			
			System.err.println("No Null values");
			LoginRepository loginObj = new LoginRepository();
			boolean loginStatus = loginObj.findUser(loginUserName,loginPassword,loginUserRole);
			System.out.println(loginStatus);
			if(loginStatus) {
				HttpSession session = request.getSession(true);
				session.setAttribute("isauthorized",true);
				session.setAttribute("empId",loginUserName);
				session.setAttribute("empRole",loginUserRole);
				authenticationFailed = false;
			}
			else {
//				System.out.println("authentication Failed");
				request.setAttribute("failed",authenticationFailed);
//				5ve.forward(request, response);

			}
				}
		
		doGet(request, response);
	}

}
