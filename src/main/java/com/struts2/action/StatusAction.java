package com.struts2.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class StatusAction {

	public ResultSet status(String name, String type, Date from, Date to, String status) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			PreparedStatement ps = con
					.prepareStatement("insert into leaves(name,type,from_date,to_date,status)" + "values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, type);
			ps.setDate(3, from);
			ps.setDate(4, to);
			ps.setString(5, status);
			ResultSet rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}