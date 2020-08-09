package com.codingchallenge.hrms.employee.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingchallenge.hrms.employee.repositories.EmployeeRepository;
import com.codingchallenge.hrms.util.AuthUtil;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
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
			serve = request.getRequestDispatcher("add_employee.jsp");
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
		System.out.println(request.getParameter("firstName"));
		System.out.println(request.getParameter("empId"));
		System.out.println(request.getParameter("Email"));
		System.out.println(request.getParameter("DOB"));
		System.out.println(request.getParameter("jobTitle"));
		System.out.println(request.getParameter("Dept"));
		System.out.println(request.getParameter("lastName"));
		System.out.println(request.getParameter("gender"));
		System.out.println(request.getParameter("Phone"));
		System.out.println(request.getParameter("DOJ"));
		System.out.println(request.getParameter("description"));
		
		
		String firstName = request.getParameter("firstName");
		String empId = request.getParameter("empId");
		System.out.println("empId Long"+ empId);
		String email = request.getParameter("Email");
		String dateOfBirth = request.getParameter("DOB");
		String jobTitle = request.getParameter("jobTitle");
		String department = request.getParameter("Dept");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		Long phone = Long.valueOf(request.getParameter("Phone"));
		System.out.println("phone long"+phone);
		String dateOfJoining = request.getParameter("DOJ");
		String address = request.getParameter("description");
		
		if((firstName != null && firstName.isEmpty()) && (empId != null && empId.isEmpty()) &&
				(email != null && email.isEmpty()) && (dateOfBirth != null && dateOfBirth.isEmpty()) &&
				(jobTitle != null && jobTitle.isEmpty()) && (department != null && department.isEmpty()) &&
				(lastName != null && lastName.isEmpty()) && (gender != null && gender.isEmpty()) &&
				(phone != null ) && (dateOfJoining != null && dateOfJoining.isEmpty()) &&
				(address != null && address.isEmpty())) {
			
			System.out.println("Failed Validation");
           
		}else {
			EmployeeRepository employeeDao = new EmployeeRepository();
			employeeDao.saveEmployee(empId, firstName, lastName, email, phone, dateOfBirth, dateOfJoining, address, gender, jobTitle, department);
				
			}
		response.sendRedirect("ListEmployee");	
			
			
		}
	
	}


