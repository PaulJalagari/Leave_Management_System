<!DOCTYPE html>
<html>
<head>
<style>
</style>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<%@ taglib uri="/struts-tags" prefix="s"%>



	<div id="body">
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
			

		</s:iterator>
	</div>

	

</body>
</html>
