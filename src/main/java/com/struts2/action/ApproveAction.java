package com.struts2.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ApproveAction extends ActionSupport {
	String name;
	String type;
	Date from_Date;
	Date to_date;
	String status;
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public Date getFrom_Date() {
		return from_Date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public String getStatus() {
		return status;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setFrom_Date(Date from_Date) {
		this.from_Date = from_Date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String execute() throws Exception {
		ApproveDao request=new ApproveDao();
		request.setStatus("Aproved");
		String approved_status=request.getStatus();
		setStatus(approved_status);
		String approved_name=request.getName();
		setName(approved_name);
		String approved_type=request.getType();
		setType(approved_type);
		Date approved_to_date=request.getTo_date();
		setTo_date(approved_to_date);
		Date approved_from_date=request.getFrom_date();
		setFrom_Date(approved_from_date);
		
		return SUCCESS;
	}
}
