package com.struts2.action;

import java.sql.ResultSet;

public class LoginDao {
	
	public static boolean validate(String username, String userpass) {
		boolean status = false;
		try {
			Dao data = new Dao();
			ResultSet rs=data.Data(username);
			status = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
