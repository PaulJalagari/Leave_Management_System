package com.struts2.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ApproveDao {
	ArrayList<User> user_data = new ArrayList<User>();

	public ArrayList<User> getUser_data() {
		return user_data;
	}

	public void setUser_data(ArrayList<User> user_data) {
		this.user_data = user_data;
	}

	public String execute() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			PreparedStatement ps;
			ps = con.prepareStatement("select * from leaves");
			ResultSet data = ps.executeQuery();
			while (data.next()) {
				User request_info = new User();
				request_info.setName(data.getString(1));
				request_info.setType_of_leave(data.getString(2));
				request_info.setFrom_date(data.getDate(3));
				request_info.setTo_date(data.getDate(4));
				request_info.setStatus(data.getString(5));
				user_data.add(request_info);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (user_data != null) {
			return "success";
		} else {
			return "error";
		}
	}

}
