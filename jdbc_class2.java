package JDBC_package;

import java.sql.*;

public class jdbc_class2 {
	 // static final String QUERY = "SELECT id, first, last, age FROM student";

public static void main(String[] args) {
	

	try (Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Tushar2004");
			Statement stmt = con.createStatement();
			)
	{
		
		//String sql0="insert into student values(1,'tushar','shinde',18)";
	//	String sql = "INSERT INTO student VALUES (2, 'Zara', 'Ali', 18)";
      // stmt.executeUpdate(sql);
       //stmt.executeUpdate(sql0);
        
        // String sql4 = "UPDATE student SET age = 17 WHERE id in (1)";
  // stmt.executeUpdate(sql4);
   
		
     // String sql1 = "DELETE FROM student WHERE id = 1";
         // stmt.executeUpdate(sql1);
             
         String sql2 = "SELECT id, first, last, age FROM student";
		
		
            ResultSet rs = stmt.executeQuery(sql2);
             while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
       
	} rs.close();
	}
	catch (SQLException e) {
		 e.printStackTrace();
	}

	
}
	
	
	
}
