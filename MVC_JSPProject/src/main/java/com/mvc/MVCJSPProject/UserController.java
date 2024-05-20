package com.mvc.MVCJSPProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public class UserController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name =  request.getParameter("username");
		String Job  = request.getParameter("job");
		int Salary = Integer.parseInt(request.getParameter("salary"));
		
		UserModel mod = new UserModel();
		mod.setUsername(Name);
		mod.setJob(Job);
		mod.setSalary(Salary);
		
		Dbdaouser dao = new Dbdaouser();
		try {
			dao.insertData(mod);
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("userdetail", mod);
		request.getRequestDispatcher("displayuser.jsp").include(request, response);
		
	}

}
