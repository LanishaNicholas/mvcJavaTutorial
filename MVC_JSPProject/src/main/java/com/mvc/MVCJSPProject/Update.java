package com.mvc.MVCJSPProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid =Integer.parseInt(request.getParameter("uid")) ;
		String Name =  request.getParameter("username");
		String Job  = request.getParameter("job");
		int Salary = Integer.parseInt(request.getParameter("salary"));
		
		UserModel mod = new UserModel();
		mod.setUsername(Name);
		mod.setJob(Job);
		mod.setSalary(Salary);
		Dbdaouser dao = new Dbdaouser();
		try {
			dao.updateUserData(uid, mod);
			response.sendRedirect("view");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
