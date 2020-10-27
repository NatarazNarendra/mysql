package com.mkyong.jdbc.preparestatement.row;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class TestRowInsert {

	
	Connection conn;
	PreparedStatement prepareStatement;
//	ResultSet resultSet;
	private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES ('?','?','?')";

	@Test
	public void test() throws SQLException {
		
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "Root@2020");
		conn.prepareStatement(SQL_INSERT);
		
		try( PreparedStatement prepareStatement = conn.prepareStatement(SQL_INSERT)){
		//	prepareStatement.setString(1, "ID");
			prepareStatement.setString(2,"NAME");
			prepareStatement.setString(3,"SALARY");
			prepareStatement.setString(4,"CREATED_DATE");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

