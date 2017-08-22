<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<html>
<head>
	<title>Login</title>
	<style>
		.error{
			color:red;
		}
	</style>
</head>

<body>
	<h2>Login</h2>

	<i>Fields with an (*) are required.</i><br><br>
	<form:form method="GET" action="processForm" modelAttribute="customer" >
		First Name*: <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" /><br><br>
		Last Name*: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" /><br><br>
		Password*:  <form:password path="password" />
		<form:errors path="password" cssClass="error" /><br><br>
		
		<input type="submit" value="Login" />
	</form:form>
</body>

</html>