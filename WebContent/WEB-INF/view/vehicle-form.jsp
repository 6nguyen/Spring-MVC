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
	<!-- When Spring form loaded, Spring MVC calls myVehicle.getNumWheels()
			and myVehicle.getMake() 
		 When we submit the data, Spring MVC calls myVehicle.setNumWheels()
		 	and myVehicle.setMake()	
	-->
		<!-- modelAttribute="name of model attr set in Controller" -->
		<!-- path="name of member variable in Vehicle class" -->
	<form:form method="GET" action="processForm" modelAttribute="vehicle" >
	
		Number of Wheels: <form:input path="numWheels" />
		<br>
		Make:  <form:input path="make" />
		<br/>
		
		Vehicle Class: 
		<form:select path="vehicleClass">
			<form:options items="${vehicle.vehicleOptions}" />
			
			<%-- <form:option value="Economy" label="Economy"/>
			<form:option value="Sport" label="Sport"/>
			<form:option value="Electric" label="Electric"/> --%>
		</form:select>
		<br/>
		
		<input type="submit" value="Register" />
	
	</form:form>

</body>

</html>