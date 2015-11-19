package com.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class HelloAction {
	private String name;

	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String logged_in_user = request.getUserPrincipal().getName();
		setName(logged_in_user);
		ProfileDao info = new ProfileDao();
		info.setName(logged_in_user);
		return "SUCCESS";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}