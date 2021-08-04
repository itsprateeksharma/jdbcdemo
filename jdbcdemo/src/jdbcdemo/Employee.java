package jdbcdemo;
import java.sql.*;
import java.util.Scanner;

public class Employee 
{
	static Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    int count=0;
    Scanner sc=new Scanner(System.in);
    
    public Connection getConnection() throws Exception
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeesnew","root","1234");
		return con;
    }
    
    public void insertEmployee(String name, String city, String contact) throws Exception
    {
    	
        System.out.println("**************** Insert new Employees*****************");
        
        con=getConnection();
        ps=con.prepareStatement("INSERT INTO Employee(EName,City,Mobile) VALUES(?,?,?); ");
        
        name=sc.next();
        city=sc.next();
        contact=sc.next();
        
        ps.setString(1, name);
        ps.setString(2, city);
        ps.setString(3, contact);
        
        count=ps.executeUpdate();
        if(count>0)
        {
        	System.out.println(count+" Records Inserted successfully");
        }        
    }
    
    public void getEmployee() throws Exception
    {
     System.out.println("**************** Display Employees*****************");
     
     con=getConnection();
     st=con.createStatement();
     rs=st.executeQuery("SELECT * from employee;");
     
     while(rs.next())
     {
    	 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"     "+rs.getString(3)+"   "+rs.getString(4));
     }   
  }
    
    public void updateEmployee(int eid,String contactno) throws Exception
    {
        System.out.println("**************** Update Employees*****************");
        
        con=getConnection();
    	ps=con.prepareStatement("UPDATE employee set Mobile=? where ID=?");
    	eid=sc.nextInt();
    	System.out.println("Enter new Mobile no. : ");
    	contactno=sc.next();
    	
        ps.setString(1, contactno);
        ps.setInt(2, eid);
        
       count= ps.executeUpdate();
        System.out.println(String.format("Row affected: %d", count));
    }
   
    public void deleteEmployee(int eid) throws Exception
    {
        System.out.println("**************** Delete Employees*****************");
        con=getConnection();
        ps=con.prepareStatement("DELETE from employee WHERE ID=?");
        
        System.out.println("Enter the ID of the employee to be deleted:");
        eid=sc.nextInt();
        
        ps.setInt(1, eid);
        ps.executeUpdate();
        System.out.println("Record deleted successfully");
      
    }

}
