package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class Database {
	public static Connection con = null;
	private static Database instance = new Database();
	public static Database getInStance() {
		return instance;
	}
	public static void connect() {
		Properties properties = new Properties();
		properties.put("chartSet", "UTF8");
		properties.put("encoding", "UTF8");
		String url = "jdbc:sqlserver://localhost:1433;databasename=HKVTravel;user=sa;password=025825273a";
		try {
			con = DriverManager.getConnection(url, properties);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void disconnect() {
		if(con!=null)
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
	public Connection getConnection() {
		connect();
		return con;
	}
	public static void main(String[] args) {
		connect();
		if(con != null)
			System.out.println("Success");
		disconnect();
	}
	
}
