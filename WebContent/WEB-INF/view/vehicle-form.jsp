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
		<!-- items returns our list of vehicleOptions in the Vehicle class -->
		<form:select path="vehicleClass">
			<form:options items="${vehicle.vehicleOptions}" />
		</form:select>
		<br/>
		
		Color:
		<form:select path="vehicleColor" >
			<form:options items="${colorOptions}" />
		</form:select>
		<br/>
		
		Manufactured in:
		<form:select path="vehicleCountry" >
			<form:options items="${countryOptions}" />
		</form:select>
		<br/>
		
		<!-- form:radiobutton calls vehicle.setPriceRange() -->
		Price Range:
		<form:radiobutton path="priceRange" value="Under $10,000" />Under $10,000  
		<form:radiobutton path="priceRange" value="$10,000-$15,000" />$10,000-$15,000  
		<form:radiobutton path="priceRange" value="$15,000 and above" />$15,000 and above   
		
		<br><br>
		<input type="submit" value="Register" />
	
	</form:form>

</body>

</html>