<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.security.Principal"%>
<html>
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<title>Leave Management System</title>

</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<div id="body">
		Welcome,
		<s:property value="name" />
	</div>
	
</body>
</html>