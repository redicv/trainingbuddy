<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/ScheduleWorkout.css"/>
    <title>Schedule Workout</title>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>

    <div class="schedule">
        <div class="schedulebox">
            <h1>Schedule Workout</h1>
    <form method="post" action="/scheduleworkout">

            <label>Date</label>
            <input type="date" class="form-control"name="date"/><br>
            <label>Time</label> 
            <input type="time" class="form-control"name="time"/><br>
            <label>Duration</label>
              <select name="duration"class="form-control">
                    <option>-- Select Time--</option>
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
                <label>Location</label>
                <input type="location" class="form-control"name="location"/><br>


    </form>
</body>
</html>