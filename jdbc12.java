package JDBC_package;



	import java.sql.*;



	public class jdbc12 {
	   /*static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
	   static final String USER = "root";
	   static final String PASS = "Tushar2004";*/
	
		//static final String QUERY1 =" insert into employees(id,name,first,last) values('5','xy','harsh','kachway')";
		static final String QUERY = "SELECT id, first, last, name FROM employee";
		//static final String sql = "DELETE FROM employees "+"WHERE id = 4";  
		
	   public static void main(String[] args) {
	   
	      try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tutorialspoint", "root", "Tushar2004");
	         Statement stmt = conn.createStatement();
	    		 
	  			//PreparedStatement pstmt=conn.prepareStatement(QUERY1);
	    		  //
	    		//  PreparedStatement ps =conn.prepareStatement("insert into employees(id,age,first,last) values('4','20','shivam','shukla')");
	    		  //double i = ps.executeUpdate();
	    		  
	    		  
	    		  
	    		  //----select-----
	    		  
	    		  ResultSet rs = stmt.executeQuery(QUERY);
	    		  
	    		  ) {
	    	  
	    	  //-----insert-----
	    	String QUERY1 = "INSERT INTO employees (id,age,first,last) VALUES ('4','20','shivam','shukla')";
	         stmt.executeUpdate(QUERY1);
	    	  
	    	  
	    	  //-----update-----
	    	//  String sql = "UPDATE employees "+"SET age = 19 WHERE id=5";
	    	       //  stmt.executeUpdate(sql);
	    	        
	    	  
	    	  
	    	  //--delete-----------
	    	  
	    	        // stmt.executeUpdate(sql);
	    	  //
	         while (rs.next()) {
	           
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.print(", Name: " + rs.getInt("name"));
	            System.out.print(", First: " + rs.getString("first"));
	            System.out.println(", Last: " + rs.getString("last"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	
	
}
