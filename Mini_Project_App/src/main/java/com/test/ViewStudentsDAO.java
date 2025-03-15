package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewStudentsDAO
{
	StudentBean sb = null;
	public ArrayList<StudentBean> viewStudents() 
	{
		ArrayList<StudentBean> list = new ArrayList<>();
		try {
			Connection con = DBConnection.getCon();
			
			PreparedStatement ps1 = con.prepareStatement("select * from student71"); 
			
			ResultSet rs = ps1.executeQuery();
			
			while(rs.next()) {
				sb = new StudentBean();
				sb.setRollNo(rs.getInt(1));
				sb.setName(rs.getString(2));
				sb.setCourse(rs.getString(3));
				sb.getMk().setTotal(rs.getFloat(4));
				sb.getMk().setPer(rs.getFloat(5));
				sb.getMk().setGrade(rs.getString(6));
				
				list.add(sb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
