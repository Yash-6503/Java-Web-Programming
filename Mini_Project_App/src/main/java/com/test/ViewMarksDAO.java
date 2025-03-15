package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewMarksDAO 
{
	StudentBean sb = null;
	public StudentBean viewMarks(int roll) {
		
		try {
			Connection con = DBConnection.getCon();
			
			PreparedStatement ps1 = con.prepareStatement("select * from marks71 where rollno=?");
			PreparedStatement ps2 = con.prepareStatement("select name, totmarks, percentage, result from student71 where rollno=?");
			
			ps1.setInt(1, roll);
			ps2.setInt(1, roll);
			
			ResultSet rs1 = ps1.executeQuery();
			
			sb = new StudentBean();
			if(rs1.next()) 
			{
				sb.setRollNo(rs1.getInt(1));
				sb.getMk().setCoreJava(rs1.getInt(2));
				sb.getMk().setAdvJava(rs1.getInt(3));
				sb.getMk().setUi(rs1.getInt(4));
				sb.getMk().setDb(rs1.getInt(5));
				sb.getMk().setTools(rs1.getInt(6));
			}
			
			ResultSet rs2 = ps2.executeQuery();
			
			if(rs2.next()) {
				sb.setName(rs2.getString(1));
				sb.getMk().setTotal(rs2.getFloat(2));
				sb.getMk().setPer(rs2.getFloat(3));
				sb.getMk().setGrade(rs2.getString(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sb;
	}
}
