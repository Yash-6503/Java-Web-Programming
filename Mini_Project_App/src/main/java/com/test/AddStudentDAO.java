package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddStudentDAO 
{
	StudentBean sb = null;
	int k;
	public int insert(StudentBean sb) 
	{
		try {
			Connection con = DBConnection.getCon();
			
			PreparedStatement ps1 = con.prepareStatement("insert into student71 values(?,?,?,?,?,?)");
			PreparedStatement ps2 = con.prepareStatement("insert into marks71 values(?,?,?,?,?,?)");
			
			ps1.setInt(1, sb.getRollNo());
			ps1.setString(2, sb.getName());
			ps1.setString(3, sb.getCourse());
			ps1.setFloat(4, sb.getMk().getTotal());
			ps1.setFloat(5, sb.getMk().getPer());
			ps1.setString(6, sb.getMk().getGrade());
			
			k = ps1.executeUpdate();
			
			ps2.setInt(1, sb.getRollNo());
			ps2.setInt(2, sb.getMk().getCoreJava());
			ps2.setInt(3, sb.getMk().getAdvJava());
			ps2.setInt(4, sb.getMk().getUi());
			ps2.setInt(5, sb.getMk().getDb());
			ps2.setInt(6, sb.getMk().getTools());
			
			int m = ps2.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
