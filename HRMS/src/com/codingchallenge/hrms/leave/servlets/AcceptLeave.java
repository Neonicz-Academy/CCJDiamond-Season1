package com.codingchallenge.hrms.leave.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingchallenge.hrms.leave.repositories.LeaveRepository;
import com.codingchallenge.hrms.util.AuthUtil;

/**
 * Servlet implementation class AcceptLeave
 */
@WebServlet("/AcceptLeave")
public class AcceptLeave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcceptLeave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String applicationId="1";
		RequestDispatcher serve = null;				
		if(AuthUtil.isAuthenticated(request, response)) {
				String applicationId=request.getParameter("applicationId");
				System.out.println("applicationId" + applicationId );
				LeaveRepository leaveRepositoryObj = new LeaveRepository();
				System.out.println("Inside to doget");
				leaveRepositoryObj.acceptingLeave(Long.valueOf(applicationId)); 				
				response.sendRedirect("LeavesummaryAdmin");
		}else {
			serve = request.getRequestDispatcher("access_denied.jsp");
			serve.forward(request, response); 
		}	
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
