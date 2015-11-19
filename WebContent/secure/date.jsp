<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<sx:head />
<title>Leave Dates</title>
<jsp:include page="index.jsp"></jsp:include>
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

#button {
	border-radius: 0.5em; /* increased border-radius */
	text-decoration: none;
	float: right;
	color: white; /* changed text color to white */
	padding: 0.3em 1em; /* increased padding for a larger button */
	background-color: #329bd8;
	/* changed background color to a nice blue */
	font-family: Capriola, Helvetica, sans-serif;
}

#button:hover {
	background-color: transparent; /* changed the bg-color to transparent */
	border: 0.15em #329bd8 solid; /* set a border to a blue color */
	color: #329bd8; /* set a text color to the same color */
}

#button:active {
	background-color: transparent;
	border: 0.15em #5e8ca5 solid;
	color: #5e8ca5; /* minor text color change in a deeper blue */
}
</style>
</head>
<body>
	<div id="dates">
		<s:form action="dateAction" namespace="/" method="POST">
			<s:select name="type" label="Type of Leave" headerKey="-1"
				headerValue="Select Type"
				list="#{'Vacation':'Vacation', 'Sick':'Sick', 'Leave Without Pay':'Leave Without Pay', 'Casual':'Casual'}"
				 value="Vacation" />

			<sx:datetimepicker name="date1" label="From "
				displayFormat="dd-MMM-yyyy" value="todayDate"/>
			<br />

			<sx:datetimepicker name="date2" label="To "
				displayFormat="dd-MMM-yyyy" value=" "/>
			<br />
			<br />
			<s:submit value="submit" name="submit" id="button" />

		</s:form>
	</div>
</body>
</html>