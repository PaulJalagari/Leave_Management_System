package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class ApproveAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name, type, from_date, to_date;
	String status;

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getFrom_Date() {
		return from_date;
	}

	public String getTo_date() {
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

	public void setFrom_Date(String from_Date) {
		this.from_date = from_Date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String execute() throws Exception {
		ApproveDao approve = new ApproveDao();
		approve.execute();
		User request = new User();
		request.setStatus("Aproved");
		String approved_status = request.getStatus();
		setStatus(approved_status);
		String approved_name = request.getName();
		setName(approved_name);
		String approved_type = request.getType_of_leave();
		setType(approved_type);
		String approved_to_date = request.getString_to_date();
		setTo_date(approved_to_date);
		String approved_from_date = request.getString_from_date();
		setFrom_Date(approved_from_date);

		return SUCCESS;
	}
}
