package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/miniproject";
		String username = "root";
		String password = "1234";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM employees WHERE emp_name=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "Pranay");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
