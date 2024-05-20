package com.mvc.MVCJSPProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection {
	Statement st;
	public Dbconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb","root",""); 
		st = con.createStatement();
	}
	
	public void update(String query) throws SQLException {
		st.executeUpdate(query);
	}
	
	public ResultSet select(String query) throws SQLException {
		ResultSet rs = st.executeQuery(query);
		return rs;
	}
}
