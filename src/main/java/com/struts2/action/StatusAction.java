package com.struts2.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class StatusAction {

	public ResultSet status(String name, String type, Date from, Date to, String status) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			PreparedStatement ps = con
					.prepareStatement("insert into leaves(name,type,from_date,to_date,status)" + "values(?,?,?,?,?)");
			java.sql.Date sqlDate1=new java.sql.Date(from.getTime());
			java.sql.Date sqlDate2=new java.sql.Date(to.getTime());
			ps.setString(1, name);
			ps.setString(2, type);
			ps.setDate(3, sqlDate1);
			ps.setDate(4, sqlDate2);
			ps.setString(5, status);
			ResultSet rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}