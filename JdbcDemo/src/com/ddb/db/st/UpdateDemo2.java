package com.ddb.db.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo2 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/dbase";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		String sql = "update cv set name='张三丰', age=120 where id = ?;";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, 9);
	 	int ret = st.executeUpdate();
	 	System.out.println("更新数据的数量：" + ret);
		st.close(); 
		conn.close();
		
	}

}
