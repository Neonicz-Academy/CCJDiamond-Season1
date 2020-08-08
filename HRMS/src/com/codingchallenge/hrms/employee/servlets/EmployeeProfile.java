package com.codingchallenge.hrms.employee.servlets;

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

import com.codingchallenge.hrms.employee.repositories.EmployeeRepository;
import com.codingchallenge.hrms.util.AuthUtil;


/**
 * Servlet implementation class EmployeeProfile
 */
@WebServlet("/EmployeeProfile")
public class EmployeeProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RequestDispatcher serve = null;				
		if(AuthUtil.isAuthenticated(request, response)) {
			
			HttpSession session = request.getSession(true);
			Long empId= (Long) session.getAttribute("empId");
			serve = request.getRequestDispatcher("employee_home.jsp");
			EmployeeRepository employeeObj = new EmployeeRepository();
			List<Map<String,String>> employeeProfile = employeeObj.getEmployeeProfile(empId);
			request.setAttribute("employeeProfile", employeeProfile);
			
		}else {
			serve = request.getRequestDispatcher("access_denied.jsp");
		}
		serve.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
