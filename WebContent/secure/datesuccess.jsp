<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="index.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Date Success</title>
<style type="text/css">
#dates {
	position: absolute;
	left: 300px;
	width: 350px;
	float: left;
	padding: 10px;
	font-family: Capriola, Helvetica, sans-serif;
	display: table;
}
</style>
</head>
<body>
	<div id="dates">
		<h2>Leave request sent!!</h2>
		<br /> <br /> Request Summary <br /> <br /> Name:
		<s:property value="name" />
		<br /> <br /> Type of Leave :
		<s:property value="type" />
		<br /> <br /> From :
		<s:property value="date1" />
		<br /> <br /> To :
		<s:property value="date2" />
		<br /> <br />Status:
		<s:property value="Status" />

	</div>
</body>
</html>