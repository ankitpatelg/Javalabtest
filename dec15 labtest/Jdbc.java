package com.quest2;

//importing libraries
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/test";		//database name
		String un = "root";										//user name
		String p = "pranjal2717";								//password
		//Class.forName("com.mysql.jdbc.driver");
		Connection con = DriverManager.getConnection(url, un, p);
		Statement st = con.createStatement();
		String sql = " select * from t1 where city LIKE 'S%'";
		ResultSet rs = st.executeQuery(sql);
		System.out.println("------------------------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
		}
		System.out.println("------------------------------------------");
		con.close();
	}

}