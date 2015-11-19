package com.struts2.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ApproveDao {
	ArrayList<User> user_data = new ArrayList<User>();
	String name,status,type;
	Date from_date,to_date;
	public String getName() {
		return name;
	}
	public String getStatus() {
		return status;
	}
	public String getType() {
		return type;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
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
				User request_info =new User();
				request_info.setName(data.getString(1));
				request_info.setType_of_leave(data.getString(2));
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				String string_date1 = df.format(data.getDate(3));
				String string_date2=df.format(data.getDate(4));
				request_info.setString_from_date(string_date1);
				request_info.setString_to_date(string_date2);
				request_info.setStatus(data.getString(5));
				user_data.add(request_info);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (user_data!=null){
			return "success";
		}else{
			return "error";
		}
	}

}
