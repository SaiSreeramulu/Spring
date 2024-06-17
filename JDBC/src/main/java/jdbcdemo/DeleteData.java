package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 1. Loading the Driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Establish the connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid="system";
		String pwd="orcl";
		Connection con = DriverManager.getConnection(url,uid,pwd);
		
		
		//3. Create the PreparedStatement Object
		String query ="delete from manga where Name=?";
		PreparedStatement pst = con.prepareStatement(query);
		
		// 4. Read the values for placeholders from keyboard
		System.out.println("Enter Name ");
		String name = sc.next();
		
		
		// 5. set the values for prepared statement place holders
		pst.setString(1, name);
		
		
		//6. Execute the query
		int k = pst.executeUpdate();
		
		if(k>0)
			System.out.println("Record Deleted....");
		else
			System.out.println("Not Deleted....");
		
		
		//7. close the objects
		sc.close();
		pst.close();
		con.close();
		
		
		
		
	}

}
