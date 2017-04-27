package app2;
import java.sql.*;
import java.sql.DriverManager;
public class DbC2 {

	static Connection myConnection()
	{
		Connection cn=null;
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sim","123"); 
		}catch(Exception e) {  System.out.println("Exception"+e); }
		return cn;
	}
	public static void main(String arg[])
	{
		System.out.println("Connection "+myConnection());
	}
}
