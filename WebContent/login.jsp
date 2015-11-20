<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
<style>
html {
	background: url(secure/final.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}

.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}

#input {
	position: absolute;
	left: 500px;
	width: 250px;
	float: left;
	padding: 40px;
	font-family: Capriola, Helvetica, sans-serif;
	font-weight: bold;
	font-size: 50px;
}

#body {
	padding: 20px;
	font-family: Capriola, Helvetica, sans-serif;
	float: right;
	position: fixed;
	left: 300px;
}
</style>
</head>
<body onload='document.f.j_username.focus();' class="input">

	<%
		String error = request.getParameter("error");
		if (error != null) {
	%>

	<div class="errorblock">
		Your login attempt was not successful, try again.<br /> Caused :

	</div>

	<%
		}
	%>
	<div id="body">
		<h3>Please Login to continue</h3>
		<form name='f' action="<c:url value='/j_spring_security_check'/>"
			method='POST'>

			<table>
				<tr>
					<td>Username:</td>
					<td><input type='text' name='j_username' value=''></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='j_password' /></td>
				</tr>
				<tr>
					<td colspan='2'><input name="submit" type="submit"
						value="submit" /></td>
				</tr>
				<tr>
					<td colspan='2'><input name="reset" type="reset" /></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>
