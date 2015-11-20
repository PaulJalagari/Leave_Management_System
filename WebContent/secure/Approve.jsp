<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="index.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Approval Page</title>
<style>
#body {
	padding: 20px;
	font-family: Capriola, Helvetica, sans-serif;
	float: right;
	position: fixed;
	left: 300px;
}
</style>
</head>
<body>
	<s:iterator value="user_data">
		<fieldset>
			<s:property value="name" />
			<br />
			<s:property value="type_of_leave" />
			<br />
			<s:property value="string_from_date" />
			<br />
			<s:property value="string_to_date" />
			<br />
			<s:property value="status" />
			<br />
		</fieldset>
	</s:iterator>
	<div id="body">
	<a href='approve'><span>Approve</span></a>
	</div>
</body>
</html>