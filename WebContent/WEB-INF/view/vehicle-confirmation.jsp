<!DOCTYPE html>

<html>
<head>
	<title>Vehicle Confirmation</title>
</head>

<body>
	<h2>Vehicle Confirmation</h2>
	
	The vehicle has been registered.
	<br><br>
	Number of wheels: ${vehicle.numWheels}
	<br>
	Make: ${vehicle.make}
	<br>
	Color: ${vehicle.vehicleColor}
	<br>
	Manufactured in: ${vehicle.getVehicleCountry()}
	<br>
	Price: ${vehicle.priceRange}
	
</body>

</html>