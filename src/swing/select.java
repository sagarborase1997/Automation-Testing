package swing;
import java.sql.*;
import java.sql.DriverManager;

public class select {

	public static void main(String[] args) {
     try
     {
    	 Class.forName("com.mysql.jdbc.Driver");
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
    	 Statement stmt =con.createStatement();
    	 ResultSet rs=stmt.executeQuery("select *from stud");
    	 while(rs.next())
    	 {
    		 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
    	 }
    	 con.close();
     }
catch(Exception e)
     {
	
	System.out.println(e);
     }
}

}
