<!-- Import Spring tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
<title>Vehicle Form</title>
</head>

<body>
	<h2>Vehicle Registration Form</h2>
	
	<!-- Spring form tag -->
	<!-- When Spring form loaded, Spring MVC calls myMotorcycle.getNumWheels()
			and myMotorcycle.getMake() 
		 When we submit the data, Spring MVC calls myMotorcycle.setNumWheels()
		 	and myMotorcycle.setMake()	
	-->
		<!-- modelAttribute="name of model attr set in Controller" -->
		<!-- path="name of member variable in Vehicle class" -->
	<form:form method="GET" action="processForm" modelAttribute="motorcycle" >
	
		Number of Wheels: <form:input path="numWheels" />
		<br>
		Make:  <form:input path="make" />
		<br/>
		<input type="submit" value="Register" />
	
	</form:form>

</body>

</html>