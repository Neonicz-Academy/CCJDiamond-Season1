package com.codingchallenge.hrms.leave.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingchallenge.hrms.employee.repositories.EmployeeRepository;
import com.codingchallenge.hrms.leave.repositories.LeaveRepository;
import com.codingchallenge.hrms.util.AuthUtil;

import java.util.List;
import java.util.Map;

/**
 * Servlet implementation class LeaveSummaryEmployee
 */
@WebServlet("/LeaveSummaryEmployee")
public class LeaveSummaryEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeaveSummaryEmployee() {
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
			
			serve =  request.getRequestDispatcher("leave_summary.jsp");
			LeaveRepository leaveSummaryObj = new LeaveRepository();
			List<Map<String,String>> leaveRequests = leaveSummaryObj.getAllLeaveApplication(Long.valueOf(empId));
			request.setAttribute("leaveRequests", leaveRequests);
			serve.forward(request, response);
		}else {
			serve = request.getRequestDispatcher("access_denied.jsp");
		}
		serve.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
