//this interface will give the fields which contains connectivity details

package com.test;

public interface DBInfo 
{
	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String dbUser = "NARESH";
	public static final String dbPass = "NARESH";
}
