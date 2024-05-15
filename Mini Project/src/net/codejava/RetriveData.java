package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/miniproject";
		String username = "root";
		String password = "1234";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employees";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String Employee_name = result.getString(2);
			    String Employee_age = result.getString(3);
			    String Employee_salary = result.getString(4);
			   
			 
			    String output = "User #%d: %s - %s - %s";
			    System.out.println(String.format(output, ++count, Employee_name,Employee_age, Employee_salary));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
