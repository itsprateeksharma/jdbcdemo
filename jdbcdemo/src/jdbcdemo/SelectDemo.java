package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo 
{

	public static void main(String[] args) 
	{
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try 
		{
			// load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","1234");
			
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("SELECT first_name,last_name,email from candidates");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+ rs.getString("email"));
			}
			con.close();
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}
}
