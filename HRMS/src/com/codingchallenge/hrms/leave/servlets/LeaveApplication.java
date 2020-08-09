package com.codingchallenge.hrms.leave.servlets;

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

import com.codingchallenge.hrms.leave.repositories.LeaveRepository;
import com.codingchallenge.hrms.util.AuthUtil;

/**
 * Servlet implementation class LeaveApplication
 */
@WebServlet("/LeaveApplication")
public class LeaveApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeaveApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher serve = null;				
		if(AuthUtil.isAuthenticated(request, response)) {
		
		String leaveApplied = (String) request.getAttribute("leaveApplied");		
		if((leaveApplied != null ) && (leaveApplied.equals("success"))) {
			serve =  request.getRequestDispatcher("leave_summary.jsp");
			LeaveRepository leaveSummaryObj = new LeaveRepository();
			List<Map<String,String>> leaveRequests = leaveSummaryObj.getAllLeaveApplication(123l);
			request.setAttribute("leaveRequests", leaveRequests);			
			serve.forward(request, response);
		}
		else {
		serve =  request.getRequestDispatcher("leave_application.jsp");
		serve.forward(request, response);
		}
		}else {
			serve = request.getRequestDispatcher("access_denied.jsp");
		}
		serve.forward(request, response);
			
	}

	/**
	 * @param applicationObj 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String date= request.getParameter("date");
		String noOfDays = request.getParameter("no_of_days");
		String reason = request.getParameter("reason");
		String leaveType = request.getParameter("leave_type");
		
		HttpSession session = request.getSession(true);
		Long empId= (Long) session.getAttribute("empId");
		
		
		String status = "1";
		if((date!=null && date.isEmpty()) ||(noOfDays!=null && noOfDays.isEmpty()) ||
				(reason!=null && reason.isEmpty()) || (leaveType!=null && leaveType.isEmpty())) {
			System.err.println("Null values");
		}
		else {			
			System.err.println("No Null values");
			LeaveRepository applicationObj = new LeaveRepository();
			applicationObj.saveLeaveApplication(empId,leaveType,reason,date,Long.valueOf(noOfDays),Long.valueOf(status));
				}
		request.setAttribute("leaveApplied", "success");
		doGet(request, response);
				
		
	}

}
