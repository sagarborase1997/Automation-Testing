package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			PreparedStatement stmt=con.prepareStatement("insert into stud values(?,?,?,?)");
			stmt.setString(1,6);
			stmt.setString(2, "ashish");
			stmt.setString(3,"nasik");
			stmt.setString(4, 26);
			int i=stmt.executeUpdate();
			System.out.println(i+ " Record Inserted");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}	
	}
