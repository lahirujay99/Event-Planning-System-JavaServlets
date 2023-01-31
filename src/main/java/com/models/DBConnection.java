package com.models;

import java.sql.*;

public class DBConnection {
	
	//get connection method
	public static Connection getConnection() {
		// connection variable
		Connection con = null;
		
		// parameter values for database connection
		String URL = "jdbc:mysql://localhost:3306/moments";
		String name = "root";
		String password = "1234";
		
		try {
			// driver register 
			Class.forName("com.mysql.jdbc.Driver");
			// create connection
			con = DriverManager.getConnection(URL, name, password);
		}catch (ClassNotFoundException e) {
			System.out.println("Where is the driver"+e.getMessage());
		}catch (SQLException e) {
			System.out.println("SQL error"+e.getMessage());
		}
		// check if not connection null;
		if(con != null) {
			System.out.println("Connection Made!!");
		}
		// return connection
		return con;
	}

}
