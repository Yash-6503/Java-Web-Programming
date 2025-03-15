//This class will only provide the db connection with getCon()

package com.test;

import java.sql.*;

public class DBConnection
{
	private static Connection con = null;
	private DBConnection() {}
	
	static {
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dbUrl, DBInfo.dbUser, DBInfo.dbPass);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}
}
