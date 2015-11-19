package com.struts2.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DateTimePickerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date1;
	private Date date2;
	private String LeaveType;
	private String Status;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getType() {
		return LeaveType;
	}

	public void setType(String type) {
		this.LeaveType = type;
	}

	public Date getDate1() {
		return date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	// getter and setter methods
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String logged_in_user = request.getUserPrincipal().getName();
		setName(logged_in_user);
		setStatus("pending");
		StatusAction leave_data=new StatusAction();
		leave_data.status(logged_in_user,getType(),getDate1(),getDate2(),getStatus());
		return SUCCESS;
	}

	public String display() {
		return NONE;
	}

}