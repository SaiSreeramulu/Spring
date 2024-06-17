package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateData {

	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
		// TODO Auto-generated method stub
		
		// 1. Loading the Driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Establish the connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid="system";
		String pwd="orcl";
		Connection con = DriverManager.getConnection(url,uid,pwd);
		
		
		//3. Create the Statement Object
		Statement st = con.createStatement();
		
		//4. WRite the query and execute it
		String query = "create table manga (Name varchar(20), chapters number(5), genere varchar(20))";
		st.executeUpdate(query);
		
		System.out.println("Table created");
		
		st.close();
		con.close();

	}

}
