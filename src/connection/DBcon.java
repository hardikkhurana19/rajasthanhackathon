package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {
	public static Connection con;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajhack","root","1234");
			System.out.println("Connection created");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		return con;
	}
}
