package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/miniproject";
		String username = "root";
		String password = "1234";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employees SET emp_name=?,emp_age=? WHERE emp_salary=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "Pranay");
		    statement.setString(2, "22");
		    statement.setString(3, "20000");
		    
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
