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

import com.codingchallenge.hrms.leave.repositories.LeaveRepository;
import com.codingchallenge.hrms.util.AuthUtil;

/**
 * Servlet implementation class PendingLeave
 */
@WebServlet("/PendingLeave")
public class PendingLeave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PendingLeave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside pending");
		RequestDispatcher serve = null;				
		if(AuthUtil.isAuthenticated(request, response)) {
			LeaveRepository leaveRepository = new LeaveRepository();
			List<Map<String,String>> pendingRequestList = leaveRepository.selectPendingRequest();
			request.setAttribute("requestlist", pendingRequestList);
			serve= request.getRequestDispatcher("pending_leave.jsp");
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
