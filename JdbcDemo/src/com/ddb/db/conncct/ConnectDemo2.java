package com.ddb.db.conncct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDemo2 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/dbase";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		Statement st = conn.createStatement();
		String sql = "select * from cv ;";
	 	ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			String  name = rs.getString(2);
			int age = rs.getInt(3);
			System.out.print("name = " + name + "\t");
			System.out.print("age = " + age + "\t");
			System.out.println();
			System.out.println("----------------------------");
		}
		rs.close();
		st.close();
		conn.close();
		
	}

}
