<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>

	<form:form action="register-user" method="POST" modelAttribute="user">
		<form:input path="firstName" /><br />
		<form:input path="lastName" /><br />
		<form:input path="age" /><br />
		<form:radiobutton path="gender" value="Male" /> Male | 
		<form:radiobutton path="gender" value="Female" /> Female<br />
		<input type="submit" value="Register" />
	</form:form>







</body>
</html>