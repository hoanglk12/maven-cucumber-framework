package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConnUtils {

	public static Connection getSQLServerConnection() {
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String dbName = "automationfc";
		String userName = "sa";
		String password = "123456";
		return getSQLServerConnection(hostName, sqlInstanceName, dbName, userName, password);
	}

	public static Connection getSQLServerConnection(String hostName, String sqlInstanceName, String dbName, String userName, String password) {
		Connection conn = null;
		try {
			String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433" + ";databaseName=" + dbName +  ";instance=" + sqlInstanceName ;
			conn = DriverManager.getConnection(connectionURL, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
