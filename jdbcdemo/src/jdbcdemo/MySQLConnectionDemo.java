package jdbcdemo;

import java.sql.*;

public class MySQLConnectionDemo {

	public static void main(String[] args) 
	{	
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try 
		{
			// load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create a connection getConnection() of DM class
			//create a session bw java and mysql
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","1234");
			
			//create statement object
			stmt=con.createStatement();
			
			//execute a query & store in ResultSet
			rs=stmt.executeQuery("select*from employees");
			
			//traverse Resultset
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString("email")+" "+rs.getString(8));
			}
			
			
//			System.out.println("Display Specific Records from a DB");
//			rs.absolute(3); //move the cursor to 3rd row in rs
//			System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString("email")+" "+rs.getString(8));
//			
			con.close();
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
