package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	
	
	public static Connection createConnection() throws Exception
	{
		Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","1234");
	return con;
	}

}
