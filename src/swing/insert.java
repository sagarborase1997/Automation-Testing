package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert {
	// for insert values in database

	public static void main(String[] args) {
try
{

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306//spark1234","root","");
		PreparedStatement stmt=con.prepareStatement("insert into values sagar5(?,?,?,?)");
		stmt.setInt(1, 6);
		stmt.setString(2, "saurabh");
		stmt.setInt(3, 25);
		stmt.setString(4, "dhule");
		int i=stmt.executeUpdate();
		System.out.println(i+"record inserted");
		con.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
		
	}

}}