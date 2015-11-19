package com.struts2.action;

import java.util.Date;

public class User {
	private int id;  
	private String name,password,email,status,type_of_leave,string_from_date,string_to_date;
	public String getString_from_date() {
		return string_from_date;
	}
	public String getString_to_date() {
		return string_to_date;
	}
	public void setString_from_date(String string_from_date) {
		this.string_from_date = string_from_date;
	}
	public void setString_to_date(String string_to_date) {
		this.string_to_date = string_to_date;
	}
	public String getType_of_leave() {
		return type_of_leave;
	}
	public void setType_of_leave(String type_of_leave) {
		this.type_of_leave = type_of_leave;
	}
	public String getStatus() {
		return status;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	private Date from_date, to_date;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}  
	
}
