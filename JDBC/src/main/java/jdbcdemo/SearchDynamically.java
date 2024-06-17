package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 1. Loading the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. Establish the connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "orcl";
		Connection con = DriverManager.getConnection(url, uid, pwd);

		// 3. Create the PreparedStatement Object
		String query = "select * from manga where name=?";
		PreparedStatement pst = con.prepareStatement(query);

		// 4. Read the values for placeholders from keyboard
		System.out.print("Enter name : ");
		String name = sc.next();

		// 5. set the values for prepared statement place holders
		pst.setString(1, name);

		// 6. Execute the query
		ResultSet rs = pst.executeQuery();

		if (rs != null) {
			while (rs.next())
				System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3));

		} else {
			System.out.println("No Records found with given pid");
		}
		// 7. close the objects
		sc.close();
		rs.close();
		pst.close();
		con.close();

	}

}
