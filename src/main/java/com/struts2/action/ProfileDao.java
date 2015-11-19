package com.struts2.action;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class ProfileDao {

	ArrayList<User> list = new ArrayList<User>();
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<User> getList() {
		return list;
	}

	public void setList(ArrayList<User> list) {
		this.list = list;
	}

	public String execute() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			String logged_in_user = request.getUserPrincipal().getName();
			Dao data = new Dao();
			ResultSet user_info = data.Data(logged_in_user);
			while (user_info.next()) {
				User user = new User();
				user.setId(user_info.getInt(1));
				setName(user_info.getString(2));
				user.setPassword(user_info.getString(3));
				user.setEmail(user_info.getString(4));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null) {
			return "success";
		} else {
			return "error";
		}
	}
}
