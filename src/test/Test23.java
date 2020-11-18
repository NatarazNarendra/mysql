package test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.mkyong.jdbc.JDBCExample;

 public class JDBCExampleTest {
 
		public class SybaseStatementTest {
		    Connection conn;

		    @Before
		    public void before() {
		    	try {
					conn = DriverManager.getConnection("ase");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
		    }
		}

}		/*
			 * @After public void after() { SybaseDBConnection.closeConnection(connection);
			 * }
			 * 
			 * @Test public void closeStatementShouldCloseStatement() { Statement statement
			 * = connection.createStatement(); SybaseDBConnection.closeStatement(statement);
			 * assertTrue(statement.isClosed()); }
			 * 
			 * @Test public void closeStatementWithNullShouldNotThrow() {
			 * SybaseDBConnection.closeStatement(null); } }
			 */
		
	



