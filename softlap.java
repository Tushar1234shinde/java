package JDBC_package;
import java.sql.*;


public class softlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(
				
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/softbuzz","root","Tushar2004");
			Statement st=con.createStatement();
				) {
			String str1="insert into laptop values(1,'HP')";
			String str2="delete from laptop where id=1";
			String str3="select id,name from laptop";
			st.executeUpdate(str1);
			
			
			ResultSet rs=st.executeQuery(str3);
			while(rs.next()) {
				 System.out.print("ID: " + rs.getInt("id"));
				 System.out.print(", Name: " + rs.getString("name"));
			}
			rs.close();
			
		}
		
		catch (SQLException e) {
			e.getStackTrace();
		}

	}

}
