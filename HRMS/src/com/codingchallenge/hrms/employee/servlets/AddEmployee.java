package com.codingchallenge.hrms.employee.servlets;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import com.codingchallenge.hrms.employee.repositories.EmployeeRepository;
import com.codingchallenge.hrms.util.AuthUtil;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "C:\\MyJavaTrip\\uploads"; 
       
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
		String firstName = null;
		String lastName = null;
		String email = null;
	    Long empId = null;
		String dateOfBirth = null;
		String dateOfJoining = null;
		Long phone = null;
		String jobTitle = null;
		String department = null;
		String address = null;
		String gender = null;
		String image = null;
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory())
						.parseRequest(new ServletRequestContext(request));
				for(FileItem item : multiparts){
                    if(item.isFormField()){
                    	System.out.println("Form field :> " + item);
                    	if(item.getFieldName().equals("firstName")){
                    		 firstName = item.getString();
                    	}
                    	if(item.getFieldName().equals("lastName")){
                    		 lastName = item.getString();     
                    		}
                    	if(item.getFieldName().equals("email")){
                    		 email = item.getString();              
                    		}
                    	if(item.getFieldName().equals("empId")){
                    		 empId = Long.valueOf(item.getString());                    	
                    		}
                    	if(item.getFieldName().equals("DOB")){
                    		 dateOfBirth = item.getString();                    
                    		}
                    	if(item.getFieldName().equals("DOJ")){
                    		 dateOfJoining = item.getString();                    	
                    		}
                    	if(item.getFieldName().equals("phone")){
                    		 phone = Long.valueOf(item.getString());                    	
                    		}
                    	if(item.getFieldName().equals("jobTitle")){
                    		 jobTitle = item.getString();                    	
                    		}
                    	if(item.getFieldName().equals("dept")){
                    		department = item.getString();                    
                    		}
                    	if(item.getFieldName().equals("address")){
                    		 address = item.getString();                    
                    		}
                    	if(item.getFieldName().equals("gender")){
                    		 gender = item.getString();                    
                    		}
                    }else {
                    	System.out.println("File :> " + item);
                    	String name = new File(item.getName()).getName();
                		System.out.println("Last Path>>>>>>>>>>"+UPLOAD_DIRECTORY + File.separator + name);
                		File imgDirectory = new File(UPLOAD_DIRECTORY);
                		if (!imgDirectory.exists()) {
                			System.out.println("Directory doesn't exist");
                			imgDirectory.mkdirs();
            			} else {
            				System.out.println("directory exists");
            			}
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                        request.setAttribute("img", UPLOAD_DIRECTORY + File.separator + name);
                        System.out.println(request.getAttribute("img"));
                        image = (String) request.getAttribute("img");
                    }
                }
				request.setAttribute("message", "File Uploaded Successfully");
				if((firstName != null && firstName.isEmpty()) && (empId != null ) &&
						(email != null && email.isEmpty()) && (dateOfBirth != null && dateOfBirth.isEmpty()) &&
						(jobTitle != null && jobTitle.isEmpty()) && (department != null && department.isEmpty()) &&
						(lastName != null && lastName.isEmpty()) && (gender != null && gender.isEmpty()) &&
						(phone != null ) && (dateOfJoining != null && dateOfJoining.isEmpty()) &&
						(address != null && address.isEmpty())) {
					
					System.out.println("Failed Validation");
		           
				}else {
					EmployeeRepository employeeDao = new EmployeeRepository();
					employeeDao.saveEmployee(empId, firstName, lastName, email, phone, dateOfBirth, dateOfJoining, address, gender, jobTitle, department,image);
						
					}
				response.sendRedirect("ListEmployee");
			} catch (Exception ex) {
				request.setAttribute("message", "File Upload Failed due to " + ex);
				
			}
		} else {
			request.setAttribute("message", "Sorry this Servlet only handles file upload request");
		}
		}
	
	}


