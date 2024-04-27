package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static void main(String[] args) {
		Connection con;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");

			System.out.println("Database Connectivity Establish");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
