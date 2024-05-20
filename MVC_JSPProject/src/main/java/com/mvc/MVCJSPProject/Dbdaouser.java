package com.mvc.MVCJSPProject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dbdaouser {
	public void insertData(UserModel user) throws ReflectiveOperationException, SQLException {
		Dbconnection db = new Dbconnection();
		String query = "insert into userdata (username,job,salary) values ('"+user.getUsername()+"','"+user.getJob()+"','"+user.getSalary()+"')";
		db.update(query);
	}
	
	public List<UserModel>getUserData() throws ClassNotFoundException, SQLException{
		Dbconnection db = new Dbconnection();
		String query = "select * from userdata";
		ResultSet rs = db.select(query);
		
		List<UserModel> list = new ArrayList<UserModel>();
		while(rs.next()) {
			UserModel us = new UserModel();
			us.setUid(rs.getInt(1));
			us.setUsername(rs.getString(2));
			us.setJob(rs.getString(3));
			us.setSalary(rs.getInt(4));
			list.add(us);
		}
		return list;
	}
	
	public UserModel getUserDataById(int empid) throws ClassNotFoundException, SQLException {
		Dbconnection db = new Dbconnection();
		String query ="select * from userdata where id='"+empid+"'";
		ResultSet rs = db.select(query);
		UserModel us = new UserModel();
		if(rs.next()) {
			us.setUid(rs.getInt(1));
			us.setUsername(rs.getString(2));
			us.setJob(rs.getString(3));
			us.setSalary(rs.getInt(4));
		}
		return us;
	}
	
	public void updateUserData(int uid,UserModel user) throws ClassNotFoundException, SQLException {
		Dbconnection db = new Dbconnection();
		String query = "update userdata set username='"+user.getUsername()+"',job='"+user.getJob()+"',salary='"+user.getSalary()+"' where id='"+uid+"'";
		db.update(query);
	}
	
	public void deleteUserData(int uid) throws ClassNotFoundException, SQLException {
		Dbconnection db = new Dbconnection();
		String query ="delete from userdata where id='"+uid+"'";
		db.update(query);
	}
}
