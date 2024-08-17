<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Workout Details</title>
    <link rel="stylesheet" href="/css/WorkoutDetails.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>

    <div class="workoutdetailspage">
    <div class="workouts">

    
       
        <div class="workoutdetails">
    
            <p><br><br>Workout Type: ${WorkoutDetails.workouttype}</p><br>
            <p>Date: ${WorkoutDetails.date}</p><br>
            <p>Time: ${WorkoutDetails.time} a.m.</p><br>
            <p>Distance: ${WorkoutDetails.distance} miles</p><br>
            <p>Duration: ${WorkoutDetails.duration}</p><br><br>
           <a href="/workouts"><div class="submitbutton" style="padding-left:50px">
            <button class="btn btn-primary">Back to workouts</button>
            </div></a>
        
 
        
       
    
    
    </div>    
    </div>
</body>
</html>