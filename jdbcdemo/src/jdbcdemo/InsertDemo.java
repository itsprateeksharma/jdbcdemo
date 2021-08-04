package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try 
		{
			con=ConnectionUtil.createConnection();
			
			String str="INSERT INTO skills(name) VALUES('VS Db')";
			
			stmt=con.createStatement();
			
			count=stmt.executeUpdate(str); //return no. of records affected
			
			if(count>0)
			{
				System.out.println("records inserted successfully");
			}
			//count total no. of records in table
			String str1=" SELECT COUNT(id) FROM skills ";
			rs=stmt.executeQuery(str1);
			int cnt=0;
			while(rs.next())
			{
				 cnt=rs.getInt(1);
			}
			System.out.println("total no. of records: "+cnt);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
