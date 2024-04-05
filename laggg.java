package JDBC_package;

import java.sql.*;

public class laggg {
	public static void main(String[]args) {
		try (Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Tushar2004");
			Statement st=con.createStatement();
				
			)	{
			
			String str1="insert into student values(2,'ghaurav','dupare',21)";
			st.executeUpdate(str1);
		
			
			String sql2 = "SELECT id, first, last, age FROM student";
			
			ResultSet rs=st.executeQuery(sql2);
			 while(rs.next())
			 {
	                //Display values
	                System.out.print("ID: " + rs.getInt("id"));
	                System.out.print(", Age: " + rs.getInt("age"));
	                System.out.print(", First: " + rs.getString("first"));
	                System.out.println(", Last: " + rs.getString("last"));
	       
		} 
			 rs.close();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
}
}