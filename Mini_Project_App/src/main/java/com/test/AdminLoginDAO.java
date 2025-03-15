package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO
{
	AdminBean ab = null;
	
	public AdminBean Login(String uName, String pwd) 
	{
		try {
			Connection con = DBConnection.getCon();
			
			PreparedStatement ps = con.prepareStatement("select * from admin where username=? and password=?");
			
			ps.setString(1, uName);
			ps.setString(2, pwd);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) 
			{
				ab = new AdminBean();
				ab.setuName(rs.getString(1));
				ab.setPass(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setCity(rs.getString(5));
				ab.setMail(rs.getString(6));
				ab.setPhone(rs.getLong(7));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ab;
	}
}
