<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page import="java.security.Principal" %>
<html>
<body>

Hello ADMIN<h1> <s:property value="name" /></h1> .You are seeing a secured Page now.

	
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
 
</body>
</html>