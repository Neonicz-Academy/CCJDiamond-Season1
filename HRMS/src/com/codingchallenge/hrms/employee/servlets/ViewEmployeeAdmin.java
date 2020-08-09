package com.codingchallenge.hrms.employee.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingchallenge.hrms.employee.repositories.EmployeeRepository;
import com.codingchallenge.hrms.util.AuthUtil;

/**
 * Servlet implementation class ViewEmployeeAdmin
 */
@WebServlet("/ViewEmployeeAdmin")
public class ViewEmployeeAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployeeAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Long empId = null;
//		try {
//			empId = Long.valueOf(request.getParameter("empId"));
//			}catch (NumberFormatException e) {
//				
//			}
		RequestDispatcher serve = null;				
		if(AuthUtil.isAuthenticated(request, response)) {
			Long empId = Long.valueOf(request.getParameter("empId"));
			System.out.println("Empid ------ :>"+empId);
			serve = request.getRequestDispatcher("employee_profile_admin.jsp");		
			EmployeeRepository ViewEmployeeAdminDao = new EmployeeRepository();
			Map<String,String> ViewEmployeeAdmin = ViewEmployeeAdminDao.getViewEmployeeAdmin(empId);
			request.setAttribute("ViewEmployeeAdmin", ViewEmployeeAdmin);
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
