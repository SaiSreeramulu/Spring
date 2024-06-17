package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertData {

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
		String query = "insert into manga values ('Solo leveling', 200, 'Action')";
		int k=st.executeUpdate(query);
		
		if(k>0) {
			System.out.println("Row inserted");
		}
		else {
			System.out.println("Row is not Inserted");
		}
		
		st.close();
		con.close();

	}

}
