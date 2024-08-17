<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.Duration" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.temporal.ChronoUnit" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Post Workout</title>
    <link rel="stylesheet" href="/css/PostWorkout.css"/>
</head>
<body>
      <jsp:include page="Navbar.jsp"/>
<div class="postworkout">
    <div class="postbox">
        <h1>Post Workout</h1>
   
        <form method="post" action="/postworkout">
         
           <!-- <label>Workout Type</label><br> -->
            <select name="workouttype"class="form-control">
                <option>-- Select Workout --</option>
                <option>Running</option>
                <option>Walking</option>
                <option>Treadmillrun</option>
                <option>Elliptical</option>
                <option>Stairmaster</option>
                <option>Weightlifting</option>
                <option>Swimming</option>
                <option>Bodyweightexcercises</option>
   
            </select>
        
              <br>
       
            <label>Date</label>
            <input type="date" class="form-control"name="date"/><br>
            <label>Distance (Miles)</label>
            <input type="number" class="form-control"name="distance"/><br>
            <label>Time</label> 
            <input type="time" class="form-control"name="time"/><br>

             <!--this wont post on the post workout page. ASCII value or <time></time>-->
            <label>Duration</label>
            <select name="duration"class="form-control">
                <option>-- Select Time--</option>
                <option>10 min</option>
                <option>20 min</option>
                <option>30 min</option>
                <option>40 min</option>
                <option>50 min</option>
                <option>60 min</option>
                <option>1 hr 10 min</option>
                <option>1 hr 20 min</option>
                <option>1 hr 30 min</option>
                <option>1 hr 40 min</option>
                <option>1 hr 50 min</option>
                <option>2 hrs</option>
            </select><br>
    
            <div>
            <button type="Submit"class="btn btn-primary" href="/workouts">Submit</button>
            </div>
    
        </div>
    </div>
</form>
</body>
