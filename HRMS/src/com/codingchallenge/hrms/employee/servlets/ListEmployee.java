package com.codingchallenge.hrms.employee.servlets;

import java.io.IOException;
import java.util.Map;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingchallenge.hrms.employee.repositories.EmployeeRepository;
import com.codingchallenge.hrms.util.AuthUtil;


/**
 * Servlet implementation class ListEmployee
 */
@WebServlet("/ListEmployee")
public class ListEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		RequestDispatcher serve = null;				
		if(AuthUtil.isAuthenticated(request, response)) {
			serve = request.getRequestDispatcher("employee_list.jsp");
			EmployeeRepository listemployeeDao = new EmployeeRepository();
			List<Map<String,String>> ListEmployee = listemployeeDao.getListEmployee();
			request.setAttribute("ListEmployee", ListEmployee);	    
			
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
