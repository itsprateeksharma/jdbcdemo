package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try 
		{
			// load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create a connection getConnection() of DM class
			//create a session bw java and mysql
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","1234");
			
			//create statement object
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("select c.id,first_name,name from candidates c INNER JOIN  "
                    + "candidate_skills s ON c.id=candidate_id  INNER JOIN  "
                    + "skills sk ON s.skill_id=sk.id  ;");

 
            while(rs.next())  {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            }
                 rs.close();
                 stmt.close();
                 con.close();
        }
         catch(Exception e){ 
                
                System.out.println(e);
                }  

	}

}
