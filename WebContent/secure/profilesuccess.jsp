<!DOCTYPE html>
<html>
<head>
<style>

</style>
</head>
<body>
	
	<%@ taglib uri="/struts-tags" prefix="s"%>

	

	<div id="section">
		<s:iterator value="list">
			ID No : <s:property value="id" />
			<br />
			<br />
			
			Name : <s:property value="name" />
			<br />
			<br />
			Desk : <s:property value="password" />
			<br />
			<br />
			Email : <s:property value="email" />
			<br />
			<br />
			<hr>	
			
		</s:iterator>
	</div>

	<div id="footer">Paul Jalagari</div>

</body>
</html>
