package com.cestar.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cestar.dao.EmployeeDao;
import com.cestar.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("emp_id"));
		String name = request.getParameter("emp_name");
		String contact = request.getParameter("emp_contact");
		String city  = request.getParameter("emp_city");
		
		int status = 0 ;
		
		
		Employee emp = new Employee(id,name,contact,city);
		
		EmployeeDao dbUtil = new EmployeeDao();
		
		status = dbUtil.insert(emp);

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor='sky blue' >");
		out.print("<h1>Hello World from a Servlet:</h1>");
		out.print("<h3>Hello Dear User You typed Employee Id as:</h3>"+id);
		out.print("<h3>Hello Dear User You typed Employee Name as:</h3>"+name);
		out.print("<h3>Hello Dear User You typed Employee Contact as:</h3>"+contact);
		out.print("<h3>Hello Dear User You typed Employee City as:</h3>"+city);
		out.print("</body>");
		
		
		out.print("</html>");
		if(status>0){
			
			out.print("<br><br>");
			out.print("Record Submitted Successfully");
		}
		else {
			
			out.print("Try again please");
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
